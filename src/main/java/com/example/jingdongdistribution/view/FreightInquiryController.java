package com.example.jingdongdistribution.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.jingdongdistribution.dao.JdDao;
import com.example.jingdongdistribution.model.Columns;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FreightInquiryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker StartTimePicker;

    @FXML
    private TextField PowerOfAttorneyNumberText;

    @FXML
    private Label StartTime;

    @FXML
    private TextField ConsignmentNoteNumberText;

    @FXML
    private Label PowerOfAttorneyNumber;

    @FXML
    private Label ConsignmentNoteNumber;

    @FXML
    private Button BillingDetails;

    @FXML
    private Button FreightInquiryBtn;

    @FXML
    private Label Freight;

    JdDao dao = new JdDao();
    ResultSet rs = null;

    @FXML
    void BillingDetailsBtn(ActionEvent event) {
        String Poan = PowerOfAttorneyNumberText.getText().trim();
        String Cnn = ConsignmentNoteNumberText.getText().trim();


        File file=new File("datab.txt");
        PrintWriter output= null;
        try {
            output = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        output.println(PowerOfAttorneyNumberText.getText());
        output.println(ConsignmentNoteNumberText.getText());
        output.close();

        if(Poan.length()!=0&&Cnn.length()!=0){
//            FXMLLoader loader=new FXMLLoader(this.getClass().getResource("BillingInqiry.fxml"));
//
//            //???????????????????????????
//            AdjustController adjustController=loader.getController();

            AnchorPane anchorPane = null;
            try {
                anchorPane = FXMLLoader.load(this.getClass().getResource("BillingInquiry.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }

//            adjustController.PowerOfAttorneyNumberText.setText(PowerOfAttorneyNumberText.getText());
//            adjustController.ConsignmentNoteNumberText.setText(ConsignmentNoteNumberText.getText());
            Scene scene = new Scene(anchorPane);
//            String cssPath = this.getClass().getResource("view/FreightAccount.fxml").toExternalForm();
//            scene.getStylesheets().add(cssPath);
            Stage stage=new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }



    @FXML
    void FreightInquiry(ActionEvent event) {


        //???????????????
        //?????????????????????????????????????????????????????????????????????????????????????????????????????????
        //?????????

        String Poan = PowerOfAttorneyNumberText.getText().trim();
        String Cnn = ConsignmentNoteNumberText.getText().trim();

        //?????????????????????????????????
        double totalVolume = 0;
        double totalWeight = 0;
        double volume = 0;
        double weight = 0;
        double vweight;//????????????????????????????????????
        double goodsvolume=0;
        String ModeofTransportion = null;
        double freight = 0;//?????????
        double goodsfreight = 0;
        double Weight;//????????????
        double Vweight = 0;//????????????
        double MinFreight = 5000;//????????????
        double settlementFreightShare;//??????????????????
        double subpickupcostshare;//???????????????
        double goodssubpickupcostshare = 0;
        double totalsubpickupcostshare = 0;//??????????????????
        double premiums;//??????
        double declarevalue = 0;//????????????
        double premiumrate = 0;//??????
        double airportpickupfee;//???????????????
        double totalairportpickupfee = 0;//??????????????????
        double totalpremiums = 0;//?????????
        double goodsairportpickupfee = 0;
        double goodspremiumrate = 0;
        double goodsdeclarevalue = 0;
        double goodspremiums = 0;
        double lostdeduction = 0;//????????????
        double totallostdeduction = 0;
        double goodslostdeduction = 0;
        double damageddeduction = 0;//????????????
        double totaldamageddeduction = 0;
        double goodsdamageddeduction = 0;
        double otherdeduction = 0;//????????????
        double totalotherdeduction = 0;
        double goodsotherdeduction = 0;
        String typeofservice = null;
        System.out.println(Poan+Cnn);

        if (Poan.length()==0 && Cnn.length()==0) {
            Freight.setVisible(true);
            Freight.setText("????????????");
        }
        else {
            System.out.println("?????????");
            //?????????????????????????????????????????????????????????????????????????????????(????????????????????????)


            String sql = "select * from jd " +
                    "where PowerOfAttorneyNumber='" + PowerOfAttorneyNumberText.getText().trim() + "' and " +
                    "ShipperNumber='" + ConsignmentNoteNumberText.getText().trim() + "'";
            System.out.println(sql);
            rs = dao.selectsetSql(sql);
            System.out.println(rs);
            //??????????????????????????????,???????????????
            if (rs != null) {
                try {
                    rs.next();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    typeofservice = rs.getString("TypeOfService");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                System.out.println(typeofservice);

                if (typeofservice.compareTo( "??????") ==0){

                    //??????????????????
                    try {
                        goodssubpickupcostshare = rs.getDouble("SecondaryPickupFee");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println(goodssubpickupcostshare);
                    //?????????????????????,??????15/kg

                    try {
                        double goodsweight = rs.getDouble("Weight");
                        goodsairportpickupfee = goodsweight * 15.0;
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println(goodsairportpickupfee);


                    //??????


                    try {
                        goodspremiumrate = rs.getDouble("PremiumRate");
                        goodsdeclarevalue = rs.getDouble("DeclareValue");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    goodspremiums = goodspremiumrate * goodsdeclarevalue;
                    System.out.println(goodspremiums);

                    //????????????,???????????????????????????
                    try {
                        goodslostdeduction = rs.getDouble("LostDeduction");
                        goodsdamageddeduction = rs.getDouble("DamagedDeduction");
                        goodsotherdeduction = rs.getDouble("OtherDeduction");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println(goodsdamageddeduction);
                    System.out.println(goodslostdeduction);
                    System.out.println(goodsotherdeduction);


                    sql = "select * from jd";
                    rs = dao.selectsetSql(sql);
                    System.out.println(sql);
                    try {
                        rs.next();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
//                    while (true) {
//                        try {
//                            if (!rs.next()) break;
//                            lostdeduction = rs.getDouble("LostDeduction");
//                            damageddeduction = rs.getDouble("DamagedDeduction");
//                            otherdeduction = rs.getDouble("OtherDeduction");
//                            declarevalue = rs.getDouble("DeclareValue");
//                            premiumrate = rs.getDouble("PremiumRate");
//                            subpickupcostshare = rs.getDouble("SecondaryPickupFee");
//                            volume = rs.getDouble("Volume");
//                            weight = rs.getDouble("Weight");
//                            totallostdeduction += lostdeduction;
//                            totaldamageddeduction += damageddeduction;
//                            totalotherdeduction += otherdeduction;
//                            premiums = declarevalue * premiumrate;
//                            totalpremiums += premiums;
//                            totalsubpickupcostshare += subpickupcostshare;
//                            totalVolume += volume;
//                            totalWeight += weight;
//
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
 //                   }
                    //?????????
                    String[] SQL=new String[7];
                    SQL[0]="select sum(LostDeduction) from jd";
                    SQL[1]="select sum(DamagedDeduction) from jd";
                    SQL[2]="select sum(OtherDeduction) from jd";
                    SQL[3]="select sum(SecondaryPickupFee) from jd";
                    SQL[4]="select sum(DeclareValue*PremiumRate) from jd";
                    SQL[5]="select sum(Volume) from jd";
                    SQL[6]="select sum(Weight) from jd";



                    rs=dao.selectsetSql(SQL[0]);
                    try {
                        if (rs.next()) {
                               totallostdeduction= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[1]);
                    try {
                        if (rs.next()) {
                            totaldamageddeduction= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[2]);
                    try {
                        if (rs.next()) {
                            totalotherdeduction= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[3]);
                    try {
                        if (rs.next()) {
                            totalsubpickupcostshare= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[4]);
                    try {
                        if (rs.next()) {
                            totalpremiums= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[5]);
                    try {
                        if (rs.next()) {
                            totalVolume= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    rs=dao.selectsetSql(SQL[6]);
                    try {
                        if (rs.next()) {
                            totalWeight= rs.getDouble(1);
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }





                    //??????????????????
                    Vweight = totalWeight / totalVolume;
                    System.out.println(totalWeight);
                    System.out.println(totalVolume+"11111");
                    System.out.println(Vweight);


                    //??????????????????
                    if (Vweight >= totalWeight) {
                        Weight = Vweight;
                    } else {
                        Weight = totalWeight;
                    }
                    //????????????????????????
                    totalairportpickupfee = totalWeight * 15;


                    //??????????????????
                    //??????????????????????????????
                    sql = "select * from jd " +
                            "where PowerOfAttorneyNumber='" + PowerOfAttorneyNumberText.getText().trim() + "'" +
                            " and ShipperNumber='" + ConsignmentNoteNumberText.getText().trim() + "' ";
                    System.out.println(sql);
                    rs = dao.selectsetSql(sql);
                    //??????????????????
                    double settlementFreight = 0;

                    try {
                        rs.next();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //??????????????????
                    try {
                        ModeofTransportion = rs.getString("ModeOfTransport");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    //??????????????????50
                    if (ModeofTransportion.compareTo( "????????????")==0) {
                        settlementFreight = 50.0 * Weight;
                        if (settlementFreight < MinFreight)
                            settlementFreight = MinFreight;
                    }
                    //??????????????????20
                    if (ModeofTransportion.compareTo( "????????????")==0) {
                        settlementFreight = 20.0 * Weight;
                        if (settlementFreight < MinFreight)
                            settlementFreight = MinFreight;

                    }
                    //??????????????????40
                    if (ModeofTransportion.compareTo("????????????")==0) {
                        settlementFreight = 20.0 * Weight;
                        if (settlementFreight < MinFreight)
                            settlementFreight = MinFreight;
                    }
                    //??????????????????12
                    if (ModeofTransportion.compareTo("????????????")==0) {
                        settlementFreight = 20.0 * Weight;
                        if (settlementFreight < MinFreight)
                            settlementFreight = MinFreight;
                    }
                    try {
                        volume = rs.getDouble("Volume");
                        weight = rs.getDouble("Weight");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    //??????????????????
                    vweight = weight / volume;
                    //??????????????????
                    settlementFreightShare = settlementFreight * (vweight / Vweight);
                    System.out.println(settlementFreight);
                    System.out.println(vweight);
                    System.out.println(Vweight);
                    //????????????????????????
                    try {
                        subpickupcostshare = rs.getDouble("SecondaryPickupFee");

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    System.out.println(settlementFreightShare);
                    //???????????????,????????????
                    if (ModeofTransportion.compareTo("????????????")==0) {
                        freight = settlementFreight + totalsubpickupcostshare + totalairportpickupfee +
                                totalpremiums - totallostdeduction - totaldamageddeduction - totalotherdeduction;

                        goodsfreight = settlementFreightShare + goodssubpickupcostshare + goodsairportpickupfee +
                                goodspremiums - goodslostdeduction - goodsdamageddeduction - goodsotherdeduction;
                    } else {
                        freight = settlementFreight + totalairportpickupfee + totalpremiums - totallostdeduction -
                                totaldamageddeduction - totalotherdeduction;

                        goodsfreight = settlementFreightShare + goodssubpickupcostshare +
                                goodspremiums - goodslostdeduction - goodsdamageddeduction - goodsotherdeduction;
                    }
                    System.out.println(settlementFreightShare);


                    //??????
                    Freight.setText("???????????????:" + goodsfreight + "   ???????????????" + freight);
                    Freight.setVisible(true);
                    System.out.println(Freight.getText());

                }

                if (typeofservice == "??????") {
                    String vehicletype = null;

                    try {
                        goodsvolume = rs.getDouble("Volume");
                        vehicletype = rs.getString("VehicleType");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    //???????????????
                    sql = "select * from testjd where ShipperNumberNumber=" + ConsignmentNoteNumberText.getText().trim() + " ";
                    rs = dao.selectsetSql(sql);

                    while (true) {
                        try {
                            if (!rs.next()) break;

                            volume = rs.getDouble("Volume");
                            totalVolume += volume;

                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    //??????10000
                    if (vehicletype == "?????????") {
                        freight = 10000.0 * totalVolume;
                        goodsfreight = freight * (goodsvolume / totalVolume);

                    }
                    //??????8000
                    else if (vehicletype == "?????????") {
                        freight = 8000.0 * totalVolume;
                        goodsfreight = freight * (goodsvolume / totalVolume);
                    }
                    //??????2000
                    else if (vehicletype == "?????????") {
                        freight = 2000.0 * totalVolume;
                        goodsfreight = freight * (goodsvolume / totalVolume);
                    }

                    //??????
                    Freight.setText("???????????????:" + (int)goodsfreight + "   ???????????????" + (int)freight);
                    Freight.setVisible(true);

                }
            }
            //??????????????????????????????
            else {
                Freight.setVisible(true);
                Freight.setText("????????????");
                System.out.println("????????????");
            }
        }
        }



    @FXML
    void initialize() {
        assert StartTimePicker != null : "fx:id=\"StartTimePicker\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert PowerOfAttorneyNumberText != null : "fx:id=\"PowerOfAttorneyNumberText\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert StartTime != null : "fx:id=\"StartTime\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert ConsignmentNoteNumberText != null : "fx:id=\"ConsignmentNoteNumberText\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert PowerOfAttorneyNumber != null : "fx:id=\"PowerOfAttorneyNumber\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert ConsignmentNoteNumber != null : "fx:id=\"ConsignmentNoteNumber\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert BillingDetails != null : "fx:id=\"BillingDetails\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert FreightInquiryBtn != null : "fx:id=\"FreightInquiryBtn\" was not injected: check your FXML file 'FreightInquiry.fxml'.";
        assert Freight != null : "fx:id=\"Freight\" was not injected: check your FXML file 'FreightInquiry.fxml'.";

    }
}

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
import com.example.jingdongdistribution.model.Courier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FreightAccountController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Columns, String> PoanColumn;

    @FXML
    private TableColumn<Columns, String> CnnColumn;

    @FXML
    private DatePicker StartTimePicker;

    @FXML
    private DatePicker EndTimePicker;

    @FXML
    private Label EndTime;

    @FXML
    private TableColumn<Columns, Number> OdColumn;

    @FXML
    private Button EnquiryBtn;

    @FXML
    private TextArea PowerOfAttorneyNumberText;

    @FXML
    private TextField ConsignmentNoteNumberText;

    @FXML
    private Label StartTime;

    @FXML
    private TableColumn<Columns, Number> SfColumn;

    @FXML
    private Label PowerOfAttorneyNumber;

    @FXML
    private ChoiceBox<?> CourierChoiceBox;

    @FXML
    private Label ConsignmentNoteNumber;
//
//    @FXML
//    private Button DeriveBtn;

    @FXML
    private TableColumn<Columns, String> OdrColumn;

    @FXML
    private TableColumn<Columns, Number> DdColumn;

    @FXML
    private HBox HB1;

    @FXML
    private Button AdjustBtn;

    @FXML
    private HBox HB3;

    @FXML
    private HBox HB2;

    @FXML
    private HBox HB5;

    @FXML
    private HBox HB4;

    @FXML
    private Label Courier;

    @FXML
    private Label tip;

    @FXML
    private TableView<Columns> tableview;

    private ObservableList<Columns> columnsData = FXCollections.observableArrayList();

    //private ObservableList<Courier> courierData = FXCollections.observableArrayList();
    JdDao dao = new JdDao();
    ResultSet rs = null;

//    @FXML
//    void Derive(ActionEvent event) {
//
//    }

    @FXML
    void StartTimePick(ActionEvent event) {

    }

    @FXML
    void EndTimePick(ActionEvent event) {

    }

    //假定一份委托书对应一份托运单号对应一个承运商对应一个时间段
    @FXML
    void Enquiry(ActionEvent event) {
        String Poan = PowerOfAttorneyNumberText.getText().trim();
        String Cnn = ConsignmentNoteNumberText.getText().trim();
        if (Poan == null || Cnn == null) {
            tip.setVisible(true);
            tip.setText("不能为空");
        } else {

            String sql = "select * from jd where PowerOfAttorneyNumber='" + Poan + "' and ShipperNumber='" + Cnn + "'";
            rs = dao.selectsetSql(sql);
            System.out.println(rs);
            //若查到则显示在表中
            if (rs != null) {
                try {
                    rs.next();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    columnsData.add(new Columns(PowerOfAttorneyNumberText.getText(),
                            ConsignmentNoteNumberText.getText(),
                            rs.getDouble("SecondaryPickupFee"),
                            rs.getDouble("DamagedDeduction"),
                            rs.getDouble("OtherDeduction"),
                            rs.getString("OtherDeductionReason")));

                    PoanColumn.setCellValueFactory(cellData -> cellData.getValue().poanProperty());
                    CnnColumn.setCellValueFactory(cellData -> cellData.getValue().cnnProperty());
                    SfColumn.setCellValueFactory(cellData -> cellData.getValue().sfProperty());
                    DdColumn.setCellValueFactory(cellData -> cellData.getValue().ddProperty());
                    OdColumn.setCellValueFactory(cellData -> cellData.getValue().odProperty());
                    OdrColumn.setCellValueFactory(cellData -> cellData.getValue().odrProperty());

                    tableview.setItems(columnsData);
                } catch (SQLException e) {
                    e.printStackTrace();
                }


        }
        //若查询失败则显示失败
         else{
            tip.setVisible(true);
            tip.setText("查询失败");
        }

    }

}

    @FXML
    void Adjust(ActionEvent event) {
        tableview.getSelectionModel()
                .selectedItemProperty()
                .addListener((observable,oldValue,newValue)-> show(newValue,event) );


    }

    private void show(Columns columns,ActionEvent event) {

        File file=new File("datas.txt");
        PrintWriter output= null;
        try {
            output = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        output.println(PowerOfAttorneyNumberText.getText());
        output.println(ConsignmentNoteNumberText.getText());
        output.close();
        AnchorPane anchorPane = null;
        try {
            anchorPane = FXMLLoader.load(this.getClass().getResource("Adjust.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(anchorPane);

        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();



    }

    @FXML
    void initialize() {
        assert PoanColumn != null : "fx:id=\"PoanColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert CnnColumn != null : "fx:id=\"CnnColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert StartTimePicker != null : "fx:id=\"StartTimePicker\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert EndTimePicker != null : "fx:id=\"EndTimePicker\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert EndTime != null : "fx:id=\"EndTime\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert OdColumn != null : "fx:id=\"OdColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert EnquiryBtn != null : "fx:id=\"EnquiryBtn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert PowerOfAttorneyNumberText != null : "fx:id=\"PowerOfAttorneyNumberText\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert ConsignmentNoteNumberText != null : "fx:id=\"ConsignmentNoteNumberText\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert StartTime != null : "fx:id=\"StartTime\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert SfColumn != null : "fx:id=\"SfColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert PowerOfAttorneyNumber != null : "fx:id=\"PowerOfAttorneyNumber\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert CourierChoiceBox != null : "fx:id=\"CourierChoiceBox\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert ConsignmentNoteNumber != null : "fx:id=\"ConsignmentNoteNumber\" was not injected: check your FXML file 'FreightAccount.fxml'.";
       // assert DeriveBtn != null : "fx:id=\"DeriveBtn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert OdrColumn != null : "fx:id=\"OdrColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert DdColumn != null : "fx:id=\"DdColumn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert HB1 != null : "fx:id=\"HB1\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert AdjustBtn != null : "fx:id=\"AdjustBtn\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert HB3 != null : "fx:id=\"HB3\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert HB2 != null : "fx:id=\"HB2\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert HB5 != null : "fx:id=\"HB5\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert HB4 != null : "fx:id=\"HB4\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert Courier != null : "fx:id=\"Courier\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert tableview != null : "fx:id=\"tableview\" was not injected: check your FXML file 'FreightAccount.fxml'.";
        assert tip != null : "fx:id=\"label\" was not injected: check your FXML file 'FreightAccount.fxml'.";
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        }

    }







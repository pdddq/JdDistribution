package com.example.jingdongdistribution.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.example.jingdongdistribution.dao.JdDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class AdjustController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    TextArea PowerOfAttorneyNumberText;

    @FXML
    TextField ConsignmentNoteNumberText;

    @FXML
    private Label ConsignmentNoteNumber4;

    @FXML
    private Label PowerOfAttorneyNumber;

    @FXML
    private TextField ConsignmentNoteNumberText1;

    @FXML
    private Label ConsignmentNoteNumber;

    @FXML
    private TextField ConsignmentNoteNumberText2;

    @FXML
    private TextField ConsignmentNoteNumberText3;

    @FXML
    private TextField ConsignmentNoteNumberText4;

    @FXML
    private Label ConsignmentNoteNumber3;

    @FXML
    private Label Odf;

    @FXML
    private TextField ConsignmentNoteNumberText5;

    @FXML
    private TextField ConsignmentNoteNumberText6;

    @FXML
    private Label Sf;

    @FXML
    private Label Od;

    @FXML
    private Label tip;

    @FXML
    private HBox HB1;

    @FXML
    private HBox HB21;

    @FXML
    private HBox HB2;

    @FXML
    private HBox HB23;

    @FXML
    private HBox HB22;

    @FXML
    private HBox HB25;

    @FXML
    private HBox HB24;

    @FXML
    private Label Cfb;

    @FXML
    private HBox HB26;

    @FXML
    void initialize() {
        assert PowerOfAttorneyNumberText != null : "fx:id=\"PowerOfAttorneyNumberText\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText != null : "fx:id=\"ConsignmentNoteNumberText\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumber4 != null : "fx:id=\"ConsignmentNoteNumber4\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert PowerOfAttorneyNumber != null : "fx:id=\"PowerOfAttorneyNumber\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText1 != null : "fx:id=\"ConsignmentNoteNumberText1\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumber != null : "fx:id=\"ConsignmentNoteNumber\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText2 != null : "fx:id=\"ConsignmentNoteNumberText2\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText3 != null : "fx:id=\"ConsignmentNoteNumberText3\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText4 != null : "fx:id=\"ConsignmentNoteNumberText4\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumber3 != null : "fx:id=\"ConsignmentNoteNumber3\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert Odf != null : "fx:id=\"Odf\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText5 != null : "fx:id=\"ConsignmentNoteNumberText5\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert ConsignmentNoteNumberText6 != null : "fx:id=\"ConsignmentNoteNumberText6\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert Sf != null : "fx:id=\"Sf\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert Od != null : "fx:id=\"Od\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB1 != null : "fx:id=\"HB1\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB21 != null : "fx:id=\"HB21\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB2 != null : "fx:id=\"HB2\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB23 != null : "fx:id=\"HB23\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB22 != null : "fx:id=\"HB22\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB25 != null : "fx:id=\"HB25\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB24 != null : "fx:id=\"HB24\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert Cfb != null : "fx:id=\"Cfb\" was not injected: check your FXML file 'Adjust.fxml'.";
        assert HB26 != null : "fx:id=\"HB26\" was not injected: check your FXML file 'Adjust.fxml'.";

    }
    JdDao dao=new JdDao();
    ResultSet rs=null;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File file=new File("datas.txt");
        Scanner input=null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            PowerOfAttorneyNumberText.setText(input.next());
            ConsignmentNoteNumberText.setText(input.next());
        }

        String sql = "select * from jd where PowerOfAttorneyNumber='"+PowerOfAttorneyNumberText.getText().trim()+"'" +
                "and ShipperNumber='"+ ConsignmentNoteNumberText.getText().trim()+"'";
        System.out.println(sql);
        rs = dao.selectsetSql(sql);
        if (rs!=null) {
            //显示数据
            System.out.println(sql);
            try {
                rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                ConsignmentNoteNumberText1.setText(String.valueOf(rs.getDouble("SecondaryPickupFee")));
                ConsignmentNoteNumberText3.setText(String.valueOf(rs.getDouble("OtherDeduction")));
                ConsignmentNoteNumberText5.setText(rs.getString("OtherDeductionReason"));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public void Ok(ActionEvent actionEvent) {
        String sql = "select PowerOfAttorneyNumber,ShipperNumber from jd where PowerOfAttorneyNumber='"+PowerOfAttorneyNumberText.getText().trim()+"'" +
                " and ShipperNumber='"+ ConsignmentNoteNumberText.getText().trim()+"'";

        int n = -1;
        System.out.println(sql);
        rs = dao.selectsetSql(sql);
        if (rs != null) {
            sql = "update jd set SecondaryPickupFee='" + ConsignmentNoteNumberText2.getText().trim() + "'," +
                    "OtherDeduction='" + ConsignmentNoteNumberText4.getText().trim() + "'," +
                    "OtherDeductionReason='" + ConsignmentNoteNumberText6.getText().trim() + "' where PowerOfAttorneyNumber=" +
                    "'" + PowerOfAttorneyNumberText.getText().trim() + "'";
            System.out.println(sql);
            n = dao.addUpdDel(sql);
            if (n == -1) {
                System.out.println("修改失败");
            } else
                tip.setText("修改成功！");
        }
    }
}

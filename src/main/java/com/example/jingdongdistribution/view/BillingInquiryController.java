package com.example.jingdongdistribution.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

import com.example.jingdongdistribution.dao.JdDao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BillingInquiryController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label St;

    @FXML
    private Label Cnn;

    @FXML
    private VBox vb1;

    @FXML
    private TextField CText;

    @FXML
    private VBox vb2;

    @FXML
    private TextField WeightText;

    @FXML
    private TextField volumeText;

    @FXML
    private Label Carrier;

    @FXML
    private Label pfreight;

    @FXML
    private Label sfreight;

    @FXML
    private TextField SrText;

    @FXML
    private TextField StText;

    @FXML
    private Label Poan;

    @FXML
    private Label Weight;

    @FXML
    private Label volume;

    @FXML
    private TextField PoanText;

    @FXML
    private TextField TosText;

    @FXML
    private HBox hb1;

    @FXML
    private HBox hb3;

    @FXML
    private HBox hb2;

    @FXML
    private Label Tos;

    @FXML
    private HBox hb;

    @FXML
    private HBox hb5;

    @FXML
    private HBox hb4;

    @FXML
    private TextField CnnText;

    @FXML
    private HBox hb7;

    @FXML
    private HBox hb6;

    @FXML
    private Label Sr;

    @FXML
    private HBox hb8;

    @FXML
    void initialize() {
        assert St != null : "fx:id=\"St\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Cnn != null : "fx:id=\"Cnn\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert vb1 != null : "fx:id=\"vb1\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert CText != null : "fx:id=\"CText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert vb2 != null : "fx:id=\"vb2\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert WeightText != null : "fx:id=\"WeightText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert volumeText != null : "fx:id=\"volumeText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Carrier != null : "fx:id=\"Carrier\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert pfreight != null : "fx:id=\"pfreight\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert sfreight != null : "fx:id=\"sfreight\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert SrText != null : "fx:id=\"SrText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert StText != null : "fx:id=\"StText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Poan != null : "fx:id=\"Poan\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Weight != null : "fx:id=\"Weight\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert volume != null : "fx:id=\"volume\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert PoanText != null : "fx:id=\"PoanText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert TosText != null : "fx:id=\"TosText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb1 != null : "fx:id=\"hb1\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb3 != null : "fx:id=\"hb3\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb2 != null : "fx:id=\"hb2\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Tos != null : "fx:id=\"Tos\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb != null : "fx:id=\"hb\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb5 != null : "fx:id=\"hb5\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb4 != null : "fx:id=\"hb4\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert CnnText != null : "fx:id=\"CnnText\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb7 != null : "fx:id=\"hb7\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb6 != null : "fx:id=\"hb6\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert Sr != null : "fx:id=\"Sr\" was not injected: check your FXML file 'BillingInquiry.fxml'.";
        assert hb8 != null : "fx:id=\"hb8\" was not injected: check your FXML file 'BillingInquiry.fxml'.";

    }
    JdDao dao=new JdDao();
    ResultSet rs=null;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //接收前一个界面的数据
        File file=new File("datab.txt");
        Scanner input=null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            PoanText.setText(input.next());
            CnnText.setText(input.next());
        }

        String sql = "select * from jd " +
                "where PowerOfAttorneyNumber=" + PoanText.getText().trim() + "" +
                " and  ShipperNumber=" + CnnText.getText().trim() + " ";

        System.out.println(sql);
        rs=dao.selectsetSql(sql);

        //显示数据
        if(rs!=null) {
            try {
                rs.next();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                CText.setText(rs.getString("SecondaryPickupFee"));
                SrText.setText(rs.getString("StartWarehouse"));
                volumeText.setText(String.valueOf(rs.getDouble("Volume")));
                WeightText.setText(String.valueOf(rs.getDouble("Weight")));
                TosText.setText(rs.getString("TypeOfService"));

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}

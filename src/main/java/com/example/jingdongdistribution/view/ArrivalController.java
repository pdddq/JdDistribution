package com.example.jingdongdistribution.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ArrivalController implements Initializable {

    public ArrivalController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void toArrivalResult() throws Exception {
        ArrivalResult arrivalResult = new ArrivalResult();
        ((ArrivalResult) arrivalResult).showWindow();


    }


    @FXML
    private ChoiceBox<?> OriginatingCitySelect;

    @FXML
    private Label OriginatingCity;

    @FXML
    private Label DestinationCity;

    @FXML
    private Label DestinationWarehouse;

    @FXML
    private Label Deadline;

    @FXML
    private Label StartTime;

    @FXML
    private Label BusinessType;

    @FXML
    private Button back;

    @FXML
    private Button check;

    @FXML
    private ChoiceBox<?> BusinessTypeSelect;

    @FXML
    private ChoiceBox<?> CarrierSelect;

    @FXML
    private TextField PowerOfAttorneyText;

    @FXML
    private ChoiceBox<?> StateSelect;

    @FXML
    private Label State;

    @FXML
    private TextField DeadlineText;

    @FXML
    private Label PowerOfAttorney;

    @FXML
    private Label Shipper;

    @FXML
    private ChoiceBox<?> DestinationCitySelect;

    @FXML
    private Label Carrier;

    @FXML
    private ChoiceBox<?> DestinationWarehouseSelect;

    @FXML
    private TextField ShipperText;

    @FXML
    private TextField StartTimeText;

}

package com.example.jingdongdistribution.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ArrivalReceiptController implements Initializable {

    public ArrivalReceiptController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void toConfirmationOfArrivalInformation() throws Exception {
        ConfirmationOfArrivalInformation confirmationOfArrivalInformation = new ConfirmationOfArrivalInformation();
        ((ConfirmationOfArrivalInformation) confirmationOfArrivalInformation).showWindow();
    }

    @FXML
    private TableColumn<?, ?> SignedBy;

    @FXML
    private ChoiceBox<?> OriginatingCitySelect;

    @FXML
    private ChoiceBox<?> TruckPartsSelect;

    @FXML
    private Button Query;

    @FXML
    private TableColumn<?, ?> PowerOfAttorney1;

    @FXML
    private Label DestinationCity;

    @FXML
    private Label DestinationWarehouse;

    @FXML
    private Label BusinessType;

    @FXML
    private TableColumn<?, ?> Waybill1;

    @FXML
    private ChoiceBox<?> TypeOfShippingSelect;

    @FXML
    private Button back;

    @FXML
    private Label Waybill;

    @FXML
    private ChoiceBox<?> CarrierSelect;

    @FXML
    private TextField PowerOfAttorneyText;

    @FXML
    private TextField WaybillSelect;

    @FXML
    private Label TruckParts;

    @FXML
    private TextField DeadlineText;

    @FXML
    private Label PowerOfAttorney;

    @FXML
    private TableColumn<?, ?> NameOfAgent;

    @FXML
    private Label Carrier;

    @FXML
    private TextField StartTimeText;

    @FXML
    private TableColumn<?, ?> DeliveryPerson;

    @FXML
    private TableColumn<?, ?> Status;

    @FXML
    private TableColumn<?, ?> BusinessType1;

    @FXML
    private TableColumn<?, ?> Action1;

    @FXML
    private Label OriginatingCity;

    @FXML
    private Label Deadline;

    @FXML
    private Label OriginatingWarehouse;

    @FXML
    private Label StartTime;

    @FXML
    private Button SignedPowerOfAttorney;

    @FXML
    private ChoiceBox<?> BusinessTypeSelect;

    @FXML
    private ChoiceBox<?> OriginatingWarehouseSelect;

    @FXML
    private TableColumn<?, ?> Carrier1;

    @FXML
    private Label TypeOfShipping;

    @FXML
    private ChoiceBox<?> DestinationCitySelect;

    @FXML
    private ChoiceBox<?> DestinationWarehouseSelect;

}


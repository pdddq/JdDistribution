package com.example.jingdongdistribution.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ChangeClaimLetterController implements Initializable {

    public ChangeClaimLetterController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void toNewClaimLetter() throws Exception {
        NewClaimLetter newClaimLetter = new NewClaimLetter();
        ((NewClaimLetter) newClaimLetter).showWindow();

    }


    @FXML
    private Button Add;

    @FXML
    private TableColumn<?, ?> ClaimQuantity1;

    @FXML
    private TextField CarrierText;

    @FXML
    private Label DestinationCity;

    @FXML
    private TextField ClaimQuantityText;

    @FXML
    private TextField ClaimReasonText;

    @FXML
    private TableColumn<?, ?> Container1;

    @FXML
    private TextField ReceivingUnitText;

    @FXML
    private TextField PowerOfAttorneyText;

    @FXML
    private Label ClaimType;

    @FXML
    private TextField SignedByText;

    @FXML
    private TextField DestinationCityText;

    @FXML
    private Label Container;

    @FXML
    private Label Remarks;

    @FXML
    private TableColumn<?, ?> ClaimAmount1;

    @FXML
    private Label Carrier;

    @FXML
    private TextField ForwardingUnitText;

    @FXML
    private ChoiceBox<?> ClaimTypeSelect;

    @FXML
    private Label OriginatingCity;

    @FXML
    private TextField ClaimAmountText;

    @FXML
    private Label ReceivingUnit;

    @FXML
    private TableColumn<?, ?> CommodityCode1;

    @FXML
    private TextField CommodityCodeText;

    @FXML
    private TextField SignedOnText;

    @FXML
    private Label ClaimQuantity;

    @FXML
    private TextField OriginatingWarehouseText;

    @FXML
    private Button Close;

    @FXML
    public void close(ActionEvent event) {
        Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }

    @FXML
    private TableColumn<?, ?> UnitPrice1;

    @FXML
    private TableColumn<?, ?> Action;

    @FXML
    private Label SignedBy;

    @FXML
    private Label DestinationWarehouse;

    @FXML
    private TextField CommodityNameText;

    @FXML
    private TextField WaybillText;

    @FXML
    private Button back;

    @FXML
    private TableColumn<?, ?> ClaimType1;

    @FXML
    private Label SignedOn;

    @FXML
    private Label Waybill;

    @FXML
    private Label ClaimReason;

    @FXML
    private Label ClaimAmount;

    @FXML
    private TableColumn<?, ?> ClaimReason1;

    @FXML
    private Label PowerOfAttorney;

    @FXML
    private Label ForwardingUnit;

    @FXML
    private Label CommodityCode;

    @FXML
    private Label OriginatingWarehouse;

    @FXML
    private TextField RemarksText;

    @FXML
    private Button Change;

    @FXML
    private TableColumn<?, ?> CommodityName1;

    @FXML
    private TextField ContainerText;

    @FXML
    private Label UnitPrice;

    @FXML
    private TextField OriginatingCityText;

    @FXML
    private TextField UnitPriceText;

    @FXML
    private TextField DestinationWarehouseText;

    @FXML
    private Label CommodityName;

    @FXML
    private Label ClaimLetter;

    @FXML
    private TextField ClaimLetterText;

}

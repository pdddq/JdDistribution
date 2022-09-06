package com.example.jingdongdistribution.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConfirmationOfArrivalInformationController {

    @FXML
    private TextField TotalBoxesText;

    @FXML
    private TextField NumberOfDamagedBoxesText;

    @FXML
    private Label ReceivingCity1;

    @FXML
    private Label OrderNumber;

    @FXML
    private Label NumberOfDamagedBoxes;

    @FXML
    private ChoiceBox<?> ReceivingWarehouseText;

    @FXML
    private Label ReceivingCity;

    @FXML
    private ChoiceBox<?> ReceivingCitySelect;

    @FXML
    private TextField SignedByText;

    @FXML
    private TextField TotalVolumeSelect;

    @FXML
    private Label Packing;

    @FXML
    private TextField NumberOfIntactBoxesText;

    @FXML
    private Label Handover;

    @FXML
    private ChoiceBox<?> CarrierNameSelect;

    @FXML
    private ChoiceBox<?> DeliveryWarehouseSelect;

    @FXML
    private Label DeliveryPerson;

    @FXML
    private TextField DeliveryTimeText;

    @FXML
    private TextField Contacts1Text;

    @FXML
    private Label CarrierName;

    @FXML
    private Button Preservation;

    @FXML
    private TextField NomineeContactInformationText;

    @FXML
    private Label NameOfGoods;

    @FXML
    private Label ReceivingUnit;

    @FXML
    private TextField Address2Text;

    @FXML
    private Label TotalWeight;

    @FXML
    private Label TypeOfShipping;

    @FXML
    private Label TotalVolume;

    @FXML
    private Button Close;

    @FXML
    private Label Remarks1;

    @FXML
    private TextField ReceivingCity1Text;

    @FXML
    private Label Remarks2;

    @FXML
    private Label NumberOfLostBoxes;

    @FXML
    private TextField TotalWeightText;

    @FXML
    private TextField ContactNumber2Text;

    @FXML
    private TextField WaybillText;

    @FXML
    private TextField ClaimLetterNoText;

    @FXML
    private Label TruckParts;

    @FXML
    private Label Consignee;

    @FXML
    private ChoiceBox<?> NameOfGoodsSelect;

    @FXML
    private Label ArrivalSignInInformation;

    @FXML
    private TextField LicensePlateText;

    @FXML
    private Label ForwardingUnit;

    @FXML
    private ChoiceBox<?> PackingSelect;

    @FXML
    private Label ShippingCity;

    @FXML
    private Label LicensePlate;

    @FXML
    private Label VehicleType;

    @FXML
    private TextField AddressText;

    @FXML
    private Label DeliveryTime;

    @FXML
    private Label NomineeIDNumber;

    @FXML
    private TextField Remarks2Text;

    @FXML
    private Label CarrierCode;

    @FXML
    private ChoiceBox<?> ShippingCitySelect;

    @FXML
    private TextField NumberOfLostBoxesText;

    @FXML
    private Label ConsigneeInformation;

    @FXML
    private Label BusinessType;

    @FXML
    private ChoiceBox<?> TypeOfShippingSelect;

    @FXML
    private TextField ConsignorText;

    @FXML
    private TextField SigningTimeText;

    @FXML
    private TextField ReceivingUnitText;

    @FXML
    private Label DifferenceBoxNumber;

    @FXML
    private Label CarrierInformation;

    @FXML
    private Label DeliveryWarehouse;

    @FXML
    private TextField DeclaredValueText;

    @FXML
    private Label PickUpSignatureInformation;

    @FXML
    private Label TransportationPowerOfAttorney;

    @FXML
    private Label ClaimLetterNo;

    @FXML
    private TextField ForwardingUnitText;

    @FXML
    private Label ShipperInformation;

    @FXML
    private ChoiceBox<?> BusinessTypeSelect;

    @FXML
    private ChoiceBox<?> TruckPartsText;

    @FXML
    private TextField Contacts2Text;

    @FXML
    private ChoiceBox<?> VehicleTypeSelect;

    @FXML
    private TextField HandoverText;

    @FXML
    private Label NumberOfIntactBoxes;

    @FXML
    private Label SignedBy;

    @FXML
    private Label ReceivingWarehouse;

    @FXML
    private TextField DifferenceBoxNumberText;

    @FXML
    private Button back;

    @FXML
    private Label Waybill;

    @FXML
    private TextField ContactNumberText;

    @FXML
    private Label SigningTime;

    @FXML
    private Label TotalBoxes;

    @FXML
    private TextField TransportationPowerOfAttorneyText;

    @FXML
    private Label DeclaredValue;

    @FXML
    private TextField OrderNumberText;

    @FXML
    private TextField DeliveryPersonText;

    @FXML
    private TextField Remarks1Text;

    @FXML
    private TextField NomineeIDNumberText;

    @FXML
    private Label Address2;

    @FXML
    private Label Address1;

    @FXML
    private Label Consignor;

    @FXML
    private Label Contacts1;

    @FXML
    private Label Contacts2;

    @FXML
    private TextField ConsigneeText;

    @FXML
    private Label Nominee;

    @FXML
    private Label ContactNumber2;

    @FXML
    private Label ContactNumber1;

    @FXML
    private Label NomineeContactInformation;

    @FXML
    private TextField CarrierCodeText;

    @FXML
    private TextField NomineeText;


    @FXML
    public void close(ActionEvent event) {
        Stage stage = (Stage) Close.getScene().getWindow();
        stage.close();
    }

}


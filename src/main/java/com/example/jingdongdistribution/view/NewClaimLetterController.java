package com.example.jingdongdistribution.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class NewClaimLetterController implements Initializable{

    @FXML
    private TableColumn<?, ?> Action;

    @FXML
    private ChoiceBox<?> OriginatingCitySelect;

    @FXML
    private Button Query;

    @FXML
    private TableColumn<?, ?> ClaimLetter1;

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
    public Button NewClaimLetter;

    @FXML
    private TextField DeadlineText;

    @FXML
    private Label PowerOfAttorney;

    @FXML
    private Label Carrier;

    @FXML
    private TextField StartTimeText;

    @FXML
    private TableColumn<?, ?> BusinessType1;

    @FXML
    private Label OriginatingCity;

    @FXML
    private ChoiceBox<?> DocumentStatusSelect;

    @FXML
    private Label Deadline;

    @FXML
    private Label OriginatingWarehouse;

    @FXML
    private Label StartTime;

    @FXML
    private ChoiceBox<?> BusinessTypeSelect;

    @FXML
    private ChoiceBox<?> OriginatingWarehouseSelect;

    @FXML
    private Label DocumentStatus;

    @FXML
    private TableColumn<?, ?> Carrier1;

    @FXML
    private Label TypeOfShipping;

    @FXML
    private ChoiceBox<?> DestinationCitySelect;

    @FXML
    private TableColumn<?, ?> DocumentStatus1;

    @FXML
    private ChoiceBox<?> DestinationWarehouseSelect;

    @FXML
    private Label ClaimLetter;

    @FXML
    private TextField ClaimLetterText;


    public NewClaimLetterController() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    public void toEnterClaimLetter() throws Exception {
        EnterClaimLetter enterClaimLetter=new EnterClaimLetter();
        ((EnterClaimLetter) enterClaimLetter).showWindow();


    }
    public void toChangeClaimLetter() throws Exception {

        ChangeClaimLetter changeClaimLetter=new ChangeClaimLetter();
        ((ChangeClaimLetter) changeClaimLetter).showWindow();

    }

}


package com.example.jingdongdistribution.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ArrivalResultController<Data>  {


    @FXML
    private TableColumn<?, ?> TruckParts;

    @FXML
    private TableColumn<?, ?> Action;

    @FXML
    private TableColumn<Data, String> PowerOfAttorney;

    @FXML
    private TableColumn<?, ?> Shipper;

    @FXML
    private TableColumn<?, ?> BusinessType;

    @FXML
    private Button back;

    @FXML
    private TableColumn<Data, String> Carrier;

    @FXML
    private TableColumn<?, ?> Consignor;


}
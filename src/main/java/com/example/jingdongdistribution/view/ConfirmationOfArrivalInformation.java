package com.example.jingdongdistribution.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ConfirmationOfArrivalInformation extends Application {
    Stage stage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("ConfirmationOfArrivalInformation.fxml"));
        primaryStage.setTitle("ConfirmationOfArrivalInformation");
        primaryStage.setScene(new Scene(root, 1197, 763));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showWindow() throws Exception {
        start(stage);
    }
}
package com.example.jingdongdistribution.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChangeClaimLetter extends Application {
    Stage stage = new Stage();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ChangeClaimLetter.fxml"));
        primaryStage.setTitle("ChangeClaimLetter");
        primaryStage.setScene(new Scene(root, 992,713));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void showWindow() throws Exception {
        start(stage);
    }
}

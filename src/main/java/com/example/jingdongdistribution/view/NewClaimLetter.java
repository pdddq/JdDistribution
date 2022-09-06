package com.example.jingdongdistribution.view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class NewClaimLetter extends Application {
    Stage stage = new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("NewClaimLetter.fxml"));
        primaryStage.setTitle("NewClaimLetter");
        primaryStage.setScene(new Scene(root, 1171,457));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void showWindow() throws Exception {
        start(stage);
    }


}
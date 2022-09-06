package com.example.jingdongdistribution.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

    public class EnterClaimLetter extends Application {
        Stage stage = new Stage();


        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("EnterClaimLetter.fxml"));
            primaryStage.setTitle("EnterClaimLetter");
            primaryStage.setScene(new Scene(root, 992,667));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }

        public void showWindow() throws Exception {
            start(stage);
        }


    }
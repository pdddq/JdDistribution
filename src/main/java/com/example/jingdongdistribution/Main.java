package com.example.jingdongdistribution;

import com.example.jingdongdistribution.Util.SqlConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.Connection;

public class Main extends Application{

        @Override
               public void start(Stage stage) throws Exception {
                SplitPane pane = FXMLLoader.load(this.getClass().getResource("view/FreightAccount.fxml"));

//            String cssPath = this.getClass().getResource("view/FreightAccount.fxml").toExternalForm();
//            scene.getStylesheets().add(cssPath);
//            FXMLLoader loader=new FXMLLoader();
//            loader.setController(this);
//            loader.setLocation(getClass().getResource("view/FreightAccount.fxml"));

//            SplitPane pane=loader.load();
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();

        }

    /*public void start(Stage stage) throws Exception {
=======
        }*/
                /*
    public void start(Stage stage) throws Exception {
>>>>>>> origin/master
    SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/Arrival.fxml"));
    //scene
    Scene scene = new Scene(anchorPane,1366,196);
    stage.setScene(scene);
    stage.setTitle("Arrival");
    stage.show();
}*/

//    public void start(Stage stage) throws Exception {
//        SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/NewClaimLetter.fxml"));
//        //scene
//        Scene scene = new Scene(anchorPane,1171,457);
//        stage.setScene(scene);
//        stage.setTitle("NewClaimLetter");
//        stage.show();
//    }
    /*
=======
/*
        public void start(Stage stage) throws Exception {
            SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/ConfirmationOfArrivalInformation.fxml"));
            //scene
            Scene scene = new Scene(anchorPane,1197,763);
            stage.setScene(scene);
            stage.setTitle("ConfirmationOfArrivalInformation");
            stage.show();
        }*/

//    public void start(Stage stage) throws Exception {
//        SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/ArrivalReceipt.fxml"));
//        //scene
//        Scene scene = new Scene(anchorPane,1195,473);
//        stage.setScene(scene);
//        stage.setTitle("ArrivalReceipt");
//        stage.show();
//    }
//    /*
//        public void start(Stage stage) throws Exception {
//            SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/ChangeClaimLetter.fxml"));
//            //scene
//            Scene scene = new Scene(anchorPane,992,713);
//            stage.setScene(scene);
//            stage.setTitle("ChangeClaimLetter");
//            stage.show();
//        }*/
        /*
        public void start(Stage stage) throws Exception {
            SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/EnterClaimLetter.fxml"));
            //scene
            Scene scene = new Scene(anchorPane,992,667);
            stage.setScene(scene);
            stage.setTitle("EnterClaimLetter");
            stage.show();
        }*/
/*
        public void start(Stage stage) throws Exception {
        SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/NewClaimLetter.fxml"));
        //scene
        Scene scene = new Scene(anchorPane,1171,457);
        stage.setScene(scene);
        stage.setTitle("NewClaimLetter");
        stage.show();
    }*/
/*
>>>>>>> origin/master
    public void start(Stage stage) throws Exception {
        SplitPane anchorPane = FXMLLoader.load(this.getClass().getResource("view/ArrivalResult.fxml"));
        //scene
        Scene scene = new Scene(anchorPane,597,281);
        stage.setScene(scene);
        stage.setTitle("ArrivalResult");
        stage.show();
    }*/

        public static void main(String[] args) {
            launch(args);
        }

}


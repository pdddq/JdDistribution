module com.example.jingdongdistribution {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.jingdongdistribution.test to javafx.fxml;
    opens com.example.jingdongdistribution to javafx.fxml;
    opens com.example.jingdongdistribution.view to javafx.fxml ;
    opens com.example.jingdongdistribution.dao to javafx.fxml;
    opens com.example.jingdongdistribution.Util to javafx.fxml;



    exports com.example.jingdongdistribution.test;
    exports com.example.jingdongdistribution.view ;
    exports com.example.jingdongdistribution;
    exports com.example.jingdongdistribution.dao;
    exports com.example.jingdongdistribution.Util;


}
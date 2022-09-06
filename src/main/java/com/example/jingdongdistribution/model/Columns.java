package com.example.jingdongdistribution.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Columns {
    private final StringProperty Poan;
    private final StringProperty Cnn;
    private final DoubleProperty Sf;
    private final DoubleProperty Dd;
    private final DoubleProperty Od;
    private final StringProperty Odr;

    public String getOdr() {
        return Odr.get();
    }

    public StringProperty odrProperty() {
        return Odr;
    }

    public void setOdr(String odr) {
        this.Odr.set(odr);
    }

    public double getOd() {
        return Od.get();
    }

    public DoubleProperty odProperty() {
        return Od;
    }

    public void setOd(double od) {
        this.Od.set(od);
    }



    public String getPoan() {
        return Poan.get();
    }

    public StringProperty poanProperty() {
        return Poan;
    }

    public void setPoan(String poan) {
        this.Poan.set(poan);
    }

    public String getCnn() {
        return Cnn.get();
    }

    public StringProperty cnnProperty() {
        return Cnn;
    }

    public void setCnn(String cnn) {
        this.Cnn.set(cnn);
    }

    public double getSf() {
        return Sf.get();
    }

    public DoubleProperty sfProperty() {
        return Sf;
    }

    public void setSf(double sf) {
        this.Sf.set(sf);
    }

    public double getDd() {
        return Dd.get();
    }

    public DoubleProperty ddProperty() {
        return Dd;
    }

    public void setDd(double dd) {
        this.Dd.set(dd);
    }

    public Columns() {
        this(null,null,null,null,null,null);
    }

    public Columns(String Poan, String Cnn, Double Sf, Double Dd,Double Od,String Odr) {
        this.Poan = new SimpleStringProperty(Poan);
        this.Cnn = new SimpleStringProperty(Cnn);
        this.Sf = new SimpleDoubleProperty(Sf);
        this.Dd = new SimpleDoubleProperty(Dd);
        this.Od=new SimpleDoubleProperty(Od);
        this.Odr=new SimpleStringProperty(Odr);
    }
}

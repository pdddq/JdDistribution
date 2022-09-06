package com.example.jingdongdistribution.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Courier {
    private final StringProperty SF;
    private final StringProperty CHINA_POST;
    private final StringProperty YT;
    private final StringProperty Sto;
    private final StringProperty ZTO;
    private final StringProperty JD;

    public Courier(){
        this(null,null,null,null,null,null);
    }

    public Courier(String SF, String CHINA_POST, String YT, String Sto, String ZTO, String JD) {
        this.SF=new SimpleStringProperty(SF);
        this.YT=new SimpleStringProperty(YT);
        this.JD=new SimpleStringProperty(JD);
        this.CHINA_POST=new SimpleStringProperty(CHINA_POST);
        this.Sto=new SimpleStringProperty(Sto);
        this.ZTO=new SimpleStringProperty(ZTO);
    }

    public String getSF() {
        return SF.get();
    }

    public StringProperty SFProperty() {
        return SF;
    }

    public void setSF(String SF) {
        this.SF.set(SF);
    }

    public String getCHINA_POST() {
        return CHINA_POST.get();
    }

    public StringProperty CHINA_POSTProperty() {
        return CHINA_POST;
    }

    public void setCHINA_POST(String CHINA_POST) {
        this.CHINA_POST.set(CHINA_POST);
    }

    public String getYT() {
        return YT.get();
    }

    public StringProperty YTProperty() {
        return YT;
    }

    public void setYT(String YT) {
        this.YT.set(YT);
    }

    public String getSto() {
        return Sto.get();
    }

    public StringProperty stoProperty() {
        return Sto;
    }

    public void setSto(String sto) {
        this.Sto.set(sto);
    }

    public String getZTO() {
        return ZTO.get();
    }

    public StringProperty ZTOProperty() {
        return ZTO;
    }

    public void setZTO(String ZTO) {
        this.ZTO.set(ZTO);
    }

    public String getJD() {
        return JD.get();
    }

    public StringProperty JDProperty() {
        return JD;
    }

    public void setJD(String JD) {
        this.JD.set(JD);
    }
}

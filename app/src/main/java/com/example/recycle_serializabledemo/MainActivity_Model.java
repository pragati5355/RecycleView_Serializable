package com.example.recycle_serializabledemo;

import java.io.Serializable;

public class MainActivity_Model implements Serializable {

    String TextName;
    String TextMob;
    String TextEmail;
    String TextAdd;
    String TextDob;

    public MainActivity_Model(){
        this.TextName=TextName;
        this.TextMob=TextMob;
        this.TextEmail=TextEmail;
        this.TextAdd=TextAdd;
        this.TextDob=TextDob;
    }

    public String getTextName() {
        return TextName;
    }

    public void setTextName(String textName) {
        TextName = textName;
    }

    public String getTextMob() {
        return TextMob;
    }

    public void setTextMob(String textMob) {
        TextMob = textMob;
    }

    public String getTextEmail() {
        return TextEmail;
    }

    public void setTextEmail(String textEmail) {
        TextEmail = textEmail;
    }

    public String getTextAdd() {
        return TextAdd;
    }

    public void setTextAdd(String textAdd) {
        TextAdd = textAdd;
    }

    public String getTextDob() {
        return TextDob;
    }

    public void setTextDob(String textDob) {
        TextDob = textDob;
    }
}

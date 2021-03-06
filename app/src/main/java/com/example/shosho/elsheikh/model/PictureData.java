package com.example.shosho.elsheikh.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PictureData {

    @SerializedName("c_id")
    @Expose
    private String cId;
    @SerializedName("c_img")
    @Expose
    private String cImg;

    @SerializedName("c_link")
    @Expose
    private String cLink;

    public String getCId() {
        return cId;
    }

    public void setCId(String cId) {
        this.cId = cId;
    }

    public String getCImg() {
        return cImg;
    }

    public void setCImg(String cImg) {
        this.cImg = cImg;
    }

    public String getCLink() {
        return cLink;
    }

    public void setCLink(String cLink) {
        this.cLink = cLink;
    }

}
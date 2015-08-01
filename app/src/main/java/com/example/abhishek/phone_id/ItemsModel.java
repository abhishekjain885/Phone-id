package com.example.abhishek.phone_id;

import java.io.Serializable;

/**
 * Created by mamadhaxor on 22/01/15.
 */
public class ItemsModel implements Serializable
{
    private String p_name;
    private int p_photo;
    private int follow_image;
    private int q_image;
    private String q_text;


    public ItemsModel(String p_name,String q_text)
    {
        this.p_name=p_name;
//        this.p_photo=p_photo;
//        this.follow_image=follow_image;
//        this.q_image=q_image;
        this.q_text=q_text;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getQ_text() {
        return q_text;
    }

    public void setQ_text(String q_text) {
        this.q_text = q_text;
    }

//    public int getQ_image() {
//        return q_image;
//    }
//
//    public void setQ_image(int q_image) {
//        this.q_image = q_image;
//    }
//    public int getP_photo() {
//        return p_photo;
//    }
//
//    public void setP_photo(int p_photo) {
//        this.p_photo = p_photo;
//    }
//    public int getFollow_image() {
//        return follow_image;
//    }
//
//    public void setFollow_image(int follow_image) {
//        this.follow_image = follow_image;
//    }
}

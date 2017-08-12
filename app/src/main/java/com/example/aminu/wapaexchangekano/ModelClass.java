package com.example.aminu.wapaexchangekano;

/**
 * Created by aminu on 7/26/17.
 */

public class ModelClass {
    String title, image, weekly_change;

    public ModelClass(String title, String image, String weekly_change) {
        this.title = title;
        this.image = image;
        this.weekly_change = weekly_change;
    }

    public ModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeekly_change(){
        return weekly_change;
    }
    public  String setWeekly_change(){
        return weekly_change;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

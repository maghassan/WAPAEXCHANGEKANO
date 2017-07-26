package com.example.aminu.wapaexchangekano;

/**
 * Created by aminu on 7/26/17.
 */

public class ModelClass {
    String title, image;

    public ModelClass(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public ModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

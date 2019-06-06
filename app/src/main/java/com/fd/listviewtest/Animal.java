package com.fd.listviewtest;

/**
 * Created by Administrator on 2018-07-27.
 */

public class Animal {
    private String name;
    private int imageId;

    public Animal(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}

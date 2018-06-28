package com.ceolabs.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Items {
    @SerializedName("items")
    public List<Jadwal> items;

    public List<Jadwal> getItems() {
        return items;
    }

    public void setItems(List<Jadwal> items) {
        this.items = items;
    }

    public Items(List<Jadwal> items){
        this.items = items;
    }

}

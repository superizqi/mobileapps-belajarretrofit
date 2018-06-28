package com.ceolabs.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Jadwal {

    @SerializedName("date_for")
    public String tanggal;

    @SerializedName("fajr")
    public String fajar;

    @SerializedName("shurooq")
    public String subuh;

    @SerializedName("dhuhr")
    public String zuhur;

    @SerializedName("asr")
    public String ashar;

    @SerializedName("maghrib")
    public String maghrib;

    @SerializedName("isha")
    public String isya;


}

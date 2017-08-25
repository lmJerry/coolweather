package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/25.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    @SerializedName("sport")
    public Sport sport;
    public class Comfort{
        @SerializedName("text")
        public String  info;
    }
    public class CarWash{
        @SerializedName("text")
        public String  info;
    }
    public class Sport{
        @SerializedName("text")
        public String  info;
    }
}

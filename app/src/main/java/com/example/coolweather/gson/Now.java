package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/25.
 */

public class Now {
    @SerializedName("tem")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}

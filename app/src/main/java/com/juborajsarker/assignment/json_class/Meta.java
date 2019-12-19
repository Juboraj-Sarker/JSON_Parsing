
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("solarPanel")
    @Expose
    private Integer solarPanel;
    @SerializedName("battery")
    @Expose
    private Integer battery;
    @SerializedName("lw")
    @Expose
    private Integer lw;
    @SerializedName("airTemp")
    @Expose
    private Double airTemp;
    @SerializedName("rh")
    @Expose
    private Double rh;
    @SerializedName("rain7d")
    @Expose
    private Rain7d rain7d;
    @SerializedName("rain48h")
    @Expose
    private Rain48h rain48h;
    @SerializedName("rain24h")
    @Expose
    private Rain24h rain24h;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(Integer solarPanel) {
        this.solarPanel = solarPanel;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getLw() {
        return lw;
    }

    public void setLw(Integer lw) {
        this.lw = lw;
    }

    public Double getAirTemp() {
        return airTemp;
    }

    public void setAirTemp(Double airTemp) {
        this.airTemp = airTemp;
    }

    public Double getRh() {
        return rh;
    }

    public void setRh(Double rh) {
        this.rh = rh;
    }

    public Rain7d getRain7d() {
        return rain7d;
    }

    public void setRain7d(Rain7d rain7d) {
        this.rain7d = rain7d;
    }

    public Rain48h getRain48h() {
        return rain48h;
    }

    public void setRain48h(Rain48h rain48h) {
        this.rain48h = rain48h;
    }

    public Rain24h getRain24h() {
        return rain24h;
    }

    public void setRain24h(Rain24h rain24h) {
        this.rain24h = rain24h;
    }

}

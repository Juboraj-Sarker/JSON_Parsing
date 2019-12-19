
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Position {

    @SerializedName("geo")
    @Expose
    private Geo geo;
    @SerializedName("altitude")
    @Expose
    private Double altitude;
    @SerializedName("timezoneCode")
    @Expose
    private String timezoneCode;

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String getTimezoneCode() {
        return timezoneCode;
    }

    public void setTimezoneCode(String timezoneCode) {
        this.timezoneCode = timezoneCode;
    }

}

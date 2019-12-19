
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("last_battery")
    @Expose
    private String lastBattery;

    public String getLastBattery() {
        return lastBattery;
    }

    public void setLastBattery(String lastBattery) {
        this.lastBattery = lastBattery;
    }

}

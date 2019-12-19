
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Modem {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("fwversion")
    @Expose
    private String fwversion;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFwversion() {
        return fwversion;
    }

    public void setFwversion(String fwversion) {
        this.fwversion = fwversion;
    }

}

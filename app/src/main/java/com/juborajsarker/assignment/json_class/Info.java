
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("device_id")
    @Expose
    private Integer deviceId;
    @SerializedName("device_name")
    @Expose
    private String deviceName;
    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("firmware")
    @Expose
    private String firmware;
    @SerializedName("hardware")
    @Expose
    private String hardware;
    @SerializedName("programmed")
    @Expose
    private String programmed;
    @SerializedName("apn_table")
    @Expose
    private Integer apnTable;
    @SerializedName("description")
    @Expose
    private String description;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getProgrammed() {
        return programmed;
    }

    public void setProgrammed(String programmed) {
        this.programmed = programmed;
    }

    public Integer getApnTable() {
        return apnTable;
    }

    public void setApnTable(Integer apnTable) {
        this.apnTable = apnTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

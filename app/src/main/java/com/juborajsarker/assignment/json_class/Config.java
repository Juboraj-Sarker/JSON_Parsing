
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Config {

    @SerializedName("timezone_offset")
    @Expose
    private Integer timezoneOffset;
    @SerializedName("dst")
    @Expose
    private Boolean dst;
    @SerializedName("precision_reduction")
    @Expose
    private Double precisionReduction;
    @SerializedName("scheduler")
    @Expose
    private Integer scheduler;
    @SerializedName("schedulerOld")
    @Expose
    private String schedulerOld;
    @SerializedName("fixed_transfer_interval")
    @Expose
    private Integer fixedTransferInterval;
    @SerializedName("rain_monitor")
    @Expose
    private Integer rainMonitor;
    @SerializedName("water_level_monitor")
    @Expose
    private Integer waterLevelMonitor;
    @SerializedName("data_interval")
    @Expose
    private Integer dataInterval;
    @SerializedName("activity_mode")
    @Expose
    private Integer activityMode;
    @SerializedName("measuring_interval")
    @Expose
    private Integer measuringInterval;
    @SerializedName("logging_interval")
    @Expose
    private Integer loggingInterval;
    @SerializedName("x_min_transfer_interval")
    @Expose
    private Boolean xMinTransferInterval;

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Boolean getDst() {
        return dst;
    }

    public void setDst(Boolean dst) {
        this.dst = dst;
    }

    public Double getPrecisionReduction() {
        return precisionReduction;
    }

    public void setPrecisionReduction(Double precisionReduction) {
        this.precisionReduction = precisionReduction;
    }

    public Integer getScheduler() {
        return scheduler;
    }

    public void setScheduler(Integer scheduler) {
        this.scheduler = scheduler;
    }

    public String getSchedulerOld() {
        return schedulerOld;
    }

    public void setSchedulerOld(String schedulerOld) {
        this.schedulerOld = schedulerOld;
    }

    public Integer getFixedTransferInterval() {
        return fixedTransferInterval;
    }

    public void setFixedTransferInterval(Integer fixedTransferInterval) {
        this.fixedTransferInterval = fixedTransferInterval;
    }

    public Integer getRainMonitor() {
        return rainMonitor;
    }

    public void setRainMonitor(Integer rainMonitor) {
        this.rainMonitor = rainMonitor;
    }

    public Integer getWaterLevelMonitor() {
        return waterLevelMonitor;
    }

    public void setWaterLevelMonitor(Integer waterLevelMonitor) {
        this.waterLevelMonitor = waterLevelMonitor;
    }

    public Integer getDataInterval() {
        return dataInterval;
    }

    public void setDataInterval(Integer dataInterval) {
        this.dataInterval = dataInterval;
    }

    public Integer getActivityMode() {
        return activityMode;
    }

    public void setActivityMode(Integer activityMode) {
        this.activityMode = activityMode;
    }

    public Integer getMeasuringInterval() {
        return measuringInterval;
    }

    public void setMeasuringInterval(Integer measuringInterval) {
        this.measuringInterval = measuringInterval;
    }

    public Integer getLoggingInterval() {
        return loggingInterval;
    }

    public void setLoggingInterval(Integer loggingInterval) {
        this.loggingInterval = loggingInterval;
    }

    public Boolean getXMinTransferInterval() {
        return xMinTransferInterval;
    }

    public void setXMinTransferInterval(Boolean xMinTransferInterval) {
        this.xMinTransferInterval = xMinTransferInterval;
    }

}

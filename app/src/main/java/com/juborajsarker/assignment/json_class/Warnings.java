
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Warnings {

    @SerializedName("sensors")
    @Expose
    private List<String> sensors = null;
    @SerializedName("sms_numbers")
    @Expose
    private List<SmsNumber> smsNumbers = null;

    public List<String> getSensors() {
        return sensors;
    }

    public void setSensors(List<String> sensors) {
        this.sensors = sensors;
    }

    public List<SmsNumber> getSmsNumbers() {
        return smsNumbers;
    }

    public void setSmsNumbers(List<SmsNumber> smsNumbers) {
        this.smsNumbers = smsNumbers;
    }

}

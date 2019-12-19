
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Rain7d {

    @SerializedName("vals")
    @Expose
    private List<Double> vals = null;
    @SerializedName("sum")
    @Expose
    private Double sum;

    public List<Double> getVals() {
        return vals;
    }

    public void setVals(List<Double> vals) {
        this.vals = vals;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

}

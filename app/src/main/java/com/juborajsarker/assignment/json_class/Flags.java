
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Flags {

    @SerializedName("imeteopro")
    @Expose
    private Boolean imeteopro;

    public Boolean getImeteopro() {
        return imeteopro;
    }

    public void setImeteopro(Boolean imeteopro) {
        this.imeteopro = imeteopro;
    }

}

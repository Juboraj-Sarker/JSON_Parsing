
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Networking {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("mcc")
    @Expose
    private String mcc;
    @SerializedName("mnc")
    @Expose
    private String mnc;
    @SerializedName("mcc_sim")
    @Expose
    private String mccSim;
    @SerializedName("mnc_sim")
    @Expose
    private String mncSim;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("apn")
    @Expose
    private String apn;
    @SerializedName("usernme")
    @Expose
    private String usernme;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("simid")
    @Expose
    private String simid;
    @SerializedName("rssi_pct")
    @Expose
    private String rssiPct;
    @SerializedName("imei")
    @Expose
    private String imei;
    @SerializedName("modem")
    @Expose
    private Modem modem;
    @SerializedName("provider")
    @Expose
    private String provider;
    @SerializedName("provider_sim")
    @Expose
    private String providerSim;
    @SerializedName("username")
    @Expose
    private String username;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public String getMccSim() {
        return mccSim;
    }

    public void setMccSim(String mccSim) {
        this.mccSim = mccSim;
    }

    public String getMncSim() {
        return mncSim;
    }

    public void setMncSim(String mncSim) {
        this.mncSim = mncSim;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getUsernme() {
        return usernme;
    }

    public void setUsernme(String usernme) {
        this.usernme = usernme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSimid() {
        return simid;
    }

    public void setSimid(String simid) {
        this.simid = simid;
    }

    public String getRssiPct() {
        return rssiPct;
    }

    public void setRssiPct(String rssiPct) {
        this.rssiPct = rssiPct;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Modem getModem() {
        return modem;
    }

    public void setModem(Modem modem) {
        this.modem = modem;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderSim() {
        return providerSim;
    }

    public void setProviderSim(String providerSim) {
        this.providerSim = providerSim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}

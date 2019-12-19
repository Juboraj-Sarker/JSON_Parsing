
package com.juborajsarker.assignment.json_class;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainStation {

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("rights")
    @Expose
    private String rights;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("position")
    @Expose
    private Position position;
    @SerializedName("config")
    @Expose
    private Config config;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("metaUnits")
    @Expose
    private String metaUnits;
    @SerializedName("networking")
    @Expose
    private Networking networking;
    @SerializedName("warnings")
    @Expose
    private Warnings warnings;
    @SerializedName("flags")
    @Expose
    private Flags flags;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("licenses")
//    @Expose
//    private Boolean licenses;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getMetaUnits() {
        return metaUnits;
    }

    public void setMetaUnits(String metaUnits) {
        this.metaUnits = metaUnits;
    }

    public Networking getNetworking() {
        return networking;
    }

    public void setNetworking(Networking networking) {
        this.networking = networking;
    }

    public Warnings getWarnings() {
        return warnings;
    }

    public void setWarnings(Warnings warnings) {
        this.warnings = warnings;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

//    public Boolean getLicenses() {
//        return licenses;
//    }
//
//    public void setLicenses(Boolean licenses) {
//        this.licenses = licenses;
//    }

}

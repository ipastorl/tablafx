package com.ipastorl.tablafx;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Capsule {
    @SerializedName("capsule_serial")
    private String capsuleSerialC;
    @SerializedName("capsule_id")
    private String capsuleIdC;
    @SerializedName("status")
    private String statusC;
    @SerializedName("original_launch")
    private String originalLaunchC;
    @SerializedName("original_launch_unix")
    private Integer originalLaunchunixC;
    @SerializedName("missions")
    private ArrayList<Mission> missionsC;
    @SerializedName("landings")
    private Integer landingsC;
    @SerializedName("type")
    private String typeC;
    @SerializedName("details")
    private String detailsC;
    @SerializedName("reuse_count")
    private Integer reuseCountC;

    public Capsule(String capsuleSerialC, String capsuleIdC, String statusC, String originalLaunchC
            , Integer originalLaunchunixC, ArrayList<Mission> missionsC, Integer landingsC
            , String typeC, String detailsC, Integer reuseCountC) {
        this.capsuleSerialC = capsuleSerialC;
        this.capsuleIdC = capsuleIdC;
        this.statusC = statusC;
        this.originalLaunchC = originalLaunchC;
        this.originalLaunchunixC = originalLaunchunixC;
        this.missionsC = missionsC;
        this.landingsC = landingsC;
        this.typeC = typeC;
        this.detailsC = detailsC;
        this.reuseCountC = reuseCountC;
    }

    public Capsule() {
    }

    public String getCapsuleSerialC() {
        return capsuleSerialC;
    }

    public void setCapsuleSerialC(String capsuleSerialC) {
        this.capsuleSerialC = capsuleSerialC;
    }

    public String getCapsuleIdC() {
        return capsuleIdC;
    }

    public void setCapsuleIdC(String capsuleIdC) {
        this.capsuleIdC = capsuleIdC;
    }

    public String getStatusC() {
        return statusC;
    }

    public void setStatusC(String statusC) {
        this.statusC = statusC;
    }

    public String getOriginalLaunchC() {
        return originalLaunchC;
    }

    public void setOriginalLaunchC(String originalLaunchC) {
        this.originalLaunchC = originalLaunchC;
    }

    public Integer getOriginalLaunchunixC() {
        return originalLaunchunixC;
    }

    public void setOriginalLaunchunixC(Integer originalLaunchunixC) {
        this.originalLaunchunixC = originalLaunchunixC;
    }

    public ArrayList<Mission> getMissionsC() {
        return missionsC;
    }

    public void setMissionsC(ArrayList<Mission> missionsC) {
        this.missionsC = missionsC;
    }

    public Integer getLandingsC() {
        return landingsC;
    }

    public void setLandingsC(Integer landingsC) {
        this.landingsC = landingsC;
    }

    public String getTypeC() {
        return typeC;
    }

    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    public String getDetailsC() {
        return detailsC;
    }

    public void setDetailsC(String detailsC) {
        this.detailsC = detailsC;
    }

    public Integer getReuseCountC() {
        return reuseCountC;
    }

    public void setReuseCountC(Integer reuseCountC) {
        this.reuseCountC = reuseCountC;
    }

    @Override
    public String toString() {
        return "Capsule{" +
                "capsuleSerialC='" + capsuleSerialC + '\'' +
                ", capsuleIdC='" + capsuleIdC + '\'' +
                ", statusC='" + statusC + '\'' +
                ", originalLaunchC='" + originalLaunchC + '\'' +
                ", originalLaunchunixC=" + originalLaunchunixC +
                ", missionsC=" + missionsC +
                ", landingsC=" + landingsC +
                ", typeC='" + typeC + '\'' +
                ", detailsC='" + detailsC + '\'' +
                ", reuseCountC=" + reuseCountC +
                '}';
    }
}

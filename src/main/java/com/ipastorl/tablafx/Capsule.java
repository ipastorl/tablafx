package com.ipastorl.tablafx;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Capsule.
 *
 * @version 1.0
 * @author Isabel Pastor López
 */
public class Capsule {
    /**
     * The Capsule serial c.
     */
    @SerializedName("capsule_serial")
    public String capsuleSerialC;
    /**
     * The Capsule id c.
     */
    @SerializedName("capsule_id")
    public String capsuleIdC;
    /**
     * The Status c.
     */
    @SerializedName("status")
    public String statusC;
    /**
     * The Original launch c.
     */
    @SerializedName("original_launch")
    public String originalLaunchC;
    /**
     * The Original launchunix c.
     */
    @SerializedName("original_launch_unix")
    public Integer originalLaunchunixC;
    /**
     * The Missions c.
     */
    @SerializedName("missions")
    public List<Mission> missionsC;
    /**
     * The Landings c.
     */
    @SerializedName("landings")
    public Integer landingsC;
    /**
     * The Type c.
     */
    @SerializedName("type")
    public String typeC;
    /**
     * The Details c.
     */
    @SerializedName("details")
    public String detailsC;
    /**
     * The Reuse count c.
     */
    @SerializedName("reuse_count")
    public Integer reuseCountC;

    /**
     * Instantiates a new Capsule.
     *
     * @param capsuleSerialC      the capsule serial c
     * @param capsuleIdC          the capsule id c
     * @param statusC             the status c
     * @param originalLaunchC     the original launch c
     * @param originalLaunchunixC the original launchunix c
     * @param missionsC           the missions c
     * @param landingsC           the landings c
     * @param typeC               the type c
     * @param detailsC            the details c
     * @param reuseCountC         the reuse count c
     */
    public Capsule(String capsuleSerialC, String capsuleIdC, String statusC, String originalLaunchC
            , Integer originalLaunchunixC, List<Mission> missionsC, Integer landingsC
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

    /**
     * Instantiates a new Capsule.
     */
    public Capsule() {
    }

    /**
     * Gets capsule serial c.
     *
     * @return the capsule serial c
     */
    public String getCapsuleSerialC() {
        return capsuleSerialC;
    }

    /**
     * Sets capsule serial c.
     *
     * @param capsuleSerialC the capsule serial c
     */
    public void setCapsuleSerialC(String capsuleSerialC) {
        this.capsuleSerialC = capsuleSerialC;
    }

    /**
     * Gets capsule id c.
     *
     * @return the capsule id c
     */
    public String getCapsuleIdC() {
        return capsuleIdC;
    }

    /**
     * Sets capsule id c.
     *
     * @param capsuleIdC the capsule id c
     */
    public void setCapsuleIdC(String capsuleIdC) {
        this.capsuleIdC = capsuleIdC;
    }

    /**
     * Gets status c.
     *
     * @return the status c
     */
    public String getStatusC() {
        return statusC;
    }

    /**
     * Sets status c.
     *
     * @param statusC the status c
     */
    public void setStatusC(String statusC) {
        this.statusC = statusC;
    }

    /**
     * Gets original launch c.
     *
     * @return the original launch c
     */
    public String getOriginalLaunchC() {
        return originalLaunchC;
    }

    /**
     * Sets original launch c.
     *
     * @param originalLaunchC the original launch c
     */
    public void setOriginalLaunchC(String originalLaunchC) {
        this.originalLaunchC = originalLaunchC;
    }

    /**
     * Gets original launchunix c.
     *
     * @return the original launchunix c
     */
    public Integer getOriginalLaunchunixC() {
        return originalLaunchunixC;
    }

    /**
     * Sets original launchunix c.
     *
     * @param originalLaunchunixC the original launchunix c
     */
    public void setOriginalLaunchunixC(Integer originalLaunchunixC) {
        this.originalLaunchunixC = originalLaunchunixC;
    }

    /**
     * Gets missions c.
     *
     * @return the missions c
     */
    public List<Mission> getMissionsC() {
        return missionsC;
    }

    /**
     * Sets missions c.
     *
     * @param missionsC the missions c
     */
    public void setMissionsC(List<Mission> missionsC) {
        this.missionsC = missionsC;
    }

    /**
     * Gets landings c.
     *
     * @return the landings c
     */
    public Integer getLandingsC() {
        return landingsC;
    }

    /**
     * Sets landings c.
     *
     * @param landingsC the landings c
     */
    public void setLandingsC(Integer landingsC) {
        this.landingsC = landingsC;
    }

    /**
     * Gets type c.
     *
     * @return the type c
     */
    public String getTypeC() {
        return typeC;
    }

    /**
     * Sets type c.
     *
     * @param typeC the type c
     */
    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    /**
     * Gets details c.
     *
     * @return the details c
     */
    public String getDetailsC() {
        return detailsC;
    }

    /**
     * Sets details c.
     *
     * @param detailsC the details c
     */
    public void setDetailsC(String detailsC) {
        this.detailsC = detailsC;
    }

    /**
     * Gets reuse count c.
     *
     * @return the reuse count c
     */
    public Integer getReuseCountC() {
        return reuseCountC;
    }

    /**
     * Sets reuse count c.
     *
     * @param reuseCountC the reuse count c
     */
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

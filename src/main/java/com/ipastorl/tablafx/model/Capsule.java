package com.ipastorl.tablafx.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Capsule {
    private String capsule_serial;
    private String capsule_id;
    private String status;
    private String original_launch;
    private Integer original_launch_unix;
    private ArrayList<Mission> missions;
    private Integer landings;
    private String type;
    private String details;
    private Integer reuse_count;

    public Capsule(String capsule_serial, String capsule_id, String status
            , String original_launch, Integer original_launch_unix
            , ArrayList<Mission> missions, Integer landings
            , String type, String details, Integer reuse_count) {
        this.capsule_serial = capsule_serial;
        this.capsule_id = capsule_id;
        this.status = status;
        this.original_launch = original_launch;
        this.original_launch_unix = original_launch_unix;
        this.missions = missions;
        this.landings = landings;
        this.type = type;
        this.details = details;
        this.reuse_count = reuse_count;
    }

    public Capsule() {
    }

    public String getCapsule_serial() {
        return capsule_serial;
    }

    public void setCapsule_serial(String capsule_serial) {
        this.capsule_serial = capsule_serial;
    }

    public String getCapsule_id() {
        return capsule_id;
    }

    public void setCapsule_id(String capsule_id) {
        this.capsule_id = capsule_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOriginal_launch() {
        return original_launch;
    }

    public void setOriginal_launch(String original_launch) {
        this.original_launch = original_launch;
    }

    public Integer getOriginal_launch_unix() {
        return original_launch_unix;
    }

    public void setOriginal_launch_unix(Integer original_launch_unix) {
        this.original_launch_unix = original_launch_unix;
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

    public Integer getLandings() {
        return landings;
    }

    public void setLandings(Integer landings) {
        this.landings = landings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getReuse_count() {
        return reuse_count;
    }

    public void setReuse_count(Integer reuse_count) {
        this.reuse_count = reuse_count;
    }

    @Override
    public String toString() {
        return "Capsule{" +
                "capsule_serial='" + capsule_serial + '\'' +
                ", capsule_id='" + capsule_id + '\'' +
                ", status='" + status + '\'' +
                ", original_launch='" + original_launch + '\'' +
                ", original_launch_unix=" + original_launch_unix +
                ", missions=" + missions +
                ", landings=" + landings +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                ", reuse_count=" + reuse_count +
                '}';
    }
}

package com.ipastorl.tablafx;

import com.google.gson.annotations.SerializedName;

public class Mission {
    @SerializedName("name")
    public String nameM;
    @SerializedName("flight")
    public Integer flightM;

    public Mission(String name, Integer flight) {
        this.nameM = name;
        this.flightM = flight;
    }

    public Mission() {
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public Integer getFlightM() {
        return flightM;
    }

    public void setFlightM(Integer flightM) {
        this.flightM = flightM;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + nameM + '\'' +
                ", flight=" + flightM +
                '}';
    }
}

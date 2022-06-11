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

    public String getName() {
        return nameM;
    }

    public void setName(String name) {
        this.nameM = name;
    }

    public Integer getFlight() {
        return flightM;
    }

    public void setFlight(Integer flight) {
        this.flightM = flight;
    }


    @Override
    public String toString() {
        return "Mission{" +
                "name='" + nameM + '\'' +
                ", flight=" + flightM +
                '}';
    }
}

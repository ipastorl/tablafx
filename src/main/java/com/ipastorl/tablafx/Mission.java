package com.ipastorl.tablafx;

import com.google.gson.annotations.SerializedName;

/**
 * The type Mission.
 *
 * @version 1.0
 * @author Isabel Pastor López
 */
public class Mission {
    /**
     * The Name m.
     */
    @SerializedName("name")
    public String nameM;
    /**
     * The Flight m.
     */
    @SerializedName("flight")
    public Integer flightM;

    /**
     * Instantiates a new Mission.
     *
     * @param name   the name
     * @param flight the flight
     */
    public Mission(String name, Integer flight) {
        this.nameM = name;
        this.flightM = flight;
    }

    /**
     * Instantiates a new Mission.
     */
    public Mission() {
    }

    /**
     * Gets name m.
     *
     * @return the name m
     */
    public String getNameM() {
        return nameM;
    }

    /**
     * Sets name m.
     *
     * @param nameM the name m
     */
    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    /**
     * Gets flight m.
     *
     * @return the flight m
     */
    public Integer getFlightM() {
        return flightM;
    }

    /**
     * Sets flight m.
     *
     * @param flightM the flight m
     */
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

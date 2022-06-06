package com.ipastorl.tablafx.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Mission {
    private String name;
    private Integer flight;

    public Mission(String name, Integer flight) {
        this.name = name;
        this.flight = flight;
    }

    public Mission() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public ObservableList<Mission> getMissions(){

        return FXCollections.observableArrayList(
                // insert items here
        );
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", flight=" + flight +
                '}';
    }
}

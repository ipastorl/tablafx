package com.ipastorl.tablafx.model;


import javafx.collections.ObservableList;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * The interface Capsules api service import Capsules List from https://api.spacexdata.com/v3/capsules
 */
public interface CapsulesApiService {
    /**
     * Gets all capsules.
     *
     * @return the all capsules
     */
    @GET("https://api.spacexdata.com/v3/capsules")
     ObservableList<Capsule> getAllCapsules();

    /**
     * Gets all missions.
     *
     * @param capsule_serial the capsule serial
     * @return the all missions
     */
    @GET("https://api.spacexdata.com/v3/capsules/{capsule_serial}")
    ObservableList<Mission> getAllMissions(@Path("capsule_serial") String capsule_serial);
}

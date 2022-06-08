package com.ipastorl.tablafx.model;


import io.reactivex.rxjava3.core.Observable;
import javafx.collections.ObservableList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;


/**
 * The interface Capsules api service import Capsules List from https://api.spacexdata.com/v3/capsules
 */
public interface CapsulesApiService {

    @GET("capsules")
    Call<List<Capsule>> getAllCapsules();
//    ObservableList<Capsule> getAllCapsules();


    @GET("capsules/{capsule_serial}")
    Call<Capsule> getCapsuleSerial(@Path("capsule_serial") String capsuleSerial);
    // Capsule getCapsule(@Path("capsule_serial") String capsule_serial);
    // ObservableList<Mission> getAllMissions(@Path("capsule_serial") String capsule_serial);
    // un objeto capsula
    // Observable<Capsule> getCapsuleSerial(@Path("capsule_serial") String capsuleSerial);
}

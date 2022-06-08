package com.ipastorl.tablafx.model;


import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Capsules service.
 */
public class CapsulesService {
    List<Capsule> capsules = new ArrayList<>();
    Capsule capsule = new Capsule();
    List<Mission> missions = new ArrayList<>();

    /** Constructor */
    public CapsulesService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        /** Attribute Interface api Services */
        CapsulesApiService capsulesApiService = retrofit.create(CapsulesApiService.class);
        try{
            Response<List<Capsule>> response = capsulesApiService.getAllCapsules().execute();
            if (response.isSuccessful()){
                this.capsules = response.body();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try{
            Response<Capsule> response = capsulesApiService.getCapsuleSerial("C106").execute();
            if (response.isSuccessful()){
                this.capsule = response.body();
                missions = this.capsule.getMissionsC();
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public List<Capsule> getAllCapsules(){
        return capsules;
    }

    public Capsule getCapsule(String capsule_serial){
        return capsule;
        //return capsulesApiService.getCapsuleSerial(capsule_serial);
    }

    public List<Mission> getMissions() {
        return missions;
    }
}

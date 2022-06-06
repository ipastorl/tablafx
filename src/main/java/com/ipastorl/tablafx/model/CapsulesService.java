package com.ipastorl.tablafx.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The type Capsules service.
 */
public class CapsulesService {
    /** Attribute Interface api Services */
    private CapsulesApiService capsulesApiService;

    /** Constructor */
    public CapsulesService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        capsulesApiService = retrofit.create(CapsulesApiService.class);
    }

    public ObservableList<Capsule> getAllCapsules(){
        return capsulesApiService.getAllCapsules();
    }

    public ObservableList<Mission> getAllMissions(String capsule_serial){
        return capsulesApiService.getAllMissions(capsule_serial);
    }
}

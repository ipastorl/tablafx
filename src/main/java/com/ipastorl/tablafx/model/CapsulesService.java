package com.ipastorl.tablafx.model;


import io.reactivex.rxjava3.core.Observable;
import javafx.collections.ObservableList;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

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

    public Call<List<Capsule>> getAllCapsules(){
        return capsulesApiService.getAllCapsules();
    }

    public Call<Capsule> getCapsule(String capsule_serial){
        return capsulesApiService.getCapsuleSerial(capsule_serial);
    }
}

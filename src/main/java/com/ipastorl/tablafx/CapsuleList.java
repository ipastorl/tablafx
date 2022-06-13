package com.ipastorl.tablafx;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Capsule list.
 *
 * @author Isabel Pastor López
 * @version 1.0
 */
public class CapsuleList {
    private static List<Capsule> capsuleList = new ArrayList<>();
    private static List<Mission> missionList = new ArrayList<>();

    // Retrofit Builder
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/v3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private static DBCapsules service = retrofit.create(DBCapsules.class);
    private static Capsule capsule = null;

    /**
     * Gets capsule list.
     *
     * @return the capsule list
     */
    public List<Capsule> getCapsuleList() {

        try {
            Response<List<Capsule>> response = service.listCapsules().execute();
            if (response.isSuccessful()) {
                capsuleList = response.body();
            } else {
                System.out.println("Petición no válida " + response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la petición " + e.getMessage());
        }

        return capsuleList;
    }

    /**
     * Gets mission list.
     *
     * @param capsuleSerial the capsule serial
     * @return the mission list
     */
    public List<Mission> getMissionList(String capsuleSerial) {

        try {
            Response<Capsule> response = service.getCapsuleSerial(capsuleSerial).execute();
            if (response.isSuccessful()) {
                capsule = response.body();
                assert capsule != null;
                missionList = capsule.getMissionsC();
            } else {
                System.out.println("Petición no válida " + response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la petición " + e.getMessage());
        }

        return missionList;
    }
}

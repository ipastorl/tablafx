package com.ipastorl.tablafx;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * The interface Db capsules.
 *
 * @version 1.0
 * @author Isabel Pastor López
 */
public interface DBCapsules {
    /**
     * List capsules call.
     *
     * @return the call
     */
// https://api.spacexdata.com/v3/capsules
    @GET("capsules")
    Call<List<Capsule>> listCapsules();


    /**
     * Gets capsule serial.
     *
     * @param capsuleSerial the capsule serial
     * @return the capsule serial
     */
    @GET("capsules/{capsule_serial}")
    Call<Capsule> getCapsuleSerial(@Path("capsule_serial") String capsuleSerial);


}

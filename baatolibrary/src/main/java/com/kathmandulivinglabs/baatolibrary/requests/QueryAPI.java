package com.kathmandulivinglabs.baatolibrary.requests;

import com.kathmandulivinglabs.baatolibrary.models.Place;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QueryAPI {

    @GET("search")
    Call<List<Place>> searchQuery(@Query("q") String query);

    @GET("reverse")
    Call<List<Place>> performReverseGeoCode(@Query("lat") double lat, @Query("lon") double lon, @Query("radius") int radius);

    @GET("routes")
    Call<List<Place>> searchQuery(@Query("origin") String origin,@Query("destination") String destination,@Query("mode") String mode);
}

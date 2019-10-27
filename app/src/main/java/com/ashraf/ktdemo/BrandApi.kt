package com.ashraf.ktdemo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BrandApi {


    @GET("v3/brand/?{brand_type_id}&{start_limit}&{end_limit}")
    fun getBrands(
        @Query("brand_type_id") brand_type_id:Int,
        @Path("start_limit")start_limit:Int,
        @Path("end_limit")end_limit:Int
    ):Call<List<Brands>>
}
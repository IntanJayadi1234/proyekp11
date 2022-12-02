package com.rsz.getapirickmorty.Api

import com.rsz.getapirickmorty.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET
// produk atau layanan yang berkomunikasi dengan produk dan layanan lain tanpa harus tahu bagaimana penerapannya.
interface ApiService {
    @GET("character")
    fun getMorty() : Call<ResponseMorty>
}
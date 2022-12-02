package com.rsz.getapirickmorty.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
// akan menambahkan beberapa kode ke MainActivity yang memulai aktivitas baru untuk menampilkan pesan saat pengguna mengetuk tombol Send.
object ApiConfig {

    const val baseUrl = "https://rickandmortyapi.com/api/"
// Retrofit adalah sebuah library yang digunakan untuk mempermudah proses pertukaran data antara aplikasi android dengan server melalui REST API
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}
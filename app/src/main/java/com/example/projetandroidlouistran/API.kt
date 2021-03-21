package com.example.projetandroidlouistran

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
//    On créer une varirable contenant l'adresse URL de base de l'API
    private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
//    Dans le cadre de mon projet j'ai décider d'utiliser Retrofit afin de simplifier la serialisation des informations
    private var retrofit: Retrofit? = null

    var client = OkHttpClient()

    var gson = GsonBuilder()
        .setLenient()
        .create()

    val apiClient: Retrofit
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit!!
        }
}
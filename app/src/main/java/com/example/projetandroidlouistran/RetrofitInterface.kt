package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @get:GET("posts")
    val posts : Call<List<Recipe?>?>?

    companion object {
        const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/search.php?f=a"
    }
}
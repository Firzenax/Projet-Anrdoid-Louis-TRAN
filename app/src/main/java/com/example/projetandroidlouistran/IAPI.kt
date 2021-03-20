package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.http.GET

interface IAPI {
    @get:GET("random.php")
    val get_recipes: Call<Recipes>
}
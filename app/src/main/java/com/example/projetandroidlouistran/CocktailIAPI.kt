package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.http.GET

interface CocktailIAPI {
    @get:GET("random.php")
    val get_Cocktailrecipes: Call<CocktailRecipes>
}
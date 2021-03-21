package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.http.GET

interface IAPI {
    //    On désigne la page de l'API qui nous interesse dans mon cas la page montrant une recette aléatoire.
    @get:GET("random.php")
    val get_recipes: Call<Recipes>
}
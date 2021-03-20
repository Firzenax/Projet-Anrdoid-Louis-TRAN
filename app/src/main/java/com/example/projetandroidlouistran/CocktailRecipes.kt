package com.example.projetandroidlouistran

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CocktailRecipes {
    @Expose
    @SerializedName("cocktails")
    var cocktails:List<Cocktail>? = null
}
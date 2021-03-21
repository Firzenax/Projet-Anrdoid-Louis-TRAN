package com.example.projetandroidlouistran

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CocktailRecipes {
//    On défini une variable qui va contenir une liste de Cocktail
    @Expose
    @SerializedName("cocktails")
    var cocktails:List<Cocktail>? = null
}
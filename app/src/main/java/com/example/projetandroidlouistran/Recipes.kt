package com.example.projetandroidlouistran

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Recipes {
    //    On défini une variable qui va contenir une liste de recette

    @Expose
    @SerializedName("meals")
    var meals:List<Meal>? = null
}
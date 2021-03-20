package com.example.projetandroidlouistran

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Recipes {
    @Expose
    @SerializedName("meals")
    var meals:List<Meal>? = null
}
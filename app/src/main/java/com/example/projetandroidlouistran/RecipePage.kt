package com.example.projetandroidlouistran

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RecipePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_page)

        var rf = Retrofit.Builder()
            .baseUrl(RetrofitInterface.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()

        var API = rf.create(RetrofitInterface::class.java)
        var call = API.posts

        call?.enqueue(object:Callback<List<Recipe?>?>{
            override fun onResponse(
                call: Call<List<Recipe?>?>,
                response: Response<List<Recipe?>?>
            ) {
                var recipeList : List<Recipe>? = response.body() as List<Recipe>
                var rec = arrayOfNulls<String>(recipeList!!.size)

                for (i in recipeList!!.indices)
                    rec[i] = recipeList!![i]!!.strMeal

                var adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,rec)
                val listview = findViewById<ListView>(R.id.listview)
                listview.adapter = adapter
            }

            override fun onFailure(call: Call<List<Recipe?>?>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })


    }
}
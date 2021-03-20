package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CocktailRecipeBoardPresenter(private val view: CocktailActivity) {
    internal fun getRecipesData() {
        view.showLoading()

        val apiInterface = CocktailAPI.apiClient.create(CocktailIAPI::class.java)

        val call = apiInterface.get_Cocktailrecipes

        call.enqueue(object : Callback<CocktailRecipes> {

            override fun onResponse(
                call: Call<CocktailRecipes>,
                response: Response<CocktailRecipes>
            ) {
                view.hideLoading()

                if (response.isSuccessful) {
                    view.getResult(response.body())
                }
            }

            override fun onFailure(call: Call<CocktailRecipes>, t: Throwable) {
                view.hideLoading()
                view.onRequestError(t.localizedMessage!!)
            }

        })

    }
}
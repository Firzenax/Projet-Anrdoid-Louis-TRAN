package com.example.projetandroidlouistran

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RecipeBoardPresenter(private val view : RecipeBoardView) {

    internal fun getRecipesData() {
        view.showLoading()
//Défini l'interface que cette classe doit utiliser dans ce cas c'est IAPI

        val apiInterface = API.apiClient.create(IAPI::class.java)

        val call = apiInterface.get_recipes

        call.enqueue(object : Callback<Recipes> {

            override fun onResponse(call: Call<Recipes>, response: Response<Recipes>) {
                view.hideLoading()

                if (response.isSuccessful) {
                    view.getResult(response.body())
                }
            }

            override fun onFailure(call: Call<Recipes>, t: Throwable) {
                view.hideLoading()
                view.onRequestError(t.localizedMessage!!)
            }

        })

    }
}




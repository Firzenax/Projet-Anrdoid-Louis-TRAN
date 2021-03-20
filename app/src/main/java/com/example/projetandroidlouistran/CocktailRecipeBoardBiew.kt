package com.example.projetandroidlouistran

interface CocktailRecipeBoardBiew {
    fun showLoading()
    fun hideLoading()
    fun getResult(userList: CocktailRecipes?)
    fun showProgress()
    fun hideProgress()
    fun onRequestSuccess(message: String)
    fun onRequestError(message: String)
}
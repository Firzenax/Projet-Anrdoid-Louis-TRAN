package com.example.projetandroidlouistran

interface RecipeBoardView {

    fun showLoading()
    fun hideLoading()
    fun getResult(userList: Recipes?)
    fun showProgress()
    fun hideProgress()
    fun onRequestSuccess(message: String)
    fun onRequestError(message: String)

}
package com.example.projetandroidlouistran
//Même idée que pour RecipeBoardView
interface CocktailRecipeBoardBiew {
//    Ces deux fonction servent a la représentation du rechargement de la page
    fun showLoading()
    fun hideLoading()
//    Prend la nouvelle recette
    fun getResult(userList: CocktailRecipes?)
//    Ces deux fonctions permettent de voir le chargement des données
    fun showProgress()
    fun hideProgress()
//    Ces deux fonctions montrent un message via Toast quand le chargement est fini.
    fun onRequestSuccess(message: String)
    fun onRequestError(message: String)
}
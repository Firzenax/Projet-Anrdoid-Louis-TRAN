package com.example.projetandroidlouistran

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class RecipePage : AppCompatActivity(),RecipeBoardView {
    //    On initialise des variables repésentant les élément présent sur la page
    lateinit var recyclerView: RecyclerView
    lateinit var swipeRefresh: SwipeRefreshLayout
    lateinit var recipePresenter: RecipeBoardPresenter
    lateinit var itemVideoLinkClick: RecipesAdapter.ItemClick
    lateinit var mProgressDialog: ProgressDialog

    lateinit var recipes: Recipes
    lateinit var mRecipeAdapter : RecipesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_page)
        recyclerView = findViewById(R.id.recycler_view)
        swipeRefresh = findViewById(R.id.swipe_refresh)
        recyclerView.layoutManager = LinearLayoutManager(this)


        recipePresenter = RecipeBoardPresenter(this)


        recipePresenter.getRecipesData()


        swipeRefresh.setOnRefreshListener {


            recipePresenter.getRecipesData()


        }

        itemVideoLinkClick = object : RecipesAdapter.ItemClick {
            override fun onItemClick(view: View, position: Int) {

                val video_link = recipes.meals?.get(position)?.strYoutube

                val uri = Uri.parse("$video_link")
                val intent = Intent(Intent.ACTION_VIEW,uri)

                startActivity(intent)

            }

        }

    }


    override fun showLoading() {
        swipeRefresh.isRefreshing = true
    }

    override fun hideLoading() {
        swipeRefresh.isRefreshing =false
    }

    override fun getResult(userList: Recipes?) {
        mRecipeAdapter = RecipesAdapter(this, userList, itemVideoLinkClick)
        mRecipeAdapter.notifyDataSetChanged()
        recyclerView.adapter = mRecipeAdapter
        recipes = userList!!
    }

    override fun showProgress() {
        mProgressDialog.show()
    }

    override fun hideProgress() {
        mProgressDialog.dismiss()
    }

    override fun onRequestSuccess(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }

    override fun onRequestError(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }

    private fun checkConnection(): Boolean {
        val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return cm.activeNetworkInfo != null

    }

    override fun onResume() {
        super.onResume()

        if(!checkConnection())
        {
            showMessage("Connection Problem!!..","May be you are not connected to internet , Try connecting on internet and try again.. ")
        }
    }

    private fun showMessage(title: String, message: String) {
        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, which -> dialog.dismiss()}
        builder.setCancelable(false)
        builder.show()
    }
}
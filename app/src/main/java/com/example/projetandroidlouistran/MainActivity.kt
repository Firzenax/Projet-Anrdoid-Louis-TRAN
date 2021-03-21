package com.example.projetandroidlouistran

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//Creation de deux variable devant représenter les bouton.
    fun getARecipe(view: View) {
        val intent = Intent(this, RecipePage::class.java)
        startActivity(intent)
    }
    fun getACocktail(view: View) {
        val intent = Intent(this, CocktailActivity::class.java)
        startActivity(intent)
    }
}
package com.example.projetandroidlouistran

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecipesAdapter(private val context: Context, private val recipe: Recipes?, private val itemClick: ItemClick) : RecyclerView.Adapter<RecipesAdapter.RecyclerViewAdapter>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerViewAdapter {

        val view = LayoutInflater.from(context).inflate(R.layout.recipe_list, viewGroup, false)


        return RecyclerViewAdapter(view, itemClick)


    }
    override fun onBindViewHolder(holder: RecyclerViewAdapter, pos: Int) {

        val recipe_data = recipe

        holder.recipe_title_name.text = "${recipe_data!!.meals!![pos].strMeal}"

        Picasso.get()
            .load("${recipe_data.meals!![pos].strMealThumb}")
            .into(holder.recipe_img)

        holder.recipe_description.text = "Method \n\n${recipe_data.meals!![pos].strInstructions}"

        holder.recipe_category.text = "${recipe_data.meals!![pos].strCategory}"

        if(recipe_data.meals!![pos].strTags != null)
        {
            holder.recipe_tags.text = "Tags: ${recipe_data.meals!![pos].strTags}"
        }
        else
        {
            holder.recipe_tags.visibility = View.GONE
        }



        holder.recipe_category.text = "Category : ${recipe_data.meals!![pos].strCategory}"


        if(recipe_data.meals!![pos].strIngredient1 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient1 + "," + recipe_data.meals!![pos].strMeasure1 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient2 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient2 + "," + recipe_data.meals!![pos].strMeasure2 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient3 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient3 + "," + recipe_data.meals!![pos].strMeasure3 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient4 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient4 + "," + recipe_data.meals!![pos].strMeasure4 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient5 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient5 + "," + recipe_data.meals!![pos].strMeasure5 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient6 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient6 + "," + recipe_data.meals!![pos].strMeasure6 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient7 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient7 + "," + recipe_data.meals!![pos].strMeasure7 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient8 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient8 + "," + recipe_data.meals!![pos].strMeasure8 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient9 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient9 + "," + recipe_data.meals!![pos].strMeasure9 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient10 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient10 + "," + recipe_data.meals!![pos].strMeasure10 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient11 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient11 + "," + recipe_data.meals!![pos].strMeasure11 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient12 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient12 + "," + recipe_data.meals!![pos].strMeasure12 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient13 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient13 + "," + recipe_data.meals!![pos].strMeasure13 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient14 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient14 + "," + recipe_data.meals!![pos].strMeasure14 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient15 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient15 + "," + recipe_data.meals!![pos].strMeasure15 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient16 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient16 + "," + recipe_data.meals!![pos].strMeasure16 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient17 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient17 + "," + recipe_data.meals!![pos].strMeasure17 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient18 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient18 + "," + recipe_data.meals!![pos].strMeasure18 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient19 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient19 + "," + recipe_data.meals!![pos].strMeasure19 + "\n" )
        }
        if(recipe_data.meals!![pos].strIngredient20 != "")
        {
            holder.strBuffer.append(recipe_data.meals!![pos].strIngredient20 + "," + recipe_data.meals!![pos].strMeasure20 + "\n" )
        }



        holder.recipe_ingredients.text = "Ingredients \n\n ${holder.strBuffer.toString()}"

        holder.recipe_video_link.text = "${recipe_data.meals!![pos].strYoutube}"


    }

    override fun getItemCount(): Int {

        return 1
    }

    inner class RecyclerViewAdapter(itemView: View, var itemClick: ItemClick) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        var recipe_title_name: TextView
        var recipe_img: ImageView
        var recipe_description: TextView
        var recipe_category : TextView
        var recipe_tags : TextView
        var recipe_ingredients : TextView
        var recipe_video_link : TextView
        var strBuffer : StringBuffer


        init {

            recipe_title_name = itemView.findViewById(R.id.recipe_name)
            recipe_img = itemView.findViewById(R.id.recipe_img)
            recipe_description = itemView.findViewById(R.id.recipe_descp)
            recipe_category = itemView.findViewById(R.id.recipe_category)
            recipe_tags = itemView.findViewById(R.id.recipe_tags)
            recipe_ingredients = itemView.findViewById(R.id.recipe_ingredients)
            recipe_video_link = itemView.findViewById(R.id.recipe_video_link)

            recipe_video_link.setOnClickListener(this)

            strBuffer = StringBuffer()

        }

        override fun onClick(v: View) {
            itemClick.onItemClick(v, adapterPosition)
        }


    }

    interface ItemClick {
        fun onItemClick(view: View, position: Int)
    }



}
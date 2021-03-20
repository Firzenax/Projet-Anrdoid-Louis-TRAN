package com.example.projetandroidlouistran


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CocktailRecipesAdapter(private val context: Context, private val cocktailrecipe: CocktailRecipes?, private val itemClick: ItemClick) : RecyclerView.Adapter<CocktailRecipesAdapter.RecyclerViewAdapter>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerViewAdapter {

        val view = LayoutInflater.from(context).inflate(R.layout.cocktail_list, viewGroup, false)


        return RecyclerViewAdapter(view, itemClick)


    }
    override fun onBindViewHolder(holder: RecyclerViewAdapter, pos: Int) {

        val recipe_data = cocktailrecipe

        holder.recipe_title_name.text = "${recipe_data!!.cocktails!![pos].strDrink}"

        Picasso.get()
            .load("${recipe_data.cocktails!![pos].strDrinkThumb}")
            .into(holder.recipe_img)

        holder.recipe_description.text = "Method \n\n${recipe_data.cocktails!![pos].strInstructions}"

        holder.recipe_category.text = "${recipe_data.cocktails!![pos].strCategory}"

        if(recipe_data.cocktails!![pos].strTags != null)
        {
            holder.recipe_tags.text = "Tags: ${recipe_data.cocktails!![pos].strTags}"
        }
        else
        {
            holder.recipe_tags.visibility = View.GONE
        }



        holder.recipe_category.text = "Category : ${recipe_data.cocktails!![pos].strCategory}"


        if(recipe_data.cocktails!![pos].strIngredient1 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient1 + "," + recipe_data.cocktails!![pos].strMeasure1 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient2 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient2 + "," + recipe_data.cocktails!![pos].strMeasure2 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient3 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient3 + "," + recipe_data.cocktails!![pos].strMeasure3 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient4 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient4 + "," + recipe_data.cocktails!![pos].strMeasure4 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient5 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient5 + "," + recipe_data.cocktails!![pos].strMeasure5 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient6 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient6 + "," + recipe_data.cocktails!![pos].strMeasure6 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient7 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient7 + "," + recipe_data.cocktails!![pos].strMeasure7 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient8 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient8 + "," + recipe_data.cocktails!![pos].strMeasure8 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient9 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient9 + "," + recipe_data.cocktails!![pos].strMeasure9 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient10 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient10 + "," + recipe_data.cocktails!![pos].strMeasure10 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient11 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient11 + "," + recipe_data.cocktails!![pos].strMeasure11 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient12 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient12 + "," + recipe_data.cocktails!![pos].strMeasure12 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient13 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient13 + "," + recipe_data.cocktails!![pos].strMeasure13 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient14 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient14 + "," + recipe_data.cocktails!![pos].strMeasure14 + "\n" )
        }
        if(recipe_data.cocktails!![pos].strIngredient15 != "")
        {
            holder.strBuffer.append(recipe_data.cocktails!![pos].strIngredient15 + "," + recipe_data.cocktails!![pos].strMeasure15 + "\n" )
        }


        holder.recipe_ingredients.text = "Ingredients \n\n ${holder.strBuffer.toString()}"

        holder.recipe_video_link.text = "${recipe_data.cocktails!![pos].strVideo}"


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
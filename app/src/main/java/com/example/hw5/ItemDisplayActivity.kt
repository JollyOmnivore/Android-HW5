package com.example.hw5

import android.content.Intent
import android.icu.text.Transliterator.Position
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

lateinit var nameTextView: TextView
lateinit var descriptionTextView: TextView
lateinit var imageView: ImageView
lateinit var deleteButton: Button

class ItemDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_display)
        val name = intent.getStringExtra("Name")
        val description = intent.getStringExtra("Description")
        val imageID = intent.getIntExtra("Image", 0)
        val position = intent.getIntExtra("Position", 0)

        nameTextView = findViewById(R.id.itemNameView)
        descriptionTextView = findViewById(R.id.itemDescriptionView)
        imageView = findViewById(R.id.imageView)
        deleteButton = findViewById(R.id.deleteButton)

        nameTextView.text = name.toString()
        descriptionTextView.text = description.toString()
        imageView.setImageResource(imageID)

        deleteButton.setOnClickListener {
            if(name == VideoGames.Games[position].name.toString()){
                VideoGames.Games.removeAt(position)
                val intent = Intent(applicationContext, VideoGameListActivity::class.java)
                startActivity(intent)
            }
            else if (name == Shows.Shows[position].name.toString()){
                Shows.Shows.removeAt(position)
                val intent = Intent(applicationContext, ShowsListActivity::class.java)
                startActivity(intent)
            }
            else if(name== Foods.Foods[position].name.toString()) {
                Foods.Foods.removeAt(position)
                val intent = Intent(applicationContext, FoodsListActivity::class.java)
                startActivity(intent)
            }

        }







    }




}
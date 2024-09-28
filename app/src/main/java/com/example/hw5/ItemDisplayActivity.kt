package com.example.hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

lateinit var nameTextView: TextView
lateinit var descriptionTextView: TextView
lateinit var imageView: ImageView

class ItemDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_display)
        val name = intent.getStringExtra("Name")
        val description = intent.getStringExtra("Description")
        val imageID = intent.getIntExtra("Image", 0)

        nameTextView = findViewById(R.id.itemNameView)
        descriptionTextView = findViewById(R.id.itemDescriptionView)
        imageView = findViewById(R.id.imageView)

        nameTextView.text = name.toString()
        descriptionTextView.text = description.toString()
        imageView.setImageResource(imageID)



    }


}
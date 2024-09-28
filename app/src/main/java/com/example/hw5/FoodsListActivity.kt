package com.example.hw5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Switch

lateinit var foodsListView: ListView
lateinit var foodsSwitch: Switch

class FoodsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods_list)
        var switchBool = false
        // First view set up

        foodsListView = findViewById(R.id.foodsListView)
        foodsSwitch = findViewById(R.id.foodsDeleteSwitch)
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_1,
            Foods.Foods
        )
        foodsListView.adapter = adapter
        // end of First view set up


        //Switch listener
        foodsSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                switchBool = true
            } else {
                switchBool = false
            }
        }
        //Switch listener END


        foodsListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            if (switchBool) {
                Foods.Foods.removeAt(position)
                adapter.notifyDataSetChanged()
            }
            else {
                val intent = Intent(applicationContext, ItemDisplayActivity::class.java)
                intent.putExtra("Name", Foods.Foods[position].name)
                intent.putExtra("Description", Foods.Foods[position].description)
                intent.putExtra("Image", Foods.Foods[position].ImageReasourceID)
                startActivity(intent)
            }
        }



    }
}
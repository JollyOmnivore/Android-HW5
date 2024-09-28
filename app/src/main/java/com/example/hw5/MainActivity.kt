package com.example.hw5
import android.content.Intent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


lateinit var listView: ListView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // First view set up
        val categorys = mutableListOf("Video Games","Shows", "Food")
        listView = findViewById(R.id.frontPageList)
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_1,
            categorys
        )
        listView.adapter = adapter
        // end of First view set up



        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            when (position) {
                0 -> {
                    val intent = Intent(applicationContext, VideoGameListActivity::class.java)
                    startActivity(intent)
                }
                1 -> {
                    val intent = Intent(applicationContext, ShowsListActivity::class.java)
                    startActivity(intent)
                }
                2 -> {
                    val intent = Intent(applicationContext, FoodsListActivity::class.java)
                    startActivity(intent)
                }
            }


            }

            //Fruit.fruit.removeAt(position)
            //adapter.notifyDataSetChanged()



    }





}
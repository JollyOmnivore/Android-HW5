package com.example.hw5
//import VideoGames
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Switch

lateinit var showsListView: ListView
lateinit var deleteSwitchShowView: Switch

class ShowsListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shows_list)
        var switchBool = false
        // First view set up

        showsListView = findViewById(R.id.showListView)
        deleteSwitchShowView = findViewById(R.id.showsDeleteSwitch)
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_1,
            Shows.Shows
        )
        showsListView.adapter = adapter
        // end of First view set up


        //Switch listener
        deleteSwitchShowView.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                switchBool = true
            } else {
                switchBool = false
            }
        }
        //Switch listener END


        showsListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            if (switchBool) {
                Shows.Shows.removeAt(position)
                adapter.notifyDataSetChanged()
            }
            else {
                val intent = Intent(applicationContext, ItemDisplayActivity::class.java)
                intent.putExtra("Name", Shows.Shows[position].name)
                intent.putExtra("Description", Shows.Shows[position].description)
                intent.putExtra("Image", Shows.Shows[position].ImageReasourceID)
                intent.putExtra("Position", position)
                startActivity(intent)
            }
        }



    }
}
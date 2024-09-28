package com.example.hw5
//import VideoGames
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Switch

lateinit var videoGameListView: ListView
lateinit var deleteSwitch: Switch

class VideoGameListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_game_list)
        var switchBool = false
        // First view set up
        deleteSwitch = findViewById(R.id.deleteSwitch)
        listView = findViewById(R.id.videoGameListView)
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_1,
            VideoGames.Games
        )
        listView.adapter = adapter
        // end of First view set up


        //Switch listener
        deleteSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                switchBool = true
            } else {
                switchBool = false
            }
        }
        //Switch listener END


        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            if (switchBool) {
               VideoGames.Games.removeAt(position)
                adapter.notifyDataSetChanged()
            }
            else {
                val intent = Intent(applicationContext, ItemDisplayActivity::class.java)
                intent.putExtra("Name", VideoGames.Games[position].name)
                intent.putExtra("Description", VideoGames.Games[position].description)
                intent.putExtra("Image", VideoGames.Games[position].ImageReasourceID)
                startActivity(intent)
            }
        }



    }
}
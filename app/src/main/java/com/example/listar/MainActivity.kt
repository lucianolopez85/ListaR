package com.example.listar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listViewCreated = findViewById<ListView>(R.id.list_view)
        var list = mutableListOf<Model>()
        list.add(Model( "Facebook", "facebook description", R.drawable.img_facebook))
        list.add(Model("whatsapp", "whatsapp description", R.drawable.img_whatsapp))
        list.add(Model("YouTube", "YouTube description", R.drawable.img_youtube))
        list.add(Model("twitter", "twitter description", R.drawable.img_twitter))
        list.add((Model("Discord", "Discrod description", R.drawable.img_discord)))

        listViewCreated.adapter = MyAdapter(this, R.layout.row, list)

        listViewCreated.setOnItemClickListener { parent:AdapterView<*>, view:View, position: Int, id:Long ->
            if (position == 0){
                Toast.makeText(this, "Facebook", Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(this, "whatsapp", Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(this, "YouTube", Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(this, "twitter", Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(this, "Discord", Toast.LENGTH_LONG).show()
            }


        }
    }
}
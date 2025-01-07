package com.example.solarsystem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.common.SolarSystemDatabase
import com.example.solarsystem.domain.planet.PlanetAdapter
import com.example.solarsystem.domain.planet.PlanetItemListener

class MainActivity : AppCompatActivity(), PlanetItemListener {

    private val planetsList: RecyclerView by lazy { findViewById(R.id.main_rv_planets) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val planets = SolarSystemDatabase.getPlanets()

        val adapter = PlanetAdapter(planets)
        adapter.setPlanetItemListener(this)

        planetsList.layoutManager = LinearLayoutManager(baseContext)
        planetsList.adapter = adapter

    }

    override fun onPlanetClick(view: View, position: Int) {
        val it = Intent(this, InfoActivity::class.java)
        it.putExtra("planet", position)
        startActivity(it)
    }
}
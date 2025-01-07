package com.example.solarsystem

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.solarsystem.common.SolarSystemDatabase
import com.example.solarsystem.domain.planet.PlanetAdapter

class MainActivity : AppCompatActivity() {

    private val planetsList: RecyclerView by lazy { findViewById(R.id.main_rv_planets) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val planets = SolarSystemDatabase.getPlanets()

        val adapter = PlanetAdapter(planets)


        planetsList.layoutManager = LinearLayoutManager(baseContext)
        planetsList.adapter = adapter


    }
}
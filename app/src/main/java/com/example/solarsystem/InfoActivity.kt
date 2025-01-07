package com.example.solarsystem

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.solarsystem.common.SolarSystemDatabase

class InfoActivity : AppCompatActivity() {

    private val image: ImageView by lazy { findViewById(R.id.info_iv_photo) }
    private val name: TextView by lazy { findViewById(R.id.info_tv_name) }
    private val meanDiameter: TextView by lazy { findViewById(R.id.info_tv_mean_diameter) }
    private val surfaceArea: TextView by lazy { findViewById(R.id.info_tv_surface_area) }
    private val meanDensity: TextView by lazy { findViewById(R.id.info_tv_mean_density) }
    private val volume: TextView by lazy { findViewById(R.id.info_tv_volume) }
    private val mass: TextView by lazy { findViewById(R.id.info_tv_mass) }
    private val surfaceGravity: TextView by lazy { findViewById(R.id.info_tv_surface_gravity) }
    private val description: TextView by lazy { findViewById(R.id.info_tv_description) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_info)

        val planetId = intent.getIntExtra("plant_id", 1)
        val planet = SolarSystemDatabase.getPlanetById(planetId)!!

        image.setImageResource(planet.photo)
        name.text = planet.name
        meanDiameter.text = planet.meanDiameter.toString()
        surfaceArea.text = planet.surfaceArea.toString()
        meanDensity.text = planet.meanDensity.toString()
        volume.text = planet.volume.toString()
        mass.text = planet.mass.toString()
        surfaceGravity.text = planet.surfaceGravity.toString()
        description.text = planet.description

    }
}
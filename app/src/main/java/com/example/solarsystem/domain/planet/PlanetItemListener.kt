package com.example.solarsystem.domain.planet

import android.view.View

interface PlanetItemListener {

    fun onPlanetClick(view: View, position: Int)
}
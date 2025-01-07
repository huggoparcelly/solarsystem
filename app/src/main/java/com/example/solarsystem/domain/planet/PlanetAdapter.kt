package com.example.solarsystem.domain.planet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.solarsystem.R

class PlanetAdapter(val planets: List<Planet>): Adapter<PlanetAdapter.PlanetViewHolder>() {

    private var planetItemListener: PlanetItemListener? = null

    fun setPlanetItemListener(listener: PlanetItemListener) {
        this.planetItemListener = listener
    }

    class PlanetViewHolder(view: View, planetListener: PlanetItemListener?): ViewHolder(view) {

        val name: TextView = view.findViewById (R.id.card_tv_planet_name)
        val image: ImageView = view.findViewById(R.id.card_image)

        init {
            view.setOnClickListener {
                planetListener?.onPlanetClick(view, adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_planet, parent, false)

        return PlanetViewHolder(view, planetItemListener)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.name.text = planets[position].name
        holder.image.setImageResource(planets[position].photo)
    }

    override fun getItemCount(): Int = planets.size

}
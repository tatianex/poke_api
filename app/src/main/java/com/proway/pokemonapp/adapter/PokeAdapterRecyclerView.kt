package com.proway.pokemonapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.proway.pokemonapp.R
import com.proway.pokemonapp.databinding.OnePokemonBinding
import com.proway.pokemonapp.model.Pokemon

class PokeAdapterRecyclerView : RecyclerView.Adapter<PokemonViewHolder>() {

    private var pokemons = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        pokemons[position].apply {
            holder.bind(this)
        }
    }

    override fun getItemCount(): Int = pokemons.size

    fun update(newList: List<Pokemon>) {
        pokemons.clear()
        pokemons.addAll(newList)
        notifyDataSetChanged()
    }
}

class PokemonViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    private var binding: OnePokemonBinding = OnePokemonBinding.bind(itemView)

    fun bind(pokemon: Pokemon) {

        binding.idTextView.text = "#${pokemon.extractIdFromUrl()}"
        binding.nameTextView.text = pokemon.name
    }
}
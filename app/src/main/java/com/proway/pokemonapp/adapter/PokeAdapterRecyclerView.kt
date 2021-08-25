package com.proway.pokemonapp.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.proway.pokemonapp.R
import com.proway.pokemonapp.databinding.OnePokemonBinding
import com.proway.pokemonapp.model.Pokemon

class PokeAdapterRecyclerView : RecyclerView.Adapter<PokemonViewHolder>() {

    private var pokemons = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_pokemon, parent, false)
        return PokemonViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.M)
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

    @RequiresApi(Build.VERSION_CODES.M)
    fun bind(pokemon: Pokemon) {

        binding.idTextView.text = "#${pokemon.extractIdFromUrl(withPads = true)}"
        binding.nameTextView.text = pokemon.name.replaceFirstChar {
            it.uppercase()
        }

        pokemon.details?.let {
            Glide.with(itemView.context)
                .load(it.sprites.other.artwork?.image)
                .into(binding.avatarImageView)

            val pokeTypeSetup = it.type[0].type.extractPokeSetup()
            binding.cardItem.setCardBackgroundColor(itemView.context.getColor(pokeTypeSetup.colorCard))
            binding.typesContainer.typeCardView1.setCardBackgroundColor(
                itemView.context.getColor(
                    pokeTypeSetup.colorType
                )
            )
            binding.typesContainer.typeImageView1.setImageDrawable(
                itemView.context.getDrawable(
                    pokeTypeSetup.icon
                )
            )
            binding.typesContainer.typeTextView1.text = it.type[0].type.typeName

            if (it.type.size > 1) {
                val setupCard2 = it.type[1].type.extractPokeSetup()
                binding.typesContainer.typeCardView2.setCardBackgroundColor(
                    itemView.context.getColor(
                        setupCard2.colorType
                    )
                )
                binding.typesContainer.typeImageView2.setImageDrawable(
                    itemView.context.getDrawable(
                        setupCard2.icon
                    )
                )
                binding.typesContainer.typeTextView2.text =
                    it.type[1].type.typeName
                binding.typesContainer.typeCardView2.visibility = View.VISIBLE
            } else {
                binding.typesContainer.typeCardView2.visibility = View.GONE
            }
        }
    }
}
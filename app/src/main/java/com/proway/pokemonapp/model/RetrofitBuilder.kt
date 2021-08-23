package com.proway.pokemonapp.model

import com.proway.pokemonapp.services.PokeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://pokeapi.co")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getPokeService(): PokeService {
        return retrofit.create(PokeService::class.java)
    }
}
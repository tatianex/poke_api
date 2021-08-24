package com.proway.pokemonapp.services

import com.proway.pokemonapp.model.PokeResponse
import com.proway.pokemonapp.model.PokemonDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeService {

    @GET("/api/v2/pokemon/")
    fun getAll(@Query("limit") limit: Int): Call<PokeResponse>

    @GET("/api/v2/pokemon/{id}")
    fun getDetails(@Path("id") id: String): Call<PokemonDetails>
}
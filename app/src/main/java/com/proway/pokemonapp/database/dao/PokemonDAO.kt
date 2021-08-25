package com.proway.pokemonapp.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.proway.pokemonapp.model.Pokemon
import com.proway.pokemonapp.model.Types

@Dao
interface PokemonDAO {

    @Query("SELECT * FROM table_pokemon ORDER BY poke_name")
    fun getAll(): List<Pokemon>

    @Query("SELECT * FROM table_pokemon WHERE poke_name = :pokeId")
    fun byId(pokeId: String): Pokemon

    @Query("SELECT * FROM table_pokemon WHERE poke_name LIKE '%' || :query || '%'")
    fun fetchFiltered(query: String) : List<Pokemon>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(pokemon: Pokemon)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertType(types: List<Types>)
}
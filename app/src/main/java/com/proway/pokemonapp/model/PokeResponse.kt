package com.proway.pokemonapp.model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class PokeResponse( val results: List<Pokemon>)

@Entity(tableName = "table_pokemon")
// to rename an entity not needed but doable

data class Pokemon(
    @PrimaryKey
    @ColumnInfo (name = "poke_name")
    @SerializedName("name")
    val name: String,

    @ColumnInfo(name = "poke_url")
    @SerializedName("url")
    val url: String,

    @Embedded
    var details: PokemonDetails
) {

    fun extractIdFromUrl(withPads: Boolean = false) : String {
        val listStr = url.split("/")
        return if (withPads) listStr[6].padStart(4, '0') else listStr[6]
    }
}

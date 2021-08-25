package com.proway.pokemonapp.model

import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.proway.pokemonapp.R

@Entity
data class PokemonDetails(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "details_id")
    val id: Int,

    @SerializedName("sprites")
    @Embedded
    val sprites: Sprites,

    @SerializedName("types")
    val type: List<Types>
)

@Entity
data class Sprites(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "sprites_id")
    val id: Int,
    @SerializedName("other")
    @Embedded
    val other: Other
)

@Entity
data class Other(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "other_id")
    val id: Int,
    @SerializedName("official-artwork")
    @Embedded
    val artwork: Artwork?
)

@Entity
data class Artwork(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "artwork_id")
    val id: Int,
    @SerializedName("front_default")
    val image: String?
)
@Entity
data class Types(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "types_pokemon_id")
    val id: Int,
    var pokemonFk: Long,


    @SerializedName("slot")
    val slot: String,

    @Embedded
    @SerializedName("type")
    val type: PokemonType,
)

@Entity
data class PokemonType(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "pokemon_type_name")
    val id: Int,

    @SerializedName("name")
    val typeName: String,

    @ColumnInfo(name = "pokemon_type_url")
    @SerializedName("url")
    val typeUrl: String,
) {

    fun extractPokeSetup(): PokeTypeSetup {
        return when (typeName) {
            "bug" -> PokeTypeSetup.BUG
            "water" -> PokeTypeSetup.WATER
            "steel" -> PokeTypeSetup.STEEL
            "fairy" -> PokeTypeSetup.FAIRY
            "ghost" -> PokeTypeSetup.GHOST
            "normal" -> PokeTypeSetup.NORMAL
            "dark" -> PokeTypeSetup.DARK
            "fighting" -> PokeTypeSetup.FIGHTING
            "grass" -> PokeTypeSetup.GRASS
            "poison" -> PokeTypeSetup.POISON
            "dragon" -> PokeTypeSetup.DRAGON
            "fire" -> PokeTypeSetup.FIRE
            "ground" -> PokeTypeSetup.GROUND
            "psychic" -> PokeTypeSetup.PSYCHIC
            "electric" -> PokeTypeSetup.ELECTRIC
            "flying" -> PokeTypeSetup.FLYING
            "ice" -> PokeTypeSetup.ICE
            "rock" -> PokeTypeSetup.ROCK
            else -> PokeTypeSetup.NORMAL
        }
    }
}

enum class PokeTypeSetup(
    @ColorInt val colorCard: Int,
    @DrawableRes val icon: Int,
    @ColorInt val colorType: Int
) {
    BUG(R.color.bg_type_bug, R.drawable.ic_bug, R.color.type_bug),
    STEEL(R.color.bg_type_steel, R.drawable.ic_steel, R.color.type_steel),
    WATER(R.color.bg_type_water, R.drawable.ic_water, R.color.type_water),
    FAIRY(R.color.bg_type_fairy, R.drawable.ic_fairy, R.color.type_fairy),
    GHOST(R.color.bg_type_ghost, R.drawable.ic_ghost, R.color.type_ghost),
    NORMAL(R.color.bg_type_normal, R.drawable.ic_normal, R.color.type_normal),
    DARK(R.color.bg_type_dark, R.drawable.ic_dark, R.color.bg_type_dark),
    FIGHTING(R.color.bg_type_fighting, R.drawable.ic_fighting, R.color.type_fighting),
    GRASS(R.color.bg_type_grass, R.drawable.ic_grass, R.color.type_grass),
    POISON(R.color.bg_type_poison, R.drawable.ic_poison, R.color.type_poison),
    DRAGON(R.color.bg_type_dragon, R.drawable.ic_dragon, R.color.type_dragon),
    FIRE(R.color.bg_type_fire, R.drawable.ic_fire, R.color.type_fire),
    GROUND(R.color.bg_type_ground, R.drawable.ic_ground, R.color.type_ground),
    PSYCHIC(R.color.bg_type_psychic, R.drawable.ic_psychic, R.color.type_psychic),
    ELECTRIC(R.color.bg_type_electric, R.drawable.ic_electric, R.color.bg_type_electric),
    FLYING(R.color.bg_type_flying, R.drawable.ic_flying, R.color.type_flying),
    ICE(R.color.bg_type_ice, R.drawable.ic_ice, R.color.type_ice),
    ROCK(R.color.bg_type_rock, R.drawable.ic_rock, R.color.type_rock),
}

//    fun extractBgColor(): Int {
//        return when (typeName) {
//            "bug" -> R.color.bg_type_bug
//            "water" -> R.color.bg_type_water
//            "fairy" -> R.color.bg_type_fairy
//            "ghost" -> R.color.bg_type_ghost
//            "normal" -> R.color.bg_type_normal
//            "dark" -> R.color.bg_type_dark
//            "fighting" -> R.color.bg_type_fighting
//            "grass" -> R.color.bg_type_grass
//            "poison" -> R.color.bg_type_poison
//            "dragon" -> R.color.bg_type_dragon
//            "fire" -> R.color.bg_type_fire
//            "ground" -> R.color.bg_type_ground
//            "psychic" -> R.color.bg_type_psychic
//            "electric" -> R.color.bg_type_electric
//            "flying" -> R.color.bg_type_flying
//            "ice" -> R.color.bg_type_ice
//            "rock" -> R.color.bg_type_rock
//            else -> R.color.bg_type_normal
//        }
//    }

package com.proway.pokemonapp.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/proway/pokemonapp/database/dao/PokemonDAO;", "", "byId", "Lcom/proway/pokemonapp/model/Pokemon;", "pokeId", "", "getAll", "", "insert", "", "pokemon", "app_debug"})
public abstract interface PokemonDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM table_pokemon ORDER BY poke_name")
    public abstract java.util.List<com.proway.pokemonapp.model.Pokemon> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM table_pokemon WHERE poke_name = :pokeId")
    public abstract com.proway.pokemonapp.model.Pokemon byId(@org.jetbrains.annotations.NotNull()
    java.lang.String pokeId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.proway.pokemonapp.model.Pokemon pokemon);
}
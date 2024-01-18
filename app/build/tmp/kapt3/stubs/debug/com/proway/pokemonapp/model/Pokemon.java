package com.proway.pokemonapp.model;

import java.lang.System;

@androidx.room.Entity(tableName = "table_pokemon")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0010\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0014J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/proway/pokemonapp/model/Pokemon;", "", "name", "", "url", "details", "Lcom/proway/pokemonapp/model/PokemonDetails;", "(Ljava/lang/String;Ljava/lang/String;Lcom/proway/pokemonapp/model/PokemonDetails;)V", "getDetails", "()Lcom/proway/pokemonapp/model/PokemonDetails;", "setDetails", "(Lcom/proway/pokemonapp/model/PokemonDetails;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "extractIdFromUrl", "withPads", "hashCode", "", "toString", "app_debug"})
public final class Pokemon {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "poke_name")
    @androidx.room.PrimaryKey
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "poke_url")
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull
    @androidx.room.Embedded
    private com.proway.pokemonapp.model.PokemonDetails details;
    
    @org.jetbrains.annotations.NotNull
    public final com.proway.pokemonapp.model.Pokemon copy(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    com.proway.pokemonapp.model.PokemonDetails details) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Pokemon(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    com.proway.pokemonapp.model.PokemonDetails details) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proway.pokemonapp.model.PokemonDetails component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.proway.pokemonapp.model.PokemonDetails getDetails() {
        return null;
    }
    
    public final void setDetails(@org.jetbrains.annotations.NotNull
    com.proway.pokemonapp.model.PokemonDetails p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String extractIdFromUrl(boolean withPads) {
        return null;
    }
}
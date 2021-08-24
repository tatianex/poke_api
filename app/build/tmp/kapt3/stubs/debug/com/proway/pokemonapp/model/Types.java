package com.proway.pokemonapp.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/proway/pokemonapp/model/Types;", "", "id", "", "pokemonFk", "", "slot", "", "type", "Lcom/proway/pokemonapp/model/PokemonType;", "(IJLjava/lang/String;Lcom/proway/pokemonapp/model/PokemonType;)V", "getId", "()I", "getPokemonFk", "()J", "setPokemonFk", "(J)V", "getSlot", "()Ljava/lang/String;", "getType", "()Lcom/proway/pokemonapp/model/PokemonType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Types {
    @androidx.room.ColumnInfo(name = "types_pokemon_id")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final int id = 0;
    private long pokemonFk;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "slot")
    private final java.lang.String slot = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final com.proway.pokemonapp.model.PokemonType type = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.proway.pokemonapp.model.Types copy(int id, long pokemonFk, @org.jetbrains.annotations.NotNull()
    java.lang.String slot, @org.jetbrains.annotations.NotNull()
    com.proway.pokemonapp.model.PokemonType type) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Types(int id, long pokemonFk, @org.jetbrains.annotations.NotNull()
    java.lang.String slot, @org.jetbrains.annotations.NotNull()
    com.proway.pokemonapp.model.PokemonType type) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getPokemonFk() {
        return 0L;
    }
    
    public final void setPokemonFk(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proway.pokemonapp.model.PokemonType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proway.pokemonapp.model.PokemonType getType() {
        return null;
    }
}
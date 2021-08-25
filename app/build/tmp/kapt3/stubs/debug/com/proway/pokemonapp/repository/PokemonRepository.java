package com.proway.pokemonapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u000eJ\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0010J,\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00102\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\f0\u000eJ\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0013J\u0014\u0010\u0019\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/proway/pokemonapp/repository/PokemonRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/proway/pokemonapp/database/AppDataBase;", "service", "Lcom/proway/pokemonapp/services/PokeService;", "getService", "()Lcom/proway/pokemonapp/services/PokeService;", "fetchAll", "", "onComplete", "Lkotlin/Function2;", "Lcom/proway/pokemonapp/model/PokeResponse;", "", "fetchAllFromDatabase", "", "Lcom/proway/pokemonapp/model/Pokemon;", "fetchAllFromDatabaseWithFilter", "query", "fetchPokemonDetails", "pokeId", "Lcom/proway/pokemonapp/model/PokemonDetails;", "insertIntoDatabase", "pokemon", "items", "app_debug"})
public final class PokemonRepository {
    private final android.content.Context context = null;
    private final com.proway.pokemonapp.database.AppDataBase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.proway.pokemonapp.services.PokeService service = null;
    
    public PokemonRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.proway.pokemonapp.services.PokeService getService() {
        return null;
    }
    
    public final void fetchAll(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.proway.pokemonapp.model.PokeResponse, ? super java.lang.String, kotlin.Unit> onComplete) {
    }
    
    public final void fetchPokemonDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String pokeId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.proway.pokemonapp.model.PokemonDetails, ? super java.lang.String, kotlin.Unit> onComplete) {
    }
    
    public final void insertIntoDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.proway.pokemonapp.model.Pokemon> items) {
    }
    
    public final void insertIntoDatabase(@org.jetbrains.annotations.NotNull()
    com.proway.pokemonapp.model.Pokemon pokemon) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.proway.pokemonapp.model.Pokemon> fetchAllFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.proway.pokemonapp.model.Pokemon> fetchAllFromDatabaseWithFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}
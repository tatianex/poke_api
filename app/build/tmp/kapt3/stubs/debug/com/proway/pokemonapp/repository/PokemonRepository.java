package com.proway.pokemonapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/proway/pokemonapp/repository/PokemonRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lcom/proway/pokemonapp/database/AppDataBase;", "fetchAll", "", "onComplete", "Lkotlin/Function2;", "Lcom/proway/pokemonapp/model/PokeResponse;", "", "fetchAllFromDatabase", "", "Lcom/proway/pokemonapp/model/Pokemon;", "insertIntoDatabase", "items", "app_debug"})
public final class PokemonRepository {
    private final android.content.Context context = null;
    private final com.proway.pokemonapp.database.AppDataBase database = null;
    
    public PokemonRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void fetchAll(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.proway.pokemonapp.model.PokeResponse, ? super java.lang.String, kotlin.Unit> onComplete) {
    }
    
    public final void insertIntoDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.proway.pokemonapp.model.Pokemon> items) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.proway.pokemonapp.model.Pokemon> fetchAllFromDatabase() {
        return null;
    }
}
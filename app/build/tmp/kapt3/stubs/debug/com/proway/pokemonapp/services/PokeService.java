package com.proway.pokemonapp.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/proway/pokemonapp/services/PokeService;", "", "getAll", "Lretrofit2/Call;", "Lcom/proway/pokemonapp/model/PokeResponse;", "limit", "", "getDetails", "Lcom/proway/pokemonapp/model/PokemonDetails;", "id", "", "app_debug"})
public abstract interface PokeService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v2/pokemon/")
    public abstract retrofit2.Call<com.proway.pokemonapp.model.PokeResponse> getAll(@retrofit2.http.Query(value = "limit")
    int limit);
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/api/v2/pokemon/{id}")
    public abstract retrofit2.Call<com.proway.pokemonapp.model.PokemonDetails> getDetails(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
}
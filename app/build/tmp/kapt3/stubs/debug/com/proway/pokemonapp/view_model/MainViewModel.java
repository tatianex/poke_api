package com.proway.pokemonapp.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0018\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/proway/pokemonapp/view_model/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "get_error", "()Landroidx/lifecycle/MutableLiveData;", "_pokemons", "", "Lcom/proway/pokemonapp/model/Pokemon;", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "setError", "(Landroidx/lifecycle/LiveData;)V", "pokemons", "getPokemons", "fetchAllFromDatabase", "", "context", "Landroid/content/Context;", "fetchAllFromServer", "loadPokeDetails", "repository", "Lcom/proway/pokemonapp/repository/PokemonRepository;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> _pokemons = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> pokemons = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> error;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> getPokemons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> get_error() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void fetchAllFromServer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void fetchAllFromDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void loadPokeDetails(java.util.List<com.proway.pokemonapp.model.Pokemon> pokemons, com.proway.pokemonapp.repository.PokemonRepository repository) {
    }
}
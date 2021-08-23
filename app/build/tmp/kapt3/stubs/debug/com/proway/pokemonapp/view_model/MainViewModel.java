package com.proway.pokemonapp.view_model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/proway/pokemonapp/view_model/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_error", "Landroidx/lifecycle/MutableLiveData;", "", "get_error", "()Landroidx/lifecycle/MutableLiveData;", "_pokeResponse", "", "Lcom/proway/pokemonapp/model/Pokemon;", "get_pokeResponse", "error", "Landroidx/lifecycle/LiveData;", "getError", "()Landroidx/lifecycle/LiveData;", "setError", "(Landroidx/lifecycle/LiveData;)V", "pokeResponse", "getPokeResponse", "fetchAllFromDatabase", "", "context", "Landroid/content/Context;", "fetchAllFromServer", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> _pokeResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> pokeResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> error;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> get_pokeResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.proway.pokemonapp.model.Pokemon>> getPokeResponse() {
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
}
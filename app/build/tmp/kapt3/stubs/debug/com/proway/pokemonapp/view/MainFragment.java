package com.proway.pokemonapp.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/proway/pokemonapp/view/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/proway/pokemonapp/adapter/PokeAdapterRecyclerView;", "binding", "Lcom/proway/pokemonapp/databinding/MainFragmentBinding;", "observerPokemons", "Landroidx/lifecycle/Observer;", "", "Lcom/proway/pokemonapp/model/Pokemon;", "viewModel", "Lcom/proway/pokemonapp/view_model/MainViewModel;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showBottomSheetDialog", "Companion", "app_debug"})
public final class MainFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final com.proway.pokemonapp.view.MainFragment.Companion Companion = null;
    private com.proway.pokemonapp.view_model.MainViewModel viewModel;
    private com.proway.pokemonapp.databinding.MainFragmentBinding binding;
    private final com.proway.pokemonapp.adapter.PokeAdapterRecyclerView adapter = null;
    private final androidx.lifecycle.Observer<java.util.List<com.proway.pokemonapp.model.Pokemon>> observerPokemons = null;
    
    public MainFragment() {
        super();
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showBottomSheetDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/proway/pokemonapp/view/MainFragment$Companion;", "", "()V", "newInstance", "Lcom/proway/pokemonapp/view/MainFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.proway.pokemonapp.view.MainFragment newInstance() {
            return null;
        }
    }
}
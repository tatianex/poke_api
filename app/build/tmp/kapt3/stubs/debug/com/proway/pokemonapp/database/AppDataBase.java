package com.proway.pokemonapp.database;

import java.lang.System;

@androidx.room.Database(entities = {com.proway.pokemonapp.model.Pokemon.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/proway/pokemonapp/database/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "pokemonDAO", "Lcom/proway/pokemonapp/database/dao/PokemonDAO;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.proway.pokemonapp.database.AppDataBase.Companion Companion = null;
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.proway.pokemonapp.database.dao.PokemonDAO pokemonDAO();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/proway/pokemonapp/database/AppDataBase$Companion;", "", "()V", "getDatabase", "Lcom/proway/pokemonapp/database/AppDataBase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.proway.pokemonapp.database.AppDataBase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}
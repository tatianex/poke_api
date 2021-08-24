package com.proway.pokemonapp.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.proway.pokemonapp.model.Pokemon;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PokemonDAO_Impl implements PokemonDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pokemon> __insertionAdapterOfPokemon;

  public PokemonDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemon = new EntityInsertionAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `table_pokemon` (`poke_name`,`poke_url`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
      }
    };
  }

  @Override
  public void insert(final Pokemon pokemon) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPokemon.insert(pokemon);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Pokemon> getAll() {
    final String _sql = "SELECT * FROM table_pokemon ORDER BY poke_name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "poke_name");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "poke_url");
      final List<Pokemon> _result = new ArrayList<Pokemon>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Pokemon _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _item = new Pokemon(_tmpName,_tmpUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Pokemon byId(final String pokeId) {
    final String _sql = "SELECT * FROM table_pokemon WHERE poke_name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (pokeId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pokeId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "poke_name");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "poke_url");
      final Pokemon _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _result = new Pokemon(_tmpName,_tmpUrl);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

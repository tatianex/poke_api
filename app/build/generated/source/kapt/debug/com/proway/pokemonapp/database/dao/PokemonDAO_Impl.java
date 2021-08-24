package com.proway.pokemonapp.database.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.proway.pokemonapp.database.Converters;
import com.proway.pokemonapp.model.Artwork;
import com.proway.pokemonapp.model.Other;
import com.proway.pokemonapp.model.Pokemon;
import com.proway.pokemonapp.model.PokemonDetails;
import com.proway.pokemonapp.model.PokemonType;
import com.proway.pokemonapp.model.Sprites;
import com.proway.pokemonapp.model.Types;
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

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter<Types> __insertionAdapterOfTypes;

  public PokemonDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemon = new EntityInsertionAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `table_pokemon` (`poke_name`,`poke_url`,`details_id`,`type`,`sprites_id`,`other_id`,`artwork_id`,`image`) VALUES (?,?,?,?,?,?,?,?)";
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
        final PokemonDetails _tmpDetails = value.getDetails();
        if(_tmpDetails != null) {
          stmt.bindLong(3, _tmpDetails.getId());
          final String _tmp;
          _tmp = __converters.listToJson(_tmpDetails.getType());
          if (_tmp == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmp);
          }
          final Sprites _tmpSprites = _tmpDetails.getSprites();
          if(_tmpSprites != null) {
            stmt.bindLong(5, _tmpSprites.getId());
            final Other _tmpOther = _tmpSprites.getOther();
            if(_tmpOther != null) {
              stmt.bindLong(6, _tmpOther.getId());
              final Artwork _tmpArtwork = _tmpOther.getArtwork();
              if(_tmpArtwork != null) {
                stmt.bindLong(7, _tmpArtwork.getId());
                if (_tmpArtwork.getImage() == null) {
                  stmt.bindNull(8);
                } else {
                  stmt.bindString(8, _tmpArtwork.getImage());
                }
              } else {
                stmt.bindNull(7);
                stmt.bindNull(8);
              }
            } else {
              stmt.bindNull(6);
              stmt.bindNull(7);
              stmt.bindNull(8);
            }
          } else {
            stmt.bindNull(5);
            stmt.bindNull(6);
            stmt.bindNull(7);
            stmt.bindNull(8);
          }
        } else {
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
        }
      }
    };
    this.__insertionAdapterOfTypes = new EntityInsertionAdapter<Types>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Types` (`types_pokemon_id`,`pokemonFk`,`slot`,`pokemon_type_name`,`typeName`,`pokemon_type_url`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Types value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getPokemonFk());
        if (value.getSlot() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSlot());
        }
        final PokemonType _tmpType = value.getType();
        if(_tmpType != null) {
          stmt.bindLong(4, _tmpType.getId());
          if (_tmpType.getTypeName() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpType.getTypeName());
          }
          if (_tmpType.getTypeUrl() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpType.getTypeUrl());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
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
  public void insertType(final List<Types> types) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTypes.insert(types);
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
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "details_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "sprites_id");
      final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "other_id");
      final int _cursorIndexOfId_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "artwork_id");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
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
        final PokemonDetails _tmpDetails;
        if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final List<Types> _tmpType;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfType);
          }
          _tmpType = __converters.jsonToList(_tmp);
          final Sprites _tmpSprites;
          if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
            final int _tmpId_1;
            _tmpId_1 = _cursor.getInt(_cursorIndexOfId_1);
            final Other _tmpOther;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
              final int _tmpId_2;
              _tmpId_2 = _cursor.getInt(_cursorIndexOfId_2);
              final Artwork _tmpArtwork;
              if (! (_cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
                final int _tmpId_3;
                _tmpId_3 = _cursor.getInt(_cursorIndexOfId_3);
                final String _tmpImage;
                if (_cursor.isNull(_cursorIndexOfImage)) {
                  _tmpImage = null;
                } else {
                  _tmpImage = _cursor.getString(_cursorIndexOfImage);
                }
                _tmpArtwork = new Artwork(_tmpId_3,_tmpImage);
              }  else  {
                _tmpArtwork = null;
              }
              _tmpOther = new Other(_tmpId_2,_tmpArtwork);
            }  else  {
              _tmpOther = null;
            }
            _tmpSprites = new Sprites(_tmpId_1,_tmpOther);
          }  else  {
            _tmpSprites = null;
          }
          _tmpDetails = new PokemonDetails(_tmpId,_tmpSprites,_tmpType);
        }  else  {
          _tmpDetails = null;
        }
        _item = new Pokemon(_tmpName,_tmpUrl,_tmpDetails);
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
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "details_id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfId_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "sprites_id");
      final int _cursorIndexOfId_2 = CursorUtil.getColumnIndexOrThrow(_cursor, "other_id");
      final int _cursorIndexOfId_3 = CursorUtil.getColumnIndexOrThrow(_cursor, "artwork_id");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
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
        final PokemonDetails _tmpDetails;
        if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
          final int _tmpId;
          _tmpId = _cursor.getInt(_cursorIndexOfId);
          final List<Types> _tmpType;
          final String _tmp;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getString(_cursorIndexOfType);
          }
          _tmpType = __converters.jsonToList(_tmp);
          final Sprites _tmpSprites;
          if (! (_cursor.isNull(_cursorIndexOfId_1) && _cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
            final int _tmpId_1;
            _tmpId_1 = _cursor.getInt(_cursorIndexOfId_1);
            final Other _tmpOther;
            if (! (_cursor.isNull(_cursorIndexOfId_2) && _cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
              final int _tmpId_2;
              _tmpId_2 = _cursor.getInt(_cursorIndexOfId_2);
              final Artwork _tmpArtwork;
              if (! (_cursor.isNull(_cursorIndexOfId_3) && _cursor.isNull(_cursorIndexOfImage))) {
                final int _tmpId_3;
                _tmpId_3 = _cursor.getInt(_cursorIndexOfId_3);
                final String _tmpImage;
                if (_cursor.isNull(_cursorIndexOfImage)) {
                  _tmpImage = null;
                } else {
                  _tmpImage = _cursor.getString(_cursorIndexOfImage);
                }
                _tmpArtwork = new Artwork(_tmpId_3,_tmpImage);
              }  else  {
                _tmpArtwork = null;
              }
              _tmpOther = new Other(_tmpId_2,_tmpArtwork);
            }  else  {
              _tmpOther = null;
            }
            _tmpSprites = new Sprites(_tmpId_1,_tmpOther);
          }  else  {
            _tmpSprites = null;
          }
          _tmpDetails = new PokemonDetails(_tmpId,_tmpSprites,_tmpType);
        }  else  {
          _tmpDetails = null;
        }
        _result = new Pokemon(_tmpName,_tmpUrl,_tmpDetails);
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

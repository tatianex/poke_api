package com.proway.pokemonapp.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.proway.pokemonapp.database.dao.PokemonDAO;
import com.proway.pokemonapp.database.dao.PokemonDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile PokemonDAO _pokemonDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `table_pokemon` (`poke_name` TEXT NOT NULL, `poke_url` TEXT NOT NULL, `details_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `sprites_id` INTEGER NOT NULL, `other_id` INTEGER NOT NULL, `artwork_id` INTEGER, `image` TEXT, PRIMARY KEY(`poke_name`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PokemonDetails` (`details_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type` TEXT NOT NULL, `sprites_id` INTEGER NOT NULL, `other_id` INTEGER NOT NULL, `artwork_id` INTEGER, `image` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Sprites` (`sprites_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `other_id` INTEGER NOT NULL, `artwork_id` INTEGER, `image` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Other` (`other_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `artwork_id` INTEGER, `image` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Artwork` (`artwork_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `image` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Types` (`types_pokemon_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `pokemonFk` INTEGER NOT NULL, `slot` TEXT NOT NULL, `pokemon_type_name` INTEGER NOT NULL, `typeName` TEXT NOT NULL, `pokemon_type_url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PokemonType` (`pokemon_type_name` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `typeName` TEXT NOT NULL, `pokemon_type_url` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd92c8a91c3a4a7d47c0eabea52a8f2e6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `table_pokemon`");
        _db.execSQL("DROP TABLE IF EXISTS `PokemonDetails`");
        _db.execSQL("DROP TABLE IF EXISTS `Sprites`");
        _db.execSQL("DROP TABLE IF EXISTS `Other`");
        _db.execSQL("DROP TABLE IF EXISTS `Artwork`");
        _db.execSQL("DROP TABLE IF EXISTS `Types`");
        _db.execSQL("DROP TABLE IF EXISTS `PokemonType`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTablePokemon = new HashMap<String, TableInfo.Column>(8);
        _columnsTablePokemon.put("poke_name", new TableInfo.Column("poke_name", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("poke_url", new TableInfo.Column("poke_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("details_id", new TableInfo.Column("details_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("sprites_id", new TableInfo.Column("sprites_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("other_id", new TableInfo.Column("other_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("artwork_id", new TableInfo.Column("artwork_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTablePokemon.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTablePokemon = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTablePokemon = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTablePokemon = new TableInfo("table_pokemon", _columnsTablePokemon, _foreignKeysTablePokemon, _indicesTablePokemon);
        final TableInfo _existingTablePokemon = TableInfo.read(_db, "table_pokemon");
        if (! _infoTablePokemon.equals(_existingTablePokemon)) {
          return new RoomOpenHelper.ValidationResult(false, "table_pokemon(com.proway.pokemonapp.model.Pokemon).\n"
                  + " Expected:\n" + _infoTablePokemon + "\n"
                  + " Found:\n" + _existingTablePokemon);
        }
        final HashMap<String, TableInfo.Column> _columnsPokemonDetails = new HashMap<String, TableInfo.Column>(6);
        _columnsPokemonDetails.put("details_id", new TableInfo.Column("details_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonDetails.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonDetails.put("sprites_id", new TableInfo.Column("sprites_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonDetails.put("other_id", new TableInfo.Column("other_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonDetails.put("artwork_id", new TableInfo.Column("artwork_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonDetails.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokemonDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokemonDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokemonDetails = new TableInfo("PokemonDetails", _columnsPokemonDetails, _foreignKeysPokemonDetails, _indicesPokemonDetails);
        final TableInfo _existingPokemonDetails = TableInfo.read(_db, "PokemonDetails");
        if (! _infoPokemonDetails.equals(_existingPokemonDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "PokemonDetails(com.proway.pokemonapp.model.PokemonDetails).\n"
                  + " Expected:\n" + _infoPokemonDetails + "\n"
                  + " Found:\n" + _existingPokemonDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsSprites = new HashMap<String, TableInfo.Column>(4);
        _columnsSprites.put("sprites_id", new TableInfo.Column("sprites_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSprites.put("other_id", new TableInfo.Column("other_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSprites.put("artwork_id", new TableInfo.Column("artwork_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSprites.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSprites = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSprites = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSprites = new TableInfo("Sprites", _columnsSprites, _foreignKeysSprites, _indicesSprites);
        final TableInfo _existingSprites = TableInfo.read(_db, "Sprites");
        if (! _infoSprites.equals(_existingSprites)) {
          return new RoomOpenHelper.ValidationResult(false, "Sprites(com.proway.pokemonapp.model.Sprites).\n"
                  + " Expected:\n" + _infoSprites + "\n"
                  + " Found:\n" + _existingSprites);
        }
        final HashMap<String, TableInfo.Column> _columnsOther = new HashMap<String, TableInfo.Column>(3);
        _columnsOther.put("other_id", new TableInfo.Column("other_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOther.put("artwork_id", new TableInfo.Column("artwork_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOther.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOther = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOther = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOther = new TableInfo("Other", _columnsOther, _foreignKeysOther, _indicesOther);
        final TableInfo _existingOther = TableInfo.read(_db, "Other");
        if (! _infoOther.equals(_existingOther)) {
          return new RoomOpenHelper.ValidationResult(false, "Other(com.proway.pokemonapp.model.Other).\n"
                  + " Expected:\n" + _infoOther + "\n"
                  + " Found:\n" + _existingOther);
        }
        final HashMap<String, TableInfo.Column> _columnsArtwork = new HashMap<String, TableInfo.Column>(2);
        _columnsArtwork.put("artwork_id", new TableInfo.Column("artwork_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArtwork.put("image", new TableInfo.Column("image", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArtwork = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArtwork = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArtwork = new TableInfo("Artwork", _columnsArtwork, _foreignKeysArtwork, _indicesArtwork);
        final TableInfo _existingArtwork = TableInfo.read(_db, "Artwork");
        if (! _infoArtwork.equals(_existingArtwork)) {
          return new RoomOpenHelper.ValidationResult(false, "Artwork(com.proway.pokemonapp.model.Artwork).\n"
                  + " Expected:\n" + _infoArtwork + "\n"
                  + " Found:\n" + _existingArtwork);
        }
        final HashMap<String, TableInfo.Column> _columnsTypes = new HashMap<String, TableInfo.Column>(6);
        _columnsTypes.put("types_pokemon_id", new TableInfo.Column("types_pokemon_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTypes.put("pokemonFk", new TableInfo.Column("pokemonFk", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTypes.put("slot", new TableInfo.Column("slot", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTypes.put("pokemon_type_name", new TableInfo.Column("pokemon_type_name", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTypes.put("typeName", new TableInfo.Column("typeName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTypes.put("pokemon_type_url", new TableInfo.Column("pokemon_type_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTypes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTypes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTypes = new TableInfo("Types", _columnsTypes, _foreignKeysTypes, _indicesTypes);
        final TableInfo _existingTypes = TableInfo.read(_db, "Types");
        if (! _infoTypes.equals(_existingTypes)) {
          return new RoomOpenHelper.ValidationResult(false, "Types(com.proway.pokemonapp.model.Types).\n"
                  + " Expected:\n" + _infoTypes + "\n"
                  + " Found:\n" + _existingTypes);
        }
        final HashMap<String, TableInfo.Column> _columnsPokemonType = new HashMap<String, TableInfo.Column>(3);
        _columnsPokemonType.put("pokemon_type_name", new TableInfo.Column("pokemon_type_name", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonType.put("typeName", new TableInfo.Column("typeName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokemonType.put("pokemon_type_url", new TableInfo.Column("pokemon_type_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokemonType = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokemonType = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokemonType = new TableInfo("PokemonType", _columnsPokemonType, _foreignKeysPokemonType, _indicesPokemonType);
        final TableInfo _existingPokemonType = TableInfo.read(_db, "PokemonType");
        if (! _infoPokemonType.equals(_existingPokemonType)) {
          return new RoomOpenHelper.ValidationResult(false, "PokemonType(com.proway.pokemonapp.model.PokemonType).\n"
                  + " Expected:\n" + _infoPokemonType + "\n"
                  + " Found:\n" + _existingPokemonType);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d92c8a91c3a4a7d47c0eabea52a8f2e6", "6f1ef57afa799473d7b485e90358d91b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "table_pokemon","PokemonDetails","Sprites","Other","Artwork","Types","PokemonType");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `table_pokemon`");
      _db.execSQL("DELETE FROM `PokemonDetails`");
      _db.execSQL("DELETE FROM `Sprites`");
      _db.execSQL("DELETE FROM `Other`");
      _db.execSQL("DELETE FROM `Artwork`");
      _db.execSQL("DELETE FROM `Types`");
      _db.execSQL("DELETE FROM `PokemonType`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(PokemonDAO.class, PokemonDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public PokemonDAO pokemonDAO() {
    if (_pokemonDAO != null) {
      return _pokemonDAO;
    } else {
      synchronized(this) {
        if(_pokemonDAO == null) {
          _pokemonDAO = new PokemonDAO_Impl(this);
        }
        return _pokemonDAO;
      }
    }
  }
}

package com.proway.pokemonapp.view_model

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.proway.pokemonapp.model.Pokemon
import com.proway.pokemonapp.repository.PokemonRepository

class MainViewModel : ViewModel() {

    private val _pokemons = MutableLiveData<List<Pokemon>>()
    val pokemons: LiveData<List<Pokemon>> = _pokemons

    val _error = MutableLiveData<String>()
    var error : LiveData<String> = _error

    fun fetchAllFromServer(context: Context) {

        val repository = PokemonRepository(context)

        repository.fetchAll { response, error ->
            response?.let {
                _pokemons.value = it.results
                loadPokeDetails(it.results, repository)
            }
            error?.let {
                _error.value = it
            }
        }
    }

    fun fetchAllFromDatabase(context: Context) {
        val listOf = PokemonRepository(context).fetchAllFromDatabase()
        if (listOf != null && listOf.isNotEmpty()) {
            _pokemons.value = listOf!!
        }
        else {
            fetchAllFromServer(context)
        }
    }

    fun fetchFileredFromDatabase(context: Context, query: String) {
        val repository = PokemonRepository(context)
        val filteredList = repository.fetchAllFromDatabaseWithFilter(query)
        filteredList?.let {
            _pokemons.value = it
        }
    }

    private fun loadPokeDetails(pokemons: List<Pokemon>, repository: PokemonRepository) {
        pokemons.forEach { poke ->
            repository.fetchPokemonDetails(pokeId = poke.extractIdFromUrl()) { details, _ ->
                details?.let {
                    poke.details = details
                    repository.insertIntoDatabase(poke)
                }
            }
        }
    }
}
package com.example.jetpokedexapp.data.viewmodel

import androidx.lifecycle.ViewModel
import com.example.jetpokedexapp.data.repository.PokemonRepository
import com.example.jetpokedexapp.data.response.PokemonResponse
import com.example.jetpokedexapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<PokemonResponse> {
        return repository.getPokemonInfo(pokemonName)
    }
}
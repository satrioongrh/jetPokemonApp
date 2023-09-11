package com.example.jetpokedexapp.data.repository

import com.example.jetpokedexapp.data.response.PokemonListResponse
import com.example.jetpokedexapp.data.response.PokemonResponse
import com.example.jetpokedexapp.data.retrofit.ApiService
import com.example.jetpokedexapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api : ApiService
) {

    suspend fun getPokemonList(offset: Int, limit: Int) : Resource<PokemonListResponse> {
        val response = try {
            api.getPokemonList(offset, limit)
        } catch (e: Exception) {
            return Resource.Error("an unknown error")
        }
        return Resource.Succes(response)
    }

    suspend fun getPokemonInfo(pokemonName: String) : Resource<PokemonResponse> {
        val response = try {
            api.getPokemon(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("an unknown error")
        }
        return Resource.Succes(response)
    }

}
package com.example.jetpokedexapp.data.retrofit

import com.example.jetpokedexapp.data.response.PokemonListResponse
import com.example.jetpokedexapp.data.response.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("offset") offset: Int,
        @Query("limit") limit: Int
    ) : PokemonListResponse

    @GET("pokemon/{name}")
    suspend fun getPokemon(
        @Path("name") name: String
    ) : PokemonResponse
}
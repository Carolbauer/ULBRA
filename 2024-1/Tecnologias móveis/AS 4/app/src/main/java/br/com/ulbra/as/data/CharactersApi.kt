package br.com.ulbra.`as`.data

import br.com.ulbra.`as`.data.network.responses.CharactersResponse
import retrofit2.http.GET

interface CharactersApi {
@GET("characters")
suspend fun fetchCharacters(): List<CharactersResponse>
}
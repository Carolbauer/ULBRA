package br.com.ulbra.`as`.data.dataSources

import br.com.ulbra.`as`.data.CharactersApi
import br.com.ulbra.`as`.data.network.responses.ResultsResponse
import javax.inject.Inject


class CharactersDataSource @Inject constructor(
    private val api: CharactersApi
){
    suspend fun fetchCharacters(): ResultsResponse{
    return api.fetchCharacters()
    }
}
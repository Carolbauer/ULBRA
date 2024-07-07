package br.com.ulbra.`as`.data.repositories


import br.com.ulbra.`as`.data.Character
import br.com.ulbra.`as`.data.dataSources.CharactersDataSource
import br.com.ulbra.`as`.data.network.responses.toModel
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val charactersDataSource: CharactersDataSource
) {
    suspend fun fetchCharacters(): List<Character> {
        return charactersDataSource
            .fetchCharacters().map { item -> item.toModel() }
    }
}

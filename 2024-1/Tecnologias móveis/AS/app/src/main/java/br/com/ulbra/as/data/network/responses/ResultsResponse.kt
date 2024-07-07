package br.com.ulbra.`as`.data.network.responses

import br.com.ulbra.`as`.data.network.responses.CharactersResponse
import com.google.gson.annotations.SerializedName

data class ResultsResponse(
    @SerializedName("name")
    val charactersResult: List<CharactersResponse>
)
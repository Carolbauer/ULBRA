package br.com.ulbra.`as`.presentation

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.ulbra.`as`.data.Character
import br.com.ulbra.`as`.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
): ViewModel() {
    fun fetchCharacters(): LiveData<List<Character>>{
        val liveData = MutableLiveData<List<Character>>()

        viewModelScope.launch(Dispatchers.IO){
            val result = characterRepository.fetchCharacters()
            liveData.postValue(result)
        }
        return liveData
    }
}
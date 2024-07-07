package br.com.ulbra.`as`

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import br.com.ulbra.`as`.data.repositories.CharacterRepository
import androidx.core.view.WindowInsetsCompat
import br.com.ulbra.`as`.databinding.ActivityMainBinding
import br.com.ulbra.`as`.presentation.CharactersViewModel
import br.com.ulbra.`as`.presentation.adapters.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CharacterAdapter
    private val charactersViewModel: CharactersViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureRecycler()
        observer()
        }

    private fun configureRecycler(){
        adapter = CharacterAdapter()
        binding.rcCharacters.adapter = adapter
    }

    private fun observer(){
        charactersViewModel.fetchCharacters().observe(this){

        }
    }

}
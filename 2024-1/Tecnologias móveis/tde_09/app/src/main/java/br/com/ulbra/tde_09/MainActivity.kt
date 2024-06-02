package br.com.ulbra.tde_09

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        val listOfProducts = mainViewModel.getProducts()
        val adapter = ProductAdapter(listOfProducts){
            goToDetail(it)
        }

        recycler.adapter = adapter

        recycler.layoutManager = GridLayoutManager(this, 2)

    }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailsActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }
}


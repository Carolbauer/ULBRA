package br.com.ulbra.tde_09

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import br.com.ulbra.tde_09.data.Product
import br.com.ulbra.tde_09.presentation.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val menuBottom = findViewById<BottomNavigationView>(R.id.menu_bottom)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        setSupportActionBar(toolbar)
        NavigationUI.setupWithNavController(menuBottom, navController)
        configureToolbar("Home",false)
    }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailsActivity::class.java).apply {
            putExtra("br/com/ulbra/tde_09/data", item)
            startActivity(this)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}


package br.com.ulbra.tde_09.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.ulbra.tde_09.presentation.viewmodels.MainViewModel
import br.com.ulbra.tde_09.presentation.adapters.ProductAdapter
import br.com.ulbra.tde_09.R
import br.com.ulbra.tde_09.configureToolbar

class HomeFragment : Fragment() {
    private lateinit var productAdapter: ProductAdapter
    private lateinit var mainViewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        //Recycler

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)

        val listOfProducts = mainViewModel.getProducts()
        productAdapter = ProductAdapter(listOfProducts){
            val bundle = bundleOf("br/com/ulbra/tde_09/data" to it)
            findNavController().navigate(R.id.action_homeFragment_to_productDetailsActivity, bundle)

        }

        recycler.adapter = productAdapter

        recycler.layoutManager = GridLayoutManager(requireContext(), 2)

        (requireActivity() as AppCompatActivity).configureToolbar("Home", false)


    }
}
package br.com.ulbra.tde_09

import java.io.Serializable

data class Product(
    val urlImage: String,
    val name: String,
    val price: String
):Serializable
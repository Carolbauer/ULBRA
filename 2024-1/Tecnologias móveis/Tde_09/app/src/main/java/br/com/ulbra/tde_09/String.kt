package br.com.ulbra.tde_09

fun String.convertToMoneyWithSymbol() = "R$".plus(this.replace(".", ","))
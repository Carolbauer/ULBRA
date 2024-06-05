package br.com.ulbra.tde_09.presentation.viewmodels

import androidx.lifecycle.ViewModel
import br.com.ulbra.tde_09.data.Product

class MainViewModel : ViewModel(){
    fun getProducts() = mutableListOf(
        Product(
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuf39JLpZfz124NexCfUNQNbFXEktnvB5z7A&s",
            name = "Camiseta Disney e o Mundo",
            price = "89.00"
        ),
        Product(
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZalm5NHsF8-8cjigSbLXLaohTr21Uwgv0Dw&s",
            name = "Disney Camisa feminina Lilo and Stitch",
            price = "129.00"
        ),
        Product(
            urlImage = "https://cdn.awsli.com.br/600x1000/0/622/produto/209219996/imgsite-cm-cute-party-drt-2023-m4-ptbmnj.jpg",
            name = "Camiseta Cute Party",
            price = "99,90"
        ),
        Product(
            urlImage = "https://images.tcdn.com.br/img/img_prod/460977/camiseta_feminina_unissex_castle_mickey_mouse_e_minnie_best_day_ever_disney_preta_ev_86941_1_37dfdc829252df52c99bf41ef0d76b2e.jpg",
            name = "Camiseta Best Day Ever",
            price = "129.00"
        ),
        Product(
            urlImage = "https://images2.marisa.com.br/medias/sys_master/images/images/hbe/hc4/12535900995614/TOP-MC-POOH-OFW-3-10045023125-C1.jpg",
            name = "Camiseta Pooh",
            price = "78,90"
        ),
        Product(
            urlImage = "https://images2.marisa.com.br/medias/sys_master/images/images/he4/h7d/13507600056350/Blusa-Infantil-Bebe-Marie-Disney-Tam-0-a-18-Meses-10051150396-C1.jpg",
            name = "Camiseta Marie",
            price = "78,90"
        )

    )
}
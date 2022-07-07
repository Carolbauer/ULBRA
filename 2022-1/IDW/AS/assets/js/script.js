$(document).ready(()=>{
    $('section').load('pages/home.html')
    $('#menuHome').addClass('active')

    function removeClassMenu(){
        $('#menuHome').removeClass('active')
        $('#menuSobre').removeClass('active')
        $('#menuProdutos').removeClass('active')
        $('#menuContato').removeClass('active')
    }

    $ ('#menuHome').click(()=>{
        removeClassMenu()
        $('section').load('pages/home.html')
    $('#menuHome').addClass('active')
    })

    $ ('#menuSobre').click(()=>{
        removeClassMenu()
        $('section').load('pages/sobre.html')
    $('#menuSobre').addClass('active')
    })

    $ ('#menuProdutos').click(()=>{
        removeClassMenu()
        $('section').load('pages/produtos.html')
    $('#menuProdutos').addClass('active')
    })

    $ ('#menuContato').click(()=>{
        removeClassMenu()
        $('section').load('pages/contato.html')
    $('#menuContato').addClass('active')
    })

    
    


})
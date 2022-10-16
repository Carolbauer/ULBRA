<h1>Alterando Cliente</h1>
<form class="form" action="?controller=client&action=updateClientAction&id=<?=$arrayClients['idClient']?>" method="post" enctype='multipart/form-data'>>
    <div class="mb-3 mt-3">
        <label class="form-label">Nome</label>
        <input name="name" class="form-control" type="text" value="<?=$arrayClients['name']?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Email</label>
        <input name="email" class="form-control" type="email" value="<?=$arrayClients['email']?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Telefone</label>
        <input name="phone" class="form-control" type="text" value="<?=$arrayClients['phone']?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">Endereço</label>
        <input name="address" class="form-control" type="text" value="<?=$arrayClients['address']?>">
    </div>
    <div class="mb-3 mt-3">
        <label class="form-label">FOTO</label>
        <input name="photo" class="form-control" type="file">
    </div>
    <div class="mb-3 mt-3">
    <td>
                <?php
                if (is_file("assets/img/client/{$arrayClients['idClient']}.jpg")){
                    echo "<img class='img-fluid' src='assets/img/client/{$arrayClients['idClient']}.jpg'";
                }else{
                    echo'sem imagem';
                }
                ?>
            </td>
    </div>

    <input class="btn btn-primary" type="submit" value="Enviar">
</form>
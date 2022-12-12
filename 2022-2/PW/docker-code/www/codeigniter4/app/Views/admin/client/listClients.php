<h1>Lista de Clientes</h1>

<form method="GET" action="<?=base_url('admin/client/procuraClientAction')?>">
    <div class="form-group">
      <input type="text" class="form-control" name="input" placeholder="Digite o dado de pesquisa" aria-describedby="basic-addon2">
      <div class="input-group-append">
        <button class="btn btn-dark" type="submit">Pesquisar</button>
      </div>
    </div>
  </form>
  <div class="table-responsive">
  <table class="table table-striped table-bordered">
    

    <tr>
        <th>ID Cliente</th>
        <th>Nome</th>
        <th>Email</th>
        <th>Telefone</th>
        <th>Endereço</th>
        <th colspan = "2">Açōes</th>
    </tr>   

    <?php
        foreach($arrayClients as $client){
    ?>
        <tr>
            <td>
                <?=$client['idClient']?>
            </td>
            <td>
                <?=$client['name']?>
            </td>
            <td>
                <?=$client['email']?>
            </td>
            <td>
                <?=$client['phone']?>
            </td>
            <td>
                <?=$client['address']?>
            </td>
            <td>
                <a href="<?=base_url('admin/updateClient/'.$client['idClient'])?>"class="btn btn-warning">Alterar</a>

            </td>
            <td>
                <a href="<?=base_url('admin/deleteClient/'.$client['idClient'])?>" class="btn btn-danger">Deletar</a>
            </td>

        </tr>
        
    <?php
    }
    ?>
   
</table>
  </div>

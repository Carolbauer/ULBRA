package br.com.ulbra.ap2.repositories;


import br.com.ulbra.ap2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

    List<Client> findByAge(Integer age);
}

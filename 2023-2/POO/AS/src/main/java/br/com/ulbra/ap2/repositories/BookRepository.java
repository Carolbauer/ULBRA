package br.com.ulbra.ap2.repositories;

import br.com.ulbra.ap2.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,Long> {

}

package br.com.ulbra.ap2.services;

import br.com.ulbra.ap2.entities.Book;
import br.com.ulbra.ap2.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;
    @Autowired
    public BookService(BookRepository repository){
        this.repository = repository;
    }

    public List<Book>getAllBooks(){
        return repository.findAll();

    }

}

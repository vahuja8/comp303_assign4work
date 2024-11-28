package com.va.week12.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.va.week12.model.Book;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
@AllArgsConstructor
public class BookService {
	
@Autowired	
	private BookRepo bookRepo;

// writing methods as per business logic to
// call with using repo interface... methods. to be called


public Flux<Book> getAll() {
	
	return bookRepo.findAll().switchIfEmpty(Flux.empty()); 
}


public Mono<Book> getById(final String id) {

    return bookRepo.findById(id);

}

public Mono update(final String id, final Book book) {

    return bookRepo.save(book);

}

public Mono save(final Book book) {

    return bookRepo.save(book);

}
   
    public Mono delete(final String id) {

        final Mono<Book> dbBook = getById(id);

        if (Objects.isNull(dbBook)) {

              return Mono.empty();

        }
    
  
return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(bookToBeDeleted -> bookRepo.delete(bookToBeDeleted).then(Mono.just(bookToBeDeleted)));    
 

}
}

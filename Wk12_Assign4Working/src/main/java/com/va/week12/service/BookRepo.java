package com.va.week12.service;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.va.week12.model.Book;

@Repository
public interface BookRepo extends  ReactiveMongoRepository<Book, String>
{

}

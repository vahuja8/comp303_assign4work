package com.va.week12.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.va.week12.model.Book;
import com.va.week12.service.BookService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("book")

@AllArgsConstructor
@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping
	public Flux<Book> getAll() {

		System.out.println("All the book information");

		return bookService.getAll();

	}

	@GetMapping("{id}")

	public Mono<Book> getById(@PathVariable("id") final String id) {

		System.out.println("One Book information based for the given ID");

		return bookService.getById(id);

	}

	@PutMapping("{id}")

	public Mono updateById(@PathVariable("id") final String id, @RequestBody final Book Book) {

		System.out.println("Updating an Book Info");

		return bookService.update(id, Book);

	}

	@PostMapping

	public Mono save(@RequestBody final Book Book) {

		// System.out.println("Added Book Info "+ Book.getEmpId() + " - " +
		// Book.getEmpName()

//          + " - " + Book.getJobTitle() + " - " + Book.getSalary());

		return bookService.save(Book);

	}

	@DeleteMapping("{id}")

	public Mono delete(@PathVariable final String id) {

		System.out.println("An Book Info deleted");

		return bookService.delete(id);

	}

}

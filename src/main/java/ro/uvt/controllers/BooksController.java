
package ro.uvt.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import ro.uvt.models.Book;
import ro.uvt.persistence.BooksRepository;
import ro.uvt.observer.AllBooksSubject;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksRepository booksRepository;
    private final AllBooksSubject allBooksSubject;

    public BooksController(
            BooksRepository booksRepository,
            AllBooksSubject allBooksSubject) {

        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @PostMapping
    public String newBook(
            @RequestBody NewBookRequest newBookRequest) {

        // Create a new book
        Book book = new Book(newBookRequest.getTitle());

        // Save the book in the database
        book = booksRepository.save(book);

        // Notify all observers
        allBooksSubject.add(book);

        return "Book saved [" + book.getId() + "] "
                + book.getTitle();
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(
            @PathVariable Integer id) {

        return booksRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

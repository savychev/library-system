package be.intec.library.service;

import be.intec.library.domain.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    Book add(Book book);                                  // создать книгу
    Optional<Book> edit(String isbn, Book updated);       // обновить по ISBN
    boolean delete(String isbn);                          // удалить по ISBN
    Optional<Book> findByIsbn(String isbn);               // найти по ISBN
    List<Book> search(String query);                      // поиск по части названия/автора
}

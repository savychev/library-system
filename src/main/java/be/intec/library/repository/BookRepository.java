package be.intec.library.repository;

import be.intec.library.domain.Book;
import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, String> {
    Optional<Book> findByIsbn(String isbn);
    List<Book> findByTitleContaining(String titlePart);
    List<Book> findByAuthorContaining(String authorPart);
}

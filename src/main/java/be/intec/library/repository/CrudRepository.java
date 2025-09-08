package be.intec.library.repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T, ID> {
    T save(T entity);                    // create or update
    Optional<T> findById(ID id);         // read one
    List<T> findAll();                   // read all
    boolean deleteById(ID id);           // delete
    boolean existsById(ID id);           // helper
}

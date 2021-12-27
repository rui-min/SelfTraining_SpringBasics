package ray.springfirst.repositories;

import org.springframework.data.repository.CrudRepository;
import ray.springfirst.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

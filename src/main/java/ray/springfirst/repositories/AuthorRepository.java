package ray.springfirst.repositories;


import org.springframework.data.repository.CrudRepository;
import ray.springfirst.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}

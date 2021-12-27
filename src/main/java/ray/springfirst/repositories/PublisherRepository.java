package ray.springfirst.repositories;

import org.springframework.data.repository.CrudRepository;
import ray.springfirst.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

package test.test_spring.repository;

import test.test_spring.models.Marque;
import org.springframework.data.repository.CrudRepository;

public interface MarqueRepository extends CrudRepository<Marque, Integer>
{
    Marque findById(int id_marque);
}

package guru.springframework.repositories;

import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 1:14 PM on Sep 20, 2021
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}

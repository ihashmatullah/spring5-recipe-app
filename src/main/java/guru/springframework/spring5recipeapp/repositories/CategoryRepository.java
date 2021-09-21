package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by HashmatN at 1:12 PM on Sep 20, 2021
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
  Optional<Category> findByDescription(String description);
}

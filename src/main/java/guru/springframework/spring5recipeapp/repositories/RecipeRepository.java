package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 1:10 PM on Sep 20, 2021
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

package guru.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by HashmatN at 11:52 AM on Sep 20, 2021
 */
@Data
@Entity
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;

  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipe;

}

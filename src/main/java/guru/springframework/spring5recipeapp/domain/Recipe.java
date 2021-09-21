package guru.springframework.spring5recipeapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by HashmatN at 10:03 AM on Sep 20, 2021
 */
@Data
@Entity
public class Recipe {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private Integer prepTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  private String directions;
  //todo add
  //private Difficulty difficulty

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredients;

  @Lob
  private Byte[] image;

  @Enumerated(value = EnumType.STRING)
  private Difficulty difficulty;

  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;

  @ManyToMany
  @JoinTable(name = "recipte_category", joinColumns = @JoinColumn(name = "recipe_id"),
      inverseJoinColumns = @JoinColumn(name = "category_id"))
  private Set<Category> categories = new HashSet<>();

  public void setNotes(Notes notes) {
    this.notes = notes;
  }

  public Recipe addIngredient(Ingredient ingredient) {
    ingredient.setRecipe(this);
    this.ingredients.add(ingredient);
    return this;
  }
}

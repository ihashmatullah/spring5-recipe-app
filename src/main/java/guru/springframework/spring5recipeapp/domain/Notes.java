package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

/**
 * Created by HashmatN at 10:03 AM on Sep 20, 2021
 */
@Entity
public class Notes {
  @Id
  @GeneratedValue
  private Long id;

  @OneToOne
  private Recipe recipe;

  @Lob
  private String recipeNotes;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }

  public String getRecipeNotes() {
    return recipeNotes;
  }

  public void setRecipeNotes(String recipeNotes) {
    this.recipeNotes = recipeNotes;
  }
}

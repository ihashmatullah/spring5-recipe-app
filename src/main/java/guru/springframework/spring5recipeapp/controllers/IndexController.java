package guru.springframework.spring5recipeapp.controllers;

import guru.springframework.spring5recipeapp.domain.Category;
import guru.springframework.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframework.spring5recipeapp.repositories.CategoryRepository;
import guru.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by HashmatN at 9:39 AM on Sep 16, 2021
 */
@Controller
public class IndexController {
  private final CategoryRepository categoryRepository;
  private final UnitOfMeasureRepository unitOfMeasureRepository;

  public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
    this.categoryRepository = categoryRepository;
    this.unitOfMeasureRepository = unitOfMeasureRepository;
  }

  @RequestMapping({"", "/", "/index"})
  public String getIndexPage() {
    Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
    Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

    System.out.println("Category Id is: " + categoryOptional.get().getId());
    System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());
    return "index";
  }
}

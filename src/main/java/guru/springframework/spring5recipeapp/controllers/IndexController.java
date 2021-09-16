package guru.springframework.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HashmatN at 9:39 AM on Sep 16, 2021
 */
@Controller
public class IndexController {
  @RequestMapping({"", "/", "/index"})
  public String getIndexPage() {
    return "index";
  }
}

package com.catalogue.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogue.recipe.document.Recipe;
import com.catalogue.recipe.services.RecipeService;

@RestController
@RequestMapping("rest/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping("/recipies")
	@CrossOrigin(origins = "*")
	public List<Recipe> getRecipies() {
		return recipeService.getRecipies();
	}

	@PostMapping("/recipe")
	@CrossOrigin(origins = "*")
	public String add(@RequestBody Recipe recipe) {
		return recipeService.add(recipe);
	}
	
	@PostMapping("/recipe/{id}")
	public String remove(@PathVariable int id) {
		return recipeService.remove(id);
	}
	
	@PatchMapping("/recipe")
	public String update(Recipe recipe) {
		return recipeService.update(recipe);
	}
}

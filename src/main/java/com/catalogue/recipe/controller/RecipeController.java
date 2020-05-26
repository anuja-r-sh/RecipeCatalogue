package com.catalogue.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogue.recipe.document.Recipe;
import com.catalogue.recipe.services.RecipeService;

@RestController
@RequestMapping("rest")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping("/recipes")
	@CrossOrigin(origins = "*")
	public List<Recipe> getRecipes() {
		return recipeService.getRecipes();
	}

	@PostMapping("/recipe")
	@CrossOrigin(origins = "*")
	public ResponseEntity<String> add(@RequestBody Recipe recipe) {
		recipeService.add(recipe);
		return ResponseEntity.ok("successfully added");
	}

	@DeleteMapping("/recipe/{id}")
	public ResponseEntity<String> remove(@PathVariable int id) {
		recipeService.remove(id);
		return ResponseEntity.ok("successfully removed");
	}

	@PutMapping("/recipe/{id}")
	public ResponseEntity<String> update(@PathVariable int id, @RequestBody Recipe recipe) {
		if (recipe.getCreated() != null)
			return ResponseEntity.badRequest().build();
		if (recipeService.update(id, recipe))
			return ResponseEntity.ok("successfully updated");
		else
			return ResponseEntity.notFound().build();
	}

}

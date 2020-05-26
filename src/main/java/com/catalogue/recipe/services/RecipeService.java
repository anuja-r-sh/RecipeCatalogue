package com.catalogue.recipe.services;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogue.recipe.document.Recipe;
import com.catalogue.recipe.repository.RecipeRepo;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepo recipeRepo;

	public List<Recipe> getRecipes() {
		return recipeRepo.findAll();
	}

	public boolean add(Recipe recipe) {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		System.out.println(recipe.getCreated());
		recipe.setCreated(format.format(recipe.getCreated()));
		recipeRepo.save(recipe);
		return true;
	}

	public boolean remove(int id) {
		System.out.println(recipeRepo.findById(id));
		recipeRepo.deleteById(id);
		return true;
	}

	public boolean update(int id, Recipe recipe) {
		if (!recipeRepo.existsById(id))
			return false;
		recipeRepo.save(recipe);
		return true;
	}

}

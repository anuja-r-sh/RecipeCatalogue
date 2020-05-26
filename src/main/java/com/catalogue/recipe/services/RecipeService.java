package com.catalogue.recipe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogue.recipe.document.Recipe;
import com.catalogue.recipe.repository.RecipeRepo;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepo recipeRepo;

	public List<Recipe> getRecipies() {
		return recipeRepo.findAll();
	}
	
	public String add(Recipe recipe){
		recipeRepo.save(recipe);
		return "success";
	}
	
	public String remove(int id){
		recipeRepo.deleteById(id);
		return "success";
	}

	public String update(Recipe recipe) {
		recipeRepo.save(recipe);
		return null;
	}
	
	

}

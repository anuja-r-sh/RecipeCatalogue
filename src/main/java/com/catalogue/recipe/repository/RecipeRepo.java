package com.catalogue.recipe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.catalogue.recipe.document.Recipe;

@Repository
	public interface RecipeRepo extends MongoRepository<Recipe, Integer> {
}

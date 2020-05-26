package com.catalogue.recipe.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document
public class Recipe {
	
	@Id
	int _id;
	String name;
	String created;
	
	@JsonProperty
	boolean isVeg;
	
	int serveCount;
	List<String> ingredients;
	String description;
	
	String instructions;
	
	public Recipe(){
		
	}
	
	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public int getServeCount() {
		return serveCount;
	}
	public void setServeCount(int serveCount) {
		this.serveCount = serveCount;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + _id + ", created=" + created + ", isVeg=" + isVeg + ", serveCount=" + serveCount
				+ ", ingredients=" + ingredients + "]";
	}
	
	
}

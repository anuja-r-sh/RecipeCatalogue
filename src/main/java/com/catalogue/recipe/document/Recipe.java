package com.catalogue.recipe.document;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Recipe {
	
	@Id
	int id;
	Date created;
	boolean isVeg;
	int serveCount;
	List<String> ingredients;
	
	public Recipe(){
		
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
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
	
	@Override
	public String toString() {
		return super.toString();
	}
}

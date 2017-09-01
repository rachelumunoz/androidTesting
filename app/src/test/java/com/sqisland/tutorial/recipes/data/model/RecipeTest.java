package com.sqisland.tutorial.recipes.data.model;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by rachelmunoz on 8/31/17.
 */
public class RecipeTest {
	@Test
	public void water(){
		InputStream stream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");
		Recipe recipe = Recipe.readFromStream(stream);

		assertNotNull(recipe);
		assertEquals("water", recipe.mId);
		assertEquals("Water", recipe.mTitle);
		assertEquals(
						"Put glass under tap. Open tap. Close tap. Drink.",
						recipe.mDescription
					);
	}
}

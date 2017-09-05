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

	@Test
	public void mixed(){
		InputStream stream = RecipeTest.class.getResourceAsStream("/recipes/mixed.txt");
		Recipe recipe = Recipe.readFromStream(stream);

		assertNotNull(recipe);
		assertEquals("punch", recipe.mId);
		assertEquals("Punch", recipe.mTitle);
		assertEquals(
					"Juice of 3 lemons\n" +
					"1 orange\n" +
					"1 pint grape juice\n" +
					"1 cup sugar\n" +
					"1 cup water\n" +
					"1 pine apple juice\n" +
					"Mix all together and strain. Add large piece of ice.",
				recipe.mDescription
		);
	}
}

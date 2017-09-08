package com.sqisland.tutorial.recipes.data.local;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.sqisland.tutorial.recipes.data.model.Recipe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rachelmunoz on 9/5/17.
 */
public class RecipeStoreTest {
	@Test
	public void nullDirectory()  {
		Context context = InstrumentationRegistry.getTargetContext();
		RecipeStore store = new RecipeStore(context, null);

		assertNotNull(store);
		assertNotNull(store.mRecipes);
		assertEquals(0, store.mRecipes.size());
	}


	@Test
	public void count()  {
		Context context = InstrumentationRegistry.getTargetContext();
		RecipeStore store = new RecipeStore(context, "recipes");

		assertNotNull(store);
		assertNotNull(store.mRecipes);
		assertEquals(4, store.mRecipes.size());

	}

	@Test
	public void getChocolatePudding()  {
		Context context = InstrumentationRegistry.getTargetContext();
		RecipeStore store = new RecipeStore(context, "recipes");

		Recipe recipe = store.getRecipe("chocolate_pudding");

		assertNotNull(recipe);
		assertEquals("chocolate_pudding", recipe.getId());
		assertEquals("Chocolate Pudding", recipe.mTitle);
	}
}
package com.sqisland.tutorial.recipes.data.local;

import android.content.Context;
import android.content.res.AssetManager;

import com.sqisland.tutorial.recipes.data.model.Recipe;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rachelmunoz on 9/5/17.
 */

public class RecipeStore {
	public final List<Recipe> mRecipes = new ArrayList<>();

	public RecipeStore(Context context, String directory){
		List<InputStream> streams = getAssetStreams(context.getAssets(), directory);

		for (InputStream stream : streams){
			Recipe recipe = Recipe.readFromStream(stream);

			if (recipe != null){
				mRecipes.add(recipe);
			}
		}
	}

	private static List<InputStream> getAssetStreams(AssetManager manager, String directory){
		String[] fileNames = getFileNames(manager, directory);
		List<InputStream> streams = new ArrayList<>();

		for (String fileName : fileNames){
			File file = new File(directory, fileName);
			try {
				InputStream stream = manager.open(file.getPath());
				if (stream != null){
					streams.add(stream);
				}
			} catch (IOException e) {
			}
		}
		return streams;
	}

	private static String[] getFileNames(AssetManager manager, String directory){
		if (directory == null) return new String[0];

		try {
			return manager.list(directory);
		} catch (IOException e) {
			return new String[0];
		}
	}
}


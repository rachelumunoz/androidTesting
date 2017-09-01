package com.sqisland.tutorial.recipes.data.model;

import java.io.InputStream;

/**
 * Created by rachelmunoz on 8/31/17.
 */

public class Recipe {
	public final String mId;
	public final String mTitle;
	public final String mDescription;


	private Recipe(String id, String title, String description) {
		mId = id;
		mTitle = title;
		mDescription = description;
	}

	public Recipe readFromStream(InputStream inputStream){
		return null;
	}
}


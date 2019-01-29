package com.upgrade;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.upgrade.screens.MenuScreen;

public class GDXGame extends Game {

	public final static int WIDTH = 1280;
	public final static int HEIGHT = 720;

	@Override
	public void create () {
		this.setScreen(new MenuScreen(this));
	}

	
	@Override
	public void dispose () {
	}
}

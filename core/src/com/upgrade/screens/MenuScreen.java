package com.upgrade.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.upgrade.GDXGame;

public class MenuScreen extends AbstractScreen {

    private Texture logo;

    public MenuScreen(GDXGame game) {
        super(game);
        initScreen();
    }

    private void initScreen() {
        logo = new Texture(Gdx.files.internal("badlogic.jpg"));
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        spriteBatch.begin();
        spriteBatch.draw(logo, 0, 0);
        spriteBatch.end();
    }
}

package com.mygdx.tilemapgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class MainGame extends Game {
    private Music music;

	@Override
	public void create () {
        setScreen(new Play());
        music = Gdx.audio.newMusic(Gdx.files.internal("gamemusic.wav"));
        music.setLooping(true);
        music.setVolume(0.2f);
        music.play();
	}

	@Override
	public void render () {
	    super.render();

	}
	
	@Override
	public void dispose () {
	    super.dispose();
	    music.dispose();

	}

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }
}

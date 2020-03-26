package com.mygdx.tilemapgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.tilemapgame.MainGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Wanderer Microcosm";
		config.width = 800;
		config.height = 625;
        new LwjglApplication(new MainGame(), config);
	}
}

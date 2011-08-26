package com.gemserk.tests.libgdx.openal;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopApplication {

	public static void main(String[] argv) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "LibGDX - Test";
		config.width = 320;
		config.height = 240;
		config.fullscreen = false;
		config.useGL20 = false;
		config.useCPUSynch = true;
		config.forceExit = true;
		config.vSyncEnabled = true;

		new LwjglApplication(new Game() {

			@Override
			public void create() {
				
			}
			
			@Override
			public void render() {
				
			}
			
		}, config);
	}

}

package com.gemserk.tests.libgdx.openal;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Sound;

final class BugLoadingOggGame extends Game {
	private Sound sound;

	@Override
	public void create() {
		sound = Gdx.audio.newSound(Gdx.files.internal("test.ogg"));
	}

	@Override
	public void render() {
		if (Gdx.input.isKeyPressed(Keys.ENTER))
			sound.play(1f);
	}
}
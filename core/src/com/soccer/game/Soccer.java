package com.soccer.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.soccer.game.entities.SoccerBall;
import com.soccer.game.input.UserInput;
import com.soccer.game.screens.GameScreen;

public class Soccer extends Game {
	private OrthographicCamera camera;
	private SoccerBall ball;
	private SpriteBatch batch;
	private Texture img;
	private ShapeRenderer shapeRenderer;
	private InputProcessor inputProcessor;
	
	@Override
	public void create () {
		camera = new OrthographicCamera();
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		ball = new SoccerBall();
		inputProcessor = new UserInput(ball);
		//img = new Texture("badlogic.jpg");

		this.setScreen(new GameScreen(this));
		Gdx.input.setInputProcessor(inputProcessor);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//update
		ball.update();

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		ball.render(shapeRenderer);
		shapeRenderer.end();
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}

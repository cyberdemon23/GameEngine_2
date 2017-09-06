package com.soccer.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Jordan on 8/28/2017.
 */
public class SoccerBall extends Movable implements IEntity {
    public int radius = 30;

    @Override
    public void update(){
//        x += x_speed * Gdx.graphics.getDeltaTime();
//        y += y_speed * Gdx.graphics.getDeltaTime();
        if(moving) {
            x += x_speed;
            y += y_speed;
        }
    }

    @Override
    public void render(ShapeRenderer renderer){
        renderer.setColor(1, 1, 1, 1);
        renderer.circle(x, y, radius);
    }
}

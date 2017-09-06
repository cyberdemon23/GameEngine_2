package com.soccer.game.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Jordan on 8/28/2017.
 */
public interface IEntity {

    void update();
    void render(ShapeRenderer renderer);
}

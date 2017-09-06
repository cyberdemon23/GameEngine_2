package com.soccer.game.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.soccer.game.entities.SoccerBall;

/**
 * Created by Jordan on 9/5/2017.
 */
public class UserInput extends InputAdapter {
    private SoccerBall _ball;

    public UserInput(SoccerBall ball){
        _ball = ball;
    }

    @Override
    public boolean keyDown(int keycode){
        switch(keycode){
            case Input.Keys.A:
                _ball.x_speed = -1;
                _ball.moving = true;
                break;
            case Input.Keys.D:
                _ball.x_speed = 1;
                _ball.moving = true;
                break;
            case Input.Keys.W:
                _ball.y_speed = 1;
                _ball.moving = true;
                break;
            case Input.Keys.S:
                _ball.y_speed = -1;
                _ball.moving = true;
                break;
        }

        return true;
    }

    @Override
    public boolean keyUp(int keycode){
        switch(keycode){
            case Input.Keys.A:
                _ball.x_speed = 0;
                _ball.moving = false;
                break;
            case Input.Keys.D:
                _ball.x_speed = 0;
                _ball.moving = false;
                break;
            case Input.Keys.W:
                _ball.y_speed = 0;
                _ball.moving = false;
                break;
            case Input.Keys.S:
                _ball.y_speed = 0;
                _ball.moving = false;
                break;
        }

        return true;
    }

}

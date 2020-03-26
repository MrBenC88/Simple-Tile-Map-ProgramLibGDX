package com.mygdx.tilemapgame;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Player extends Sprite {

    //movement velocity
    private Vector2 velocity = new Vector2();
    private float speed = 60 * 2;

    public Player (Sprite sprite) {
        super(sprite);
    }
}

package com.company.game;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public abstract class AbstractGameState implements Serializable {
    private Game game;

    public AbstractGameState(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    abstract void nextTextLine();
    abstract void prevTextLine();
    abstract void chooseStateOne();
    abstract void chooseStateTwo();
    abstract String getText(int n);
    abstract String getScene();

}

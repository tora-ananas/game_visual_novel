package com.company.game;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Beginning extends AbstractGameState {
    private List<String> strings = new ArrayList<>();
    private String scene;
    private int curTextId = 0;

    public Beginning(Game game){
        super(game);
    }

    @Override
    void nextTextLine() {
        getText(curTextId);
        if(curTextId != strings.size()-1){
            curTextId++;
        }
    }

    @Override
    void prevTextLine() {
        if(curTextId != 0){
            curTextId--;
            getText(curTextId);
        }
    }

    @Override
    void chooseStateOne() {
        if(curTextId == strings.size()-1){
            Game game = getGame();
            game.setState(new PayAttentionToCat(game));
        }
    }

    @Override
    void chooseStateTwo() {
        if(curTextId == strings.size()-1){
            Game game = getGame();
            game.setState(new NotPayAttentionToCat(game));
        }
    }

    @Override
    String getText(int n) {
        return strings.get(n);
    }

    @Override
    String getScene() {
        return scene;
    }

}

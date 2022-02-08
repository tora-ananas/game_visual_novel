package com.company.game;

import java.util.ArrayList;
import java.util.List;

public class PayAttentionToCat extends AbstractGameState {

    private List<String> strings = new ArrayList<>();
    private String scene;
    private int curTextId = 0;

    public PayAttentionToCat(Game game){
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

    }

    @Override
    String getText(int n) {
        return null;
    }

    @Override
    String getScene() {
        return null;
    }

}

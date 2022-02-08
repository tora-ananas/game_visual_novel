package com.company.game;

import java.util.ArrayList;
import java.util.List;

public class NotPayAttentionToCat extends AbstractGameState {

    private List<String> strings = new ArrayList<>();
    private String scene;
    private int curTextId = 0;

    public NotPayAttentionToCat(Game game){
        super(game);
    }

    @Override
    void nextTextLine() {

    }

    @Override
    void prevTextLine() {

    }

    @Override
    void chooseStateOne() {

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

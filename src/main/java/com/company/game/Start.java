package com.company.game;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Start extends AbstractGameState {
    private List<String> strings = new ArrayList<>();
    private String scene;
    private int curTextId = 0;

    Start(Game game){
        super(game);
    }

    @Override
    public void nextTextLine() {
        //TODO проверка на границы
        getText(curTextId);
        if(curTextId != strings.size()-1){
            curTextId++;
        }
    }

    @Override
    public void prevTextLine() {
        //TODO проверка границ
        if(curTextId != 0){
            curTextId--;
            getText(curTextId);
        }
    }

    @Override
    public void chooseStateOne() {
        if(curTextId == strings.size()-1){
            Game game = getGame();
            game.setState(new Beginning(game));
        }
    }

    @Override
    public void chooseStateTwo(){
        if(curTextId == strings.size()-1){
            Game game = getGame();
            try {
                game.setState(game.loadGameState());
            } catch (IOException ex){
                ex.getMessage();
            }
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


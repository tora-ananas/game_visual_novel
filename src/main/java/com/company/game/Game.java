package com.company.game;

import java.io.IOException;
import java.io.Serializable;

public class Game implements Serializable {

    private AbstractGameState currState;
    private ISavedLoadedGame savedLoadedGame;

    public Game(){
        this.currState = new Start(this);
    }

    void setState(AbstractGameState state){
        this.currState = state;
    }

    public AbstractGameState getCurrState() {
        return currState;
    }

    public void nextTextLine(){
        currState.nextTextLine();
    }

    public void prevTextLine(){
        currState.prevTextLine();
    }

    public void chooseStateOne(){
        currState.chooseStateOne();
    }

    public void chooseStateTwo(){
        currState.chooseStateTwo();
    }

    public void saveGameState() throws IOException {
        savedLoadedGame.saveGameState(currState);
    }
    public AbstractGameState loadGameState() throws IOException {
        return savedLoadedGame.loadGameState();
    }

    public void getText(int n){
        currState.getText(n);
    }

    public void getScene(){
        currState.getScene();
    }



}

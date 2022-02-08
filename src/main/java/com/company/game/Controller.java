package com.company.game;

public class Controller {
    private boolean isLeft = false;
    private boolean isRight = false;
    private boolean isButton1 = false;
    private boolean isButton2 = false;
    private Game game;

    public Controller(Game game) {
        this.game = game;
    }

    public void update(){
        if(isLeft){
            game.prevTextLine();
        }
        if (isRight){
            game.nextTextLine();
        }
        if (isButton1){
            game.chooseStateOne();
        }
        if (isButton2){
            game.chooseStateTwo();
        }
    }

}

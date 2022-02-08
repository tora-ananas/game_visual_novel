package com.company.game;

import java.io.IOException;

public interface ISavedLoadedGame {
    void saveGameState(AbstractGameState game) throws IOException;
    AbstractGameState loadGameState() throws IOException;
}

package com.company.game;

import com.google.gson.Gson;

import java.io.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SaveGame implements ISavedLoadedGame, Serializable{

    String filePath;

    @Override
    public void saveGameState(AbstractGameState game) throws IOException{
        Gson gson = new Gson();
        try (FileWriter fw = new FileWriter(filePath, UTF_8)){
            gson.toJson(game, fw);
        }
    }

    @Override
    public AbstractGameState loadGameState() throws IOException{
        Gson gson = new Gson();
        try (FileReader fr = new FileReader(filePath, UTF_8)){
            return gson.fromJson(fr, AbstractGameState.class);
        }
    }
}

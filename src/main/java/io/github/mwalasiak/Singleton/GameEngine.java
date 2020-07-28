package io.github.mwalasiak.Singleton;

public class GameEngine {

    private int healthPoints = 100;
    private String characterName = "";

    private GameEngine instance;

    public GameEngine() {
    }

    public void run() {
        while (true){
            // waits for player input
            // change game status
            // render graphics
        }
    }

    public GameEngine getInstance() {
        if (instance == null){
            instance = new GameEngine();
        }
        return instance;
    }
}

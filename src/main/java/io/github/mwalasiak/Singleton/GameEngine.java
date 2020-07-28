package io.github.mwalasiak.Singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final Long serialVersionUID = 2354541L;
    private int healthPoints = 100;
    private String characterName = "";

    private static GameEngine instance;

    private GameEngine() {
    }

    public void run() {
        while (true){
            // waits for player input
            // change game status
            // render graphics
        }
    }

    public static GameEngine getInstance() {
        if (instance == null) {

            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

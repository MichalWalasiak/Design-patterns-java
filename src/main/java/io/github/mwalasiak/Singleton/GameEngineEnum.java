package io.github.mwalasiak.Singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");
    private int healthPoints = 100;
    private String CharacterName = "";

    GameEngineEnum(final String characterName) {
        CharacterName = characterName;
    }

    public void run() {
        while (true){
            // waits for player input
            // change game status
            // render graphics
        }
    }
}

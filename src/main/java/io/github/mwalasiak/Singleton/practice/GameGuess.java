package io.github.mwalasiak.Singleton.practice;

import java.util.Scanner;

public class GameGuess {

    Scanner scanner = new Scanner(System.in);
    private int playerGuess;
    private double randomNumber;
    private int score = 0;
    private static GameGuess instance;

    private GameGuess() {
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            playerGuess = scanner.nextInt();
            randomNumber = Math.random() * 10;

            if (playerGuess == randomNumber) {
                score++;
            }
        }

    }

    public static GameGuess getInstance() {
        if (instance == null) {

            synchronized (GameGuess.class) {
                if (instance == null) {
                    instance = new GameGuess();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return getInstance();
    }
}

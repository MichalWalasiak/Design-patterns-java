package io.github.mwalasiak.Singleton.practice;

import java.util.Random;
import java.util.Scanner;

public class GameGuess {
    private int score = 0;
    private Random random = new Random();

    Scanner scanner = new Scanner(System.in);
    private static GameGuess instance;

    private GameGuess() {
    }

    public Object readResolve() {
        return getInstance();
    }

    public void play() {
        for (int i = 0; i < 10; i++) {
            final int playerGuess = scanner.nextInt();
            final int randomNumber = random.nextInt(9);

            if (playerGuess == randomNumber) {
                score++;
                System.out.println("Hit");
            }
            System.out.println(randomNumber);
            System.out.println("your score is " + score);
        }
    }

    public int getScore() {
        return score;
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
}

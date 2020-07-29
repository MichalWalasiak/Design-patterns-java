package io.github.mwalasiak.Singleton.practice;

import java.util.Random;
import java.util.Scanner;

public class GameGuess {
    private int score = 0;
    private Random random = new Random();

    Scanner scanner = new Scanner(System.in);

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

    public static class Holder{
        private static final GameGuess instance = new GameGuess();
    }

    public static GameGuess getInstance() {
        return Holder.instance;
    }

    public int getScore() {
        return score;
    }
}

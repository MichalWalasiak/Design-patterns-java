package io.github.mwalasiak.Singleton.practice;

public class Main {

    public static void main(String[] args) {

        GameGuess game = GameGuess.getInstance();

        game.play();
        int score = game.getScore();

        GameGuess game1 = GameGuess.getInstance();

        if (game == game1) {
            System.out.println("singleton");
            if (score == game1.getScore()) {
                System.out.println("and points are in order");
            }
        }
    }
}

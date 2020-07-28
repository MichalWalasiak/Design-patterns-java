package io.github.mwalasiak.Singleton;

public class Main {

    public static void main(String[] args) {

        GameEngine engine = GameEngine.getInstance();

        GameEngine engine1 = GameEngine.getInstance();

        System.out.println(engine == engine1);
    }
}

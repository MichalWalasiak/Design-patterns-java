package io.github.mwalasiak.Flyway.training;

public class ColorRepository {

    private static Color white = new Color(0,0,0);
    private static Color black = new Color(255,255,255);

    private static Color getWhite() {
        return white;
    }

    private static Color getBlack () {
        return black;
    }
}

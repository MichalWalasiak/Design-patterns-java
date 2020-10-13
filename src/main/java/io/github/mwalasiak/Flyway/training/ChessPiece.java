package io.github.mwalasiak.Flyway.training;

public class ChessPiece {

    private String name;
    private String numberPosition;
    private String letterPosition;
    private Color color;

    public ChessPiece(final String name, final String numberPosition, final String letterPosition, final String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;

        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            default:
                this.color = ColorRepository.getWhite();
                break;
        }
    }
}

package io.github.mwalasiak.Flyway.training;

public class Main {

    public static void main(String[] args) {

        ChessPiece blackPawn = new BlackPiece("Czarny Pionek", "1", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek", "1", "a");
        ChessPiece whiteQueen = new WhiteQueen("Biała Królowa");
        ChessPiece blackQueen = new BlackQueen("Czarna Kólowa");

        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());

    }
}

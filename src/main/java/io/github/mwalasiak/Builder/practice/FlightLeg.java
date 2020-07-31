package io.github.mwalasiak.Builder.practice;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private int price;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder{
        private String from;
        private String to;
        private boolean delayed;
        private int price;

    }
}

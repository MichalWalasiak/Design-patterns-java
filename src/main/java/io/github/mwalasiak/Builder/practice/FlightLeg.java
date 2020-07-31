package io.github.mwalasiak.Builder.practice;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        from = flightLegBuilder.from;
        to = flightLegBuilder.to;
        flightLegBuilder.setDelayed(true);
        price = flightLegBuilder.price;

    }

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

    public void setDelayed(final boolean delayed) {
        this.delayed = delayed;
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

        public void setDelayed(final boolean delayed) {
            this.delayed = delayed;
        }

        public FlightLegBuilder buildFrom(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder buildTo(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build () {
            return new FlightLeg(this);
        }
    }
}

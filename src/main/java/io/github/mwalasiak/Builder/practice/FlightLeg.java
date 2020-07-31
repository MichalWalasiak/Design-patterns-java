package io.github.mwalasiak.Builder.practice;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private int price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;

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

        public FlightLegBuilder(String from,String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build () {
            if (this.price == 0){
                throw new IllegalStateException("field is mandatory");
            }
            return new FlightLeg(this);
        }
    }
}

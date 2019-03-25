public class Passenger {

    private String name;
    private int numberOfbags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfbags, Flight flight, int seatNumber){
        this.name = name;
        this.numberOfbags = numberOfbags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfbags() {
        return numberOfbags;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfbags(int numberOfbags) {
        this.numberOfbags = numberOfbags;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}

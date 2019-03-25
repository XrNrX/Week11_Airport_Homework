import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private Plane plane;
    private ArrayList<Passenger> passengers;
    private ArrayList<Plane> planes;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.planes = new ArrayList<Plane>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void countPlanes(){
        this.planes.size();
    }

    public int availableSeats(){
        return plane.getCapacity() - this.countPassengers();
    }

    public void bookPassenger(Passenger passenger){
        if(this.plane.getCapacity() > this.countPassengers()){
            this.passengers.add(passenger);
        }
    }



}

import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager(){
        this.flights = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public Object countFlights(){
        return this.flights.size();
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public int bagWeightPerPerson(Flight flight){
        return flight.getPlane().getTotalWeight() / 2 / flight.getPlane().getCapacity();
    }

    public int totalBaggageBooked(Flight flight){
        return bagWeightPerPerson(flight) * flight.countPassengers();
    }

    public int initialBaggageAssignment(Flight flight){
        return flight.getPlane().getTotalWeight() / 2;
    }

    public int baggageAllowanceRemaining(Flight flight){
        return initialBaggageAssignment(flight) - bagWeightPerPerson(flight);
    }


}

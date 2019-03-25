import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightmanager;
    Plane plane1;
    Plane plane2;
    Flight flight1;
    Flight flight2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    ArrayList<Flight> flights;

    @Before
    public void setup(){
        flightmanager = new FlightManager();
        flights = new ArrayList<Flight>();
        flightmanager.setFlights(flights);
        flights.add(flight1);
        flights.add(flight2);
        plane1 = new Plane(PlaneType.BOEING747, 1, 50);
        plane2 = new Plane(PlaneType.BOEING777, 2, 100);
        flight1 = new Flight(plane1,"GLA-13", "LDN", "GLA", "00:00");
        flight2 = new Flight(plane2, "JPN-99", "GLA", "JPN", "15:35");
        passenger1 = new Passenger("Stuart", 2, flight1, 1);
        passenger2 = new Passenger("Jenny", 3, flight2, 2);
        passenger3 = new Passenger("Smudge", 1, flight2, 3);

    }

    @Test
    public void canCheckForFlights() {
        assertEquals(2, flightmanager.countFlights());
    }

    @Test
    public void totalFlightBaggage() {
        assertEquals(25, flightmanager.initialBaggageAssignment(flight1));
    }

    @Test
    public void setBaggageWightForFlight() {
        assertEquals(25, flightmanager.bagWeightPerPerson(flight1));
    }

    @Test
    public void totalBaggageBookedOntoFlight() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
        assertEquals(50, flightmanager.totalBaggageBooked(flight2));
    }

    @Test
    public void baggageAllowanceRemaining() {
        flight2.bookPassenger(passenger1);
        assertEquals(25, flightmanager.baggageAllowanceRemaining(flight2));
    }

    @Test
    public void canAssignPassengersToRandomSeats() {
        flight2.bookPassenger(passenger1);
        flight2.bookPassenger(passenger2);
//        flight2.sortPassengersBySeatNumber();
        ArrayList<Passenger> sortedpassengers = flightmanager.sortBySeatNumber(flight2);
        assertEquals(passenger1, sortedpassengers.get(0));


    }
}

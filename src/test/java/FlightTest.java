import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Passenger passenger;
    private Passenger passenger2;
    private Plane plane;
    private Flight flight;


    @Before
    public void setup(){
        passenger = new Passenger("Stuart", 2, flight, 1);
        passenger2 = new Passenger("Jenny", 1, flight, 2);
        plane = new Plane(PlaneType.BOEING747, 1, 50);
        flight = new Flight(plane,"GLA-13", "LDN", "GLA", "00:00");

    }

    @Test
    public void doesFlightHavePlane() {
        assertEquals(PlaneType.BOEING747, plane.getPlane());
        
    }

    @Test
    public void doesFlightHaveAFlightNumber() {
        assertEquals("GLA-13", flight.getFlightNumber());
    }

    @Test
    public void doesFlightHaveDestination() {
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void doesFlightHaveDepartureAirport() {
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void doesFlightHaveDepartureTime() {
        assertEquals("00:00", flight.getDepartureTime());
    }

    @Test
    public void canCheckForAvailableSeats() {
        assertEquals(1, flight.availableSeats());
    }

    @Test
    public void canCheckNumberOfPassenger() {
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canPassengersBeAddedToFlight() {
        flight.bookPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void cantAddPassengersIfNoSeatsAreAvailable() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        assertEquals(1, flight.countPassengers());
    }
}

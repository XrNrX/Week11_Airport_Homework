import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Flight flight;

    @Before
    public void setup(){
        passenger = new Passenger("Stuart", 2, flight, 1);
    }

    @Test
    public void doesThePassengerhaveAName() {
        assertEquals("Stuart", passenger.getName());
    }

    @Test
    public void doesThePassengerHavebags() {
        assertEquals(2, passenger.getNumberOfbags());
    }
}

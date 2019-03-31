import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight(PlaneType.AIRBUSA320, 318, "Edinburgh");
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(318, flight.getNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Edinburgh", flight.getDestination());
    }
}

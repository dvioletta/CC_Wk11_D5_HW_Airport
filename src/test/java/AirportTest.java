import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;


    @Before
    public void before(){
        airport = new Airport("GLA");
    }

    @Test
    public void canGetAirport(){
        assertEquals("GLA", airport.getAirport());
    }



}

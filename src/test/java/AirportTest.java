import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;
    Passenger passenger;
//    HangerCollection hangerCollection;



    @Before
    public void before(){
        airport = new Airport("GLA");
        plane = new PlaneType(PlaneType.AIRBUSA380);
        flight = new Flight(PlaneType.BOEING757, 318, "New York");
        passenger = new Passenger("Howard Stark");
//        hangerCollection = new HangerCollection()

    }


    @Test
    public void canGetAirport(){
        assertEquals("GLA", airport.getAirport());
    }

    @Test
    public void canAssignplane(){
        airport.addPlaneType(Plane){
        assertEquals(1, airport.assignPlane());
        }
    }



}

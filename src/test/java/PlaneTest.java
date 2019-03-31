import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING757, "RyanAir");
        passenger = new Passenger("passenger1");
//        passenger = new Passenger(passenger2);
    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.BOEING757, plane.getType());
    }

    @Test
    public void canGetAirline(){
        assertEquals("RyanAir", plane.getAirline());
    }

    @Test
    public void canCheckPassengerSize(){
        assertEquals(0, plane.getSize());
    }

    @Test
    public void canAddPassenger(){
        plane.addPassenger(passenger);
        assertEquals(1, plane.getPassengerCount());
    }


}

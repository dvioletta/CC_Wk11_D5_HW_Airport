import java.util.ArrayList;


public class Plane {

    public PlaneType plane;
    private String airline;
    public ArrayList<Passenger> passenger;



    public Plane(PlaneType plane, String airline){
        this.plane = plane;
        this.airline = airline;
        this.passenger = new ArrayList<>();

    }

    public PlaneType getType(){
       return this.plane;
    }

    public String getAirline(){
        return this.airline;
    }

    public int getSize(){

        return this.passenger.size();
    }

    public void addPassenger(Passenger passenger){
        this.passenger.add(passenger);
    }
}

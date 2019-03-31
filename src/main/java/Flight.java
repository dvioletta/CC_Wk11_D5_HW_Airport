public class Flight {


    public PlaneType plane;
    private Integer flightNumber;
    private String destination;

    public Flight(PlaneType plane, Integer flightNumber, String destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
       this.destination = destination;
    }

    public int getNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }
}

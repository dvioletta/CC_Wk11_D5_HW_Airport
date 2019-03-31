import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planecollection;
    private String airport;
    private ArrayList<Integer> hangerCollection;


    public Airport(String airport){
        this.hangerCollection = new ArrayList<>();
        this.airport = airport;
        this.planecollection = new ArrayList<>();
    }

    public
    String getAirport() {
        return airport;
    }

    public int assignPlane(){
        return planecollection.size();
    }
}

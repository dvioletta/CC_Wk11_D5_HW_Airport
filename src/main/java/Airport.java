import java.util.ArrayList;

public class Airport {

    private ArrayList<Integer> hangers;
    private String airport;


    public Airport(String airport){
        this.hangers = new ArrayList<>();
        this.airport = airport;
    }

    public
    String getAirport() {
        return airport;
    }
}

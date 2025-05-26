package karenhim.shared_places_application;

public class SharedPlaces {

    private int placeid;
    private String name;
    private String activity;
    private int rating;
    private boolean visited;

    public SharedPlaces() {}

    //Constructor
    public SharedPlaces(int placeid, String name, String activity, int rating, boolean visited){
        this.placeid=placeid;
        this.name=name;
        this.activity=activity;
        this.rating=rating;
        this.visited=visited;
    }

    public int getPlaceid() {
        return placeid;
    }

    public void setPlaceid(int placeid) {
        this.placeid = placeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

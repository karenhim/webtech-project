package karenhim.shared_places_application;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
- Java Persistence API entity (JPA)
- each instance has id, name, activity, rating, and visited flag
 */

@Entity
public class SharedPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String activity;
    private int rating;
    private boolean visited;

    // Default constructor for JPA
    public SharedPlaces() {
    }

    // Constructor
    public SharedPlaces(String name, String activity, int rating, boolean visited) {
        this.name = name;
        this.activity = activity;
        this.rating = rating;
        this.visited = visited;
    }

    // Constructor with ID as Long
    public SharedPlaces(Long id, String name, String activity, int rating, boolean visited) {
        this.id = id;
        this.name = name;
        this.activity = activity;
        this.rating = rating;
        this.visited = visited;
    }

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return "SharedPlaces{" +
                "placeid=" + id +
                ", name='" + name + '\'' +
                ", activity='" + activity + '\'' +
                ", rating=" + rating +
                ", visited=" + visited +
                '}';
    }
}

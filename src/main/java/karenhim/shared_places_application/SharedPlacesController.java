package karenhim.shared_places_application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SharedPlacesController {

    @GetMapping("/SharedPlaces")
    public List<SharedPlaces> testRoute() {
        return List.of(
                new SharedPlaces(1, "Starbucks", "Cafe", 1, true),
                new SharedPlaces(2, "Berliner Zoo", "Zoo", 5, false),
                new SharedPlaces(3, "Mall Of Berlin", "Shopping center", 4, true)
        );
    }
}

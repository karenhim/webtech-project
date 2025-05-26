package karenhim.shared_places_application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SharedPlacesController {

    @Autowired
    SharedPlaces service;

    @PostMapping("/SharedPlaces")
    public SharedPlaces createSharedPlaces(@RequestBody SharedPlaces SharedPlaces) {
        return service.save(SharedPlaces);
    }

    @GetMapping("/SharedPlaces")
    public List<SharedPlaces> testRoute() {
        return List.of(
                new SharedPlaces(1, "Starbucks", "Cafe", 1, true),
                new SharedPlaces(2, "Berliner Zoo", "Zoo", 5, false),
                new SharedPlaces(3, "Mall Of Berlin", "Shopping center", 4, true)
        );
    }
}

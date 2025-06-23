package karenhim.shared_places_application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
A spring MVC REST controller with 2 endpoints
 */

@RestController
public class SharedPlacesController {

    @Autowired
    SharedPlacesService service;

    @PostMapping("/SharedPlaces")
    public SharedPlaces createSharedPlaces(@RequestBody SharedPlaces SharedPlaces) {
        return service.save(SharedPlaces);
    }

    @GetMapping("/SharedPlaces")
    public List<SharedPlaces> testRoute() {

        return service.getAll();
    }
}

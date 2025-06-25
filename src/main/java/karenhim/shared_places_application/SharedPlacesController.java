package karenhim.shared_places_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
A spring MVC REST controller with 2 endpoints
 */

@RestController
public class SharedPlacesController {

    @Autowired
    SharedPlacesService service;

    @CrossOrigin
    @PostMapping("/SharedPlaces")
    public SharedPlaces createSharedPlaces(@RequestBody SharedPlaces SharedPlaces) {
        return service.save(SharedPlaces);
    }

    @CrossOrigin
    @GetMapping("/SharedPlaces")
    public List<SharedPlaces> testRoute() {

        return service.getAll();
    }

    @CrossOrigin
    @DeleteMapping("/SharedPlaces/{id}")
    public void deleteSharedPlace(@PathVariable Long id) {
        service.delete(id);
    }
}


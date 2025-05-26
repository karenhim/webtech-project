package karenhim.shared_places_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharedPlacesService {
    @Autowired
    SharedPlacesRepository sharedPlacesRepository;

    public SharedPlaces save(SharedPlaces sharedPlaces) {
        return sharedPlacesRepository.save(sharedPlaces);
    }

    public SharedPlaces get(Long id) {
        return sharedPlacesRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }
}

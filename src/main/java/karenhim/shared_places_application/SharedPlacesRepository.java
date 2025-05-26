package karenhim.shared_places_application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedPlacesRepository extends CrudRepository<SharedPlaces, Long> { }
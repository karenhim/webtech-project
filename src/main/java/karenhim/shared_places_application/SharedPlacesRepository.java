package karenhim.shared_places_application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

/*
is a Spring Data repository interface. Extends to give basic CRUD methods without SQL (save(), findAll(), findById(), etc.)
 */
@CrossOrigin
@Repository
public interface SharedPlacesRepository extends CrudRepository<SharedPlaces, Long> { }
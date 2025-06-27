package karenhim.shared_places_application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

@DataJpaTest // Diese Annotation sorgt dafür, dass die Tests mit einer In-Memory-Datenbank ausgeführt werden
public class SharedPlacesRepositoryTest {

    @Autowired
    private SharedPlacesRepository repository; // Repository wird automatisch injiziert

    @Test
    public void testSaveSharedPlace() {
        // Erstellen eines neuen SharedPlaces
        SharedPlaces place = new SharedPlaces("Starbucks", "Cafe", 5, true);

        // Speichern des Objekts
        SharedPlaces savedPlace = repository.save(place);

        // Überprüfen, ob das Objekt korrekt gespeichert wurde
        assertNotNull(savedPlace.getId());  // Die ID sollte nicht null sein
        assertEquals("Starbucks", savedPlace.getName());
        assertEquals("Cafe", savedPlace.getActivity());
        assertEquals(5, savedPlace.getRating());
        assertTrue(savedPlace.getVisited());
    }

    @Test
    public void testFindById() {
        // Erstellen eines neuen SharedPlaces
        SharedPlaces place = new SharedPlaces("Starbucks", "Cafe", 5, true);
        SharedPlaces savedPlace = repository.save(place);

        // Finden des Objekts mit der gespeicherten ID
        Optional<SharedPlaces> foundPlace = repository.findById(savedPlace.getId());

        // Überprüfen, ob das Objekt gefunden wurde
        assertTrue(foundPlace.isPresent());
        assertEquals(savedPlace.getId(), foundPlace.get().getId());
        assertEquals("Starbucks", foundPlace.get().getName());
    }

    @Test
    public void testFindAll() {
        // Erstellen von SharedPlaces-Objekten
        SharedPlaces place1 = new SharedPlaces("Starbucks", "Cafe", 5, true);
        SharedPlaces place2 = new SharedPlaces("Berliner Zoo", "Zoo", 3, false);
        repository.save(place1);
        repository.save(place2);

        // Abrufen aller SharedPlaces
        Iterable<SharedPlaces> places = repository.findAll();

        // Überprüfen, ob mindestens 2 Orte gespeichert wurden
        assertNotNull(places);
        assertTrue(places.iterator().hasNext());
    }

    @Test
    public void testDeleteById() {
        // Erstellen eines neuen SharedPlaces
        SharedPlaces place = new SharedPlaces("Starbucks", "Cafe", 5, true);
        SharedPlaces savedPlace = repository.save(place);

        // Löschen des Objekts
        repository.deleteById(savedPlace.getId());

        // Überprüfen, ob das Objekt gelöscht wurde
        Optional<SharedPlaces> deletedPlace = repository.findById(savedPlace.getId());
        assertFalse(deletedPlace.isPresent());  // Es sollte nicht mehr vorhanden sein
    }
}

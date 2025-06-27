package karenhim.shared_places_application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SharedPlacesTest {

    @Test
    void testToString() {
        SharedPlaces place = new SharedPlaces(1L, "Starbucks", "Cafe", 1, true);
        String expected = "SharedPlaces{placeid=1, name='Starbucks', activity='Cafe', rating=1, visited=true}";
        String actual = place.toString();
        assertEquals(expected, actual);
    }
}
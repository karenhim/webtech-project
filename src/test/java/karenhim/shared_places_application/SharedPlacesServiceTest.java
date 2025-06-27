package karenhim.shared_places_application;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.doReturn;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class SharedPlacesServiceTest {

    @InjectMocks
    private SharedPlacesService service;

    @Mock
    private SharedPlacesRepository repository;

    @Test
    @DisplayName("should find a place by its id")
    void testGet() {
        // Beispielobjekte
        var p1 = new SharedPlaces(1L, "Starbucks", "Cafe", 1, true);
        // Nur das relevante Mocking behalten
        doReturn(java.util.Optional.of(p1)).when(repository).findById(1L);

        // Testaufruf der Methode
        SharedPlaces actual = service.get(1L);

        // Überprüfe das Ergebnis
        assertEquals(1L, actual.getId());
    }
}

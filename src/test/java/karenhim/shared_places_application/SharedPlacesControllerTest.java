package karenhim.shared_places_application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;

@AutoConfigureMockMvc
@SpringBootTest
public class SharedPlacesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Mock des SharedPlacesService mit @MockBean, um sicherzustellen, dass es im Anwendungskontext verwendet wird
    @MockBean
    private SharedPlacesService service;

    @Test
    public void testGetRoute() throws Exception {
        // Beispielobjekt für SharedPlaces
        SharedPlaces place = new SharedPlaces(1L, "Starbucks", "Cafe", 5, true);

        // Definiere das Verhalten des gemockten Service
        when(service.getAll()).thenReturn(Collections.singletonList(place));

        // Test der GET-Anfrage an /SharedPlaces
        this.mockMvc.perform(get("/SharedPlaces"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(content().string(containsString("Starbucks")));
    }
}

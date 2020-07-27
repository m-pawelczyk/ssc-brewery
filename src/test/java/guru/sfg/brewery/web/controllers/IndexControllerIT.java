package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 27.07.2020
 * created IndexControllerIT in guru.sfg.brewery.web.controllers
 * in project scc-brewery
 */
@WebMvcTest
public class IndexControllerIT extends BaseIT {

    @Test
    void testGetIndexSlash() throws Exception{
        mockMvc.perform(get("/" ))
                .andExpect(status().isOk());
    }
}

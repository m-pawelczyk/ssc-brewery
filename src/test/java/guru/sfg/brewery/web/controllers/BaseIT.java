package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.stream.Stream;

import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 27.07.2020
 * created BaseIT in guru.sfg.brewery.web.controllers
 * in project scc-brewery
 */
public abstract class BaseIT {
    @Autowired
    WebApplicationContext wac;

    protected MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(wac)
                .apply(springSecurity())
                .build();
    }

    public static Stream<Arguments> getStreamAdminCustomer() {
        return Stream.of(Arguments.of("spring" , "guru"),
                Arguments.of("ryba", "akwarium"));
    }

    public static Stream<Arguments> getStreamAllUsers() {
        return Stream.of(Arguments.of("spring" , "guru"),
                Arguments.of("ryba", "akwarium"),
                Arguments.of("user", "password"));
    }

    public static Stream<Arguments> getStreamNotAdmin() {
        return Stream.of(Arguments.of("ryba", "akwarium"),
                Arguments.of("user", "password"));
    }
}

package guru.sfg.brewery.security;

import guru.sfg.brewery.domain.security.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 15.08.2020
 * created BeerOrderAuthenticationManager in guru.sfg.brewery.security
 * in project scc-brewery
 */
@Slf4j
@Component
public class BeerOrderAuthenticationManger {

    public boolean customerIdMatches(Authentication authentication, UUID customerId){
        User authenticatedUser = (User) authentication.getPrincipal();

        log.debug("Auth User Customer Id: " + authenticatedUser.getCustomer().getId() + " Customer Id:" + customerId);

        return authenticatedUser.getCustomer().getId().equals(customerId);
    }

}
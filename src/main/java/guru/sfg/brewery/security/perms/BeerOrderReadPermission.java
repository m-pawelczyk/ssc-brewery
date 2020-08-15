package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 15.08.2020
 * created BeerOrderReadPermission in guru.sfg.brewery.security.perms
 * in project scc-brewery
 */
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('order.read') OR " +
        "hasAuthority('customer.order.read') " +
        " AND @beerOrderAuthenticationManger.customerIdMatches(authentication, #customerId )")
public @interface BeerOrderReadPermission {
}

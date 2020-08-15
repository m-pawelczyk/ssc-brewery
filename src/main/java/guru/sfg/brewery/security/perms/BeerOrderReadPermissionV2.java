package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 15.08.2020
 * created BeerOrderReadPermissionV2 in guru.sfg.brewery.security.perms
 * in project scc-brewery
 */

@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAnyAuthority('order.read', 'customer.order.read')")
public @interface BeerOrderReadPermissionV2 {
}

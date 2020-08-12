package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 12.08.2020
 * created BreweryDeletePermission in guru.sfg.brewery.security.perms
 * in project scc-brewery
 */
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('brewery.delete')")
public @interface BreweryDeletePermission {
}

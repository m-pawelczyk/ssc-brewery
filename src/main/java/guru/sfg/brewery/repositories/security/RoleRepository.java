package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 12.08.2020
 * created RoleRepository in guru.sfg.brewery.repositories.security
 * in project scc-brewery
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}

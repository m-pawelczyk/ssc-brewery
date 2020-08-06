package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.08.2020
 * created AuthorityRepository in guru.sfg.brewery.repositories.security
 * in project scc-brewery
 */
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}

package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.08.2020
 * created UserRepository in guru.sfg.brewery.repositories.security
 * in project scc-brewery
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    List<User> findAllByAccountNonLockedAndLastModifiedDateIsBefore(Boolean locked, Timestamp timestamp);
}

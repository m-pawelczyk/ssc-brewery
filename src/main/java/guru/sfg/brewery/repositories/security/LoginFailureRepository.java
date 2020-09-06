package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.LoginFailure;
import guru.sfg.brewery.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.09.2020
 * created LoginFailureRepository in guru.sfg.brewery.repositories.security
 * in project scc-brewery
 */
public interface LoginFailureRepository extends JpaRepository<LoginFailure, Integer> {

    List<LoginFailure> findAllByUserAndCreatedDateIsAfter(User user, Timestamp timestamp);
}

package guru.sfg.brewery.repositories.security;

import guru.sfg.brewery.domain.security.LoginSuccess;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.09.2020
 * created LoginSuccessRepository in guru.sfg.brewery.repositories.security
 * in project scc-brewery
 */
public interface LoginSuccessRepository extends JpaRepository<LoginSuccess, Integer> {
}

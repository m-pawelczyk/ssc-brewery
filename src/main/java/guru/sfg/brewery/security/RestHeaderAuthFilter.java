package guru.sfg.brewery.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 04.08.2020
 * created RestHeaderAuthFilter in guru.sfg.brewery.security
 * in project scc-brewery
 */
@Slf4j
public class RestHeaderAuthFilter extends AbstractRestAuthFilter {

    public RestHeaderAuthFilter(RequestMatcher requiresAuthenticationRequestMatcher) {
        super(requiresAuthenticationRequestMatcher);
    }

    protected String getPassword(HttpServletRequest request) {
        return request.getHeader("Api-Secret");
    }

    protected String getUsername(HttpServletRequest request) {
        return request.getHeader("Api-Key");
    }
}

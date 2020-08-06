package guru.sfg.brewery.security;

import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.http.HttpServletRequest;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 06.08.2020
 * created RestUrlAuthFilter in guru.sfg.brewery.security
 * in project scc-brewery
 */
public class RestUrlAuthFilter extends AbstractRestAuthFilter {

    public RestUrlAuthFilter(RequestMatcher requiresAuthenticationRequestMatcher) {
        super(requiresAuthenticationRequestMatcher);
    }

    protected String getPassword(HttpServletRequest request) {
        return request.getParameter("apiSecret");
    }

    protected String getUsername(HttpServletRequest request) {
        return request.getParameter("apiKey");
    }
}

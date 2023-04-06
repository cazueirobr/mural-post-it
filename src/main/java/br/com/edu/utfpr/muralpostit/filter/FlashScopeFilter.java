package br.com.edu.utfpr.muralpostit.filter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter("/*")
public class FlashScopeFilter implements Filter {

    private static final String FLASH_SESSION_KEY = "FLASH_SESSION_KEY";

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // reinstate any flash scoped params from the users session
        // and clear the session
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpSession session = httpRequest.getSession(true);
            if (session != null) {
                Map<String, Object> flashParams = (Map<String, Object>) session.getAttribute(FLASH_SESSION_KEY);
                if (flashParams != null) {
                    for (Map.Entry<String, Object> flashEntry : flashParams.entrySet()) {
                        request.setAttribute(flashEntry.getKey(), flashEntry.getValue());
                    }
                    session.removeAttribute(FLASH_SESSION_KEY);
                }
            }
        }

        // process the chain
        chain.doFilter(request, response);

        // store any flash scoped params in the user's session for the
        // next request
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            Map<String, Object> flashParams = new HashMap();
            Enumeration e = httpRequest.getAttributeNames();
            while (e.hasMoreElements()) {
                String paramName = (String) e.nextElement();
                if (paramName.startsWith("flash.")) {
                    Object value = request.getAttribute(paramName);
                    paramName = paramName.substring(6, paramName.length());
                    flashParams.put(paramName, value);
                }
            }
            if (flashParams.size() > 0) {
                HttpSession session = httpRequest.getSession(true);
                session.setAttribute(FLASH_SESSION_KEY, flashParams);
            }
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        // no-op
    }

    public void destroy() {
        // no-op
    }
}

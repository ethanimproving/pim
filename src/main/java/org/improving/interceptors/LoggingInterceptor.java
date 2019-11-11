package org.improving.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

public class LoggingInterceptor extends HandlerInterceptorAdapter {

    public static final String FIRST_REQUEST_TIME = "firstRequestTime";
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        var session = request.getSession();

        if (session.getAttribute(FIRST_REQUEST_TIME) == null) {
            session.setAttribute(FIRST_REQUEST_TIME, LocalDateTime.now());
        }

        logger.info("Request recieved {} {}", request.getMethod(), request.getRequestURI());
        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        var session = request.getSession();

        logger.info("Completed request for a session that started at {}", session.getAttribute(FIRST_REQUEST_TIME));
    }


}

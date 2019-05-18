package com.walter.config.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("\n>>>>>>>>>>>>>>>>>>");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        System.out.println(req.getMethod()+" "+req.getRequestURL());
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("<<<<<<<<<<<<<<<<<<");
    }

    @Override
    public void destroy() {

    }
}

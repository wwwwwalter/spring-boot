package com.walter.config.filter.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet());
        bean.addUrlMappings("/myServlet");
        return bean;
    }
}

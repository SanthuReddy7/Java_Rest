package com.springRest;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * The important step in producing a deployable war file is to provide a SpringBootServletInitializer subclass and override its
 * configure method. This makes use of Spring Framework’s Servlet support and allows you to configure your application when it’s
 * launched by the servlet container. Typically, you update your application’s main class to extend SpringBootServletInitializer.
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.boot.context.web.SpringBootServletInitializer# configure
     * (org.springframework.boot.builder.SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestSampleApplication.class);
    }
}
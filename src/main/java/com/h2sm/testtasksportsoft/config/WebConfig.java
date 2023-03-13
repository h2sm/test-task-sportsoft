package com.h2sm.testtasksportsoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = { "com.h2sm.testtasksportsoft.controllers" })
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/**")
                .addResourceLocations("/WEB-INF/");
    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//    }
//

//    @Override
//    public void configureViewResolvers(final ViewResolverRegistry registry) {
//        registry.jsp("/webapp/WEB-INF/view/", ".jsp");
//    }
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
       bean.setPrefix("WEB-INF/jsp/");
        bean.setSuffix(".jsp");

        return bean;
    }

}

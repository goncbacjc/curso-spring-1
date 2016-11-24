package com.film.producer.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by arche on 1/11/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.film.producer")
public class AppConfigAdapter extends WebMvcConfigurerAdapter {
    @Bean(name = "errorProperties")
    public PropertiesFactoryBean mapper(){
        final PropertiesFactoryBean bean = new PropertiesFactoryBean();
        bean.setLocation(new ClassPathResource("film-producer-error-code.properties"));
        return bean;
    }
}

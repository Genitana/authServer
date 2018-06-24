package com.robert.authConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
//                .requestMatchers().anyRequest()
//                .and()
                .requestMatchers()
//                .antMatchers("/oauth/token")  //
                .antMatchers("/health/*")   //
                .and()
                .authorizeRequests()
//                  .antMatchers("/product/**").access("#oauth2.hasScope('select') and hasRole('ROLE_USER')")
                .antMatchers("/index.html").permitAll()  //
                .antMatchers("/oauth/*").permitAll()  //
                .and()
                .anonymous()
                .and()
                // TODO: put CSRF protection back into this endpoint
                .csrf()
                .disable();
    }
}

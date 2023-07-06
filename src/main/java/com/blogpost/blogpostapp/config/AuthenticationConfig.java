package com.blogpost.blogpostapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AuthenticationConfig {
    

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{

       httpSecurity.authorizeHttpRequests(auth->auth.requestMatchers("/**").permitAll().anyRequest().authenticated()).csrf(auth->auth.disable());
        return httpSecurity.build();
    }
}

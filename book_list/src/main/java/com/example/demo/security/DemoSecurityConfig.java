package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests(configure->
                configure
                        .requestMatchers(HttpMethod.GET,"/api/book").hasRole("USER")
                        .requestMatchers(HttpMethod.GET,"/api/book/**").hasRole("USER")
                        .requestMatchers(HttpMethod.POST,"/api/book").hasRole("USER")
                        .requestMatchers(HttpMethod.PUT,"/api/book").hasRole("USER")
                        .requestMatchers(HttpMethod.DELETE,"/api/book/**").hasRole("USER")

        );

        http.httpBasic(Customizer.withDefaults());


        http.csrf(crsf->crsf.disable());

        return http.build();
    }
}

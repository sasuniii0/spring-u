package com.example.demoSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurity {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails john = User.builder().username("john")
                .password("{noop}123")
                .roles("Employee")
                .build();

        UserDetails jane = User.builder().username("jane")
                .password("{noop}123")
                .roles("Manager")
                .build();

        UserDetails admin = User.builder().username("admin")
                .password("{noop}123")
                .roles("Admin")
                .build();
        return  new InMemoryUserDetailsManager(john, jane, admin);
    }
}

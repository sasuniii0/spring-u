package com.example.demoSecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

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

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configure->
                configure.anyRequest().authenticated()
        )
                .formLogin(form->
                        form.loginPage("/login")
                                .loginProcessingUrl("/authenticateUser")
                                .permitAll()
                );
        return http.build();
    }
}

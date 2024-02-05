package com.example.loan.secure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable().authorizeHttpRequests().requestMatchers("/sign","/log","/postForm","/getAll","/acopening/post","/acopening/getall","/acopening/getAccount/**","/acopening/getid/**","/acopening/deposit/**","/acopening/withdraw/**","/acopening/delete/**").permitAll().and()
				.authorizeHttpRequests().requestMatchers("**").authenticated().and().formLogin().and().build();
	}


}

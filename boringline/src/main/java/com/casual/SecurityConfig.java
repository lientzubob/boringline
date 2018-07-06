package com.casual;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	 @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	                .inMemoryAuthentication()
	                .withUser("aaa").password("aaa").roles("USER").and()
	                .withUser("admin").password("1q2w3e4r").roles("USER","ADMIN");
	    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// @formatter:off
		http.httpBasic().and().logout().and().authorizeRequests().anyRequest().fullyAuthenticated().and().csrf()
				.disable();
		// @formatter:on
	}
}


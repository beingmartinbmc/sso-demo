package net.prasenjit.security.proxy;

import org.springframework.cloud.security.oauth2.sso.OAuth2SsoConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * Created by PRASENJIT on 8/12/2015.
 */
@Configuration
public class SecurityConfiguration extends OAuth2SsoConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.logout().and().antMatcher("/**").authorizeRequests().anyRequest().authenticated();
    }
}

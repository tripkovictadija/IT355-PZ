package pz.tadija.it355pztadija.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().and().authorizeRequests().anyRequest().permitAll();
                /*.antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/*").permitAll()
                .antMatchers(HttpMethod.GET,"/*").permitAll()
                .antMatchers(HttpMethod.DELETE,"/*").permitAll()
                .antMatchers(HttpMethod.PUT,"/*").permitAll()
                .anyRequest().authenticated();*/
    }


}

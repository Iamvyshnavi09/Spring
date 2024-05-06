package in.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@ComponentScan("Super") 
public class AppConfig extends WebSecurityConfiguration {
 
    @Bean  
    public UserDetailsService userDetailsService() {  
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();  
        manager.createUser(User.withDefaultPasswordEncoder()  
        .username("jai").password("123456").roles("ADMIN").build());  
        return manager;  
    }  
 
	protected void configure(HttpSecurity http) throws Exception {
	      http.authorizeRequests().  
	      requestMatchers("/index","/").permitAll()  
	      .requestMatchers("/admin").authenticated()  
	      .and()  
	      .formLogin()  
	      .loginPage("/login")  
	      .and()  
	      .rememberMe()  
	      .key("rem-me-key")  
	      .rememberMeParameter("remember") //Name of checkbox at login page  
	      .rememberMeCookieName("rememberlogin") //Cookie name
	      .tokenValiditySeconds(300) //Remember login credentials for number of seconds 
	      .and()  
	      .logout()  
	      .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));    		
	}
}
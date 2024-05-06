package in.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig  extends WebSecurityConfiguration{
	
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
		UserDetails admin = User.withUsername("vaishu").password(encoder.encode("9999")).roles("ADMIN").build();
		/*second user*/
		UserDetails user = User.withUsername("karthik").password(encoder.encode("5252")).roles("USER").build();

		return new InMemoryUserDetailsManager(admin,user);
	}
		
	/*Security filter chain  for every End point*/

@Bean
	
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		return http.csrf().disable().authorizeRequests().
				requestMatchers("/mobile").permitAll().and().
				authorizeRequests().requestMatchers("/mobile/**")
				.authenticated().and().formLogin().and().build();
		
	}
	
	
		/*we are not going to save this password in DB so we use password Encoder*/
		
	@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		
		
	}

}

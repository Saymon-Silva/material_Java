package www.xxx.videos.config;

import lombok.AllArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.SecurityContextRepository;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

    private final SecurityContextRepository repo;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        httpSecurity.authorizeHttpRequests(autorizeRequests -> autorizeRequests
                .requestMatchers(HttpMethod.POST,"/authentication/login").permitAll()
                .requestMatchers(HttpMethod.POST,"/autorizacao-consulta").permitAll()

                .requestMatchers(HttpMethod.GET,"/canal").hasAuthority("Get")
                .requestMatchers(HttpMethod.POST, "/canal").hasAuthority("Post")
                .requestMatchers(HttpMethod.DELETE, "/canal").hasAuthority("Delete")

                .requestMatchers("/user").hasAnyAuthority("Get","Post")

                .anyRequest().authenticated());
        httpSecurity.securityContext((context) -> context.securityContextRepository(repo));
//        httpSecurity.formLogin(Customizer.withDefaults());
        httpSecurity.logout(Customizer.withDefaults());
//        httpSecurity.httpBasic(Customizer.withDefaults());
        return httpSecurity.build();
    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(autenticacaoService).passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }

    //determina a forma de busca do usuario a ser autenticada
    //gera um autentification manager padrao
//    @Autowired
//    public void config(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService((autenticacaoService)).passwordEncoder(NoOpPasswordEncoder.getInstance());
//    }
}
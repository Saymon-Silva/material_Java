package www.xxx.videos.config;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import www.xxx.videos.model.Autorizacao;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.model.UsuarioDetailsEntity;
import www.xxx.videos.repository.UsuarioRepository;

import java.util.List;

@Configuration
@AllArgsConstructor
public class DataBaseConfig {
    private final UsuarioRepository usuarioRepository;

    @PostConstruct
    public void init() {
        try {
            usuarioRepository.findByUsuarioDetailsEntity_Username("teste").get();
        } catch (Exception e) {
            Usuario user = new Usuario();
            user.setNome("teste");
            user.setUsuarioDetailsEntity(UsuarioDetailsEntity
                    .builder()
                    .user(user)
                    .enabled(true)
                    .authorities(List.of(Autorizacao.GET, Autorizacao.POST, Autorizacao.DELETE))
                    .accountNonExpired(true)
                    .accountNonLocked(true)
                    .credentialsNonExpired(true)
                    .username("teste")
                    .password(new BCryptPasswordEncoder().encode("teste123"))
                    .build());
            usuarioRepository.save(user);
        }
    }
//
//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
//      UserDetails user = User.withDefaultPasswordEncoder()
//              .username("mi72")
//              .password("M!7dois")
//              .build();
////        UserDetails user2 = User.withDefaultPasswordEncoder()
////                .username("mi72")
////                .password("M!7dois")
////                .build();
//        //
////        UserDetails user = User.builder()
////                .username("mi72")
////                .password("M!7dois")
////                .passwordEncoder(new )
////                .build();
//      return new InMemoryUserDetailsManager();
//    }
}
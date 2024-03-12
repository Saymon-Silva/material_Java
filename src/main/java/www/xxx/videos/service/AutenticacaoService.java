package www.xxx.videos.service;

import lombok.AllArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.repository.UsuarioRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AutenticacaoService implements UserDetailsService {

    private UsuarioRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> userOptional = userRepository.findByUsuarioDetailsEntity_Username(username);
        if (userOptional.isPresent()) {
            return userOptional.get().getUsuarioDetailsEntity();
        }
        throw new UsernameNotFoundException("Dados invalidos");
    }
}
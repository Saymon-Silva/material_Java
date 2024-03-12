package www.xxx.videos.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.repository.UsuarioRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario create(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
}
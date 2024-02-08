package www.xxx.videos.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.repository.UsuairoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {
    private final UsuairoRepository usuairoRepository;

    public Usuario create(Usuario usuario){
        return usuairoRepository.save(usuario);
    }
    public Usuario update(Usuario usuario){
        return usuairoRepository.save(usuario);
    }
    public void delete(Usuario usuario){
        usuairoRepository.delete(usuario);
    }
    public void deleteById(Integer id){
        usuairoRepository.deleteById(id);
    }
    public Usuario findById(Integer id){
        return usuairoRepository.findById(id).get();
    }
    public Usuario findByNome(String nome){
        return usuairoRepository.findByNome(nome);
    }
    public List<Usuario> findAll(){
        return usuairoRepository.findAll();
    }
}

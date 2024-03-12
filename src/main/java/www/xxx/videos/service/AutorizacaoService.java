package www.xxx.videos.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Autorizacao;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.model.UsuarioDetailsEntity;
import www.xxx.videos.repository.UsuarioRepository;
import www.xxx.videos.repository.UsuarioDetailsEntityRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorizacaoService {
    private final UsuarioDetailsEntityRepository usuarioDetailsEntityRepository;
    private final UsuarioRepository usuarioRepository;

    //id do usuario
    //ai acha o usuarodetail que ele ta linkado e por ai acha as suas autorizacoes
    public List<Autorizacao> findAllAutorizacoes(Integer userId) {
        Usuario usuario = usuarioRepository.findById(userId).get();
        UsuarioDetailsEntity usuarioDetails = usuarioDetailsEntityRepository.findByUser_Id(usuario.getId());
        List<Autorizacao> autorizacoes = usuarioDetailsEntityRepository.findAllById(usuarioDetails.getId());
        return autorizacoes;
    }
}
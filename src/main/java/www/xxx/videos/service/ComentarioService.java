package www.xxx.videos.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Comentario;
import www.xxx.videos.repository.ComentarioRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ComentarioService {
    private final ComentarioRepository comentarioRepository;

    public Comentario create(Comentario comentario){
        return comentarioRepository.save(comentario);
    }
    public Comentario update(Comentario comentario){
        return comentarioRepository.save(comentario);
    }
    public void delete(Comentario comentario){
        comentarioRepository.delete(comentario);
    }
    public void deleteById(Integer id){
        comentarioRepository.deleteById(id);
    }
    public Comentario findById(Integer id){
        return comentarioRepository.findById(id).get();
    }
    public List<Comentario> findAll(){
        return comentarioRepository.findAll();
    }
}

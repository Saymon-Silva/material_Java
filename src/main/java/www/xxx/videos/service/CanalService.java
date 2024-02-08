package www.xxx.videos.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Canal;
import www.xxx.videos.repository.CanalRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CanalService {
    private final CanalRepository canalRepository;

    public Canal create(Canal canal){
        return canalRepository.save(canal);
    }
    public Canal update(Canal canal){
        return canalRepository.save(canal);
    }
    public void delete(Canal canal){
        canalRepository.delete(canal);
    }
    public void deleteById(Integer id){
        canalRepository.deleteById(id);
    }
    public Canal findById(Integer id){
        return canalRepository.findById(id).get();
    }
    public Canal findByNome(String nome){
        return canalRepository.findByNome(nome);
    }
    public List<Canal> findAll(){
        return canalRepository.findAll();
    }
}

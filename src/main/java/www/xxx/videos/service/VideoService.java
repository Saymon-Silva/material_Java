package www.xxx.videos.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import www.xxx.videos.model.Video;
import www.xxx.videos.repository.VideoRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VideoService {
    private final VideoRepository videoRepository;

    public Video findById(Integer id){
        return videoRepository.findById(id).get();
    }
    public Video findByName ( String name){
        return videoRepository.findByNome(name);
    }
    public List<Video> findAll(){
        return videoRepository.findAll();
    }
    public Video create(Video video){
        return videoRepository.save(video);
    }
    public Video update(Video video){
        return videoRepository.save(video);
    }
    public void delete(Video video){
        videoRepository.delete(video);
    }
    public void deleteById(Integer id){
        videoRepository.deleteById(id);
    }
}
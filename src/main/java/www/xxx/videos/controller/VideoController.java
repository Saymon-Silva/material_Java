package www.xxx.videos.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import www.xxx.videos.model.Video;
import www.xxx.videos.service.VideoService;

import java.util.List;

@RestController
@RequestMapping("/video")
@AllArgsConstructor
public class VideoController {
    private final VideoService videoService;

    @PostMapping
    public void create(@RequestBody Video video){
        videoService.create(video);
    }
    @PutMapping
    public void update(@RequestBody Video video){
        videoService.update(video);
    }
    @GetMapping
    public List<Video> findAll(){
        return videoService.findAll();
    }
    @GetMapping("/{id}")
    public Video findById(@RequestParam Integer id){
        return videoService.findById(id);
    }
    @DeleteMapping
    public void delete(@RequestBody Video video){
        videoService.delete(video);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@RequestParam Integer id){
        videoService.deleteById(id);
    }
    @GetMapping("/canal")
    public List<Video> findAllByCriador_Nome(@RequestParam String nome){
        return videoService.findAllByCriador_Nome(nome);
    }
}

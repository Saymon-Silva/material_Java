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
    public Video create(@RequestBody Video video) {
        return videoService.create(video);
    }

    @PutMapping
    public Video update(@RequestBody Video video) {
        return videoService.update(video);
    }

    @GetMapping
    public List<Video> findAll() {
        return videoService.findAll();
    }

    @GetMapping("/{id}")
    public Video findById(@PathVariable Integer id) {
        return videoService.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Video video) {
        videoService.delete(video);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        videoService.deleteById(id);
    }

    @GetMapping("/canal")
    public List<Video> findAllByCriador_Nome(@RequestParam String nome) {
        return videoService.findAllByCriador_Nome(nome);
    }

    @GetMapping("/{nome}")
    public Video findByName(@PathVariable String nome) {
        return videoService.findByName(nome);
    }
}
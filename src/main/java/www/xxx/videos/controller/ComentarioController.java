package www.xxx.videos.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import www.xxx.videos.model.Comentario;
import www.xxx.videos.service.ComentarioService;

import java.util.List;

@RestController
@RequestMapping("/comentario")
@AllArgsConstructor
public class ComentarioController {
    private final ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> findAll() {
        return comentarioService.findAll();
    }

    @DeleteMapping
    public void delete(@RequestBody Comentario comentario) {
        comentarioService.delete(comentario);
    }

    @PostMapping
    public Comentario create(@RequestBody Comentario comentario) {
        return comentarioService.create(comentario);
    }
}
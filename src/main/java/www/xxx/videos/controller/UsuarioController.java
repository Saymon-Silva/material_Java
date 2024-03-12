package www.xxx.videos.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.create(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.update(usuario);
    }

    @GetMapping
    public List<Usuario> findALl() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @DeleteMapping
    public void delete(@RequestBody Usuario usuario) {
        usuarioService.delete(usuario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        usuarioService.deleteById(id);
    }
}
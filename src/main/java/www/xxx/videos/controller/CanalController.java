package www.xxx.videos.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import www.xxx.videos.model.Canal;
import www.xxx.videos.service.CanalService;

import java.util.List;

@RestController
@RequestMapping("/canal")
@AllArgsConstructor
public class CanalController {
    private final CanalService canalService;

    @PostMapping
    public ResponseEntity<Canal> create(@RequestBody Canal canal) {
        return ResponseEntity.ok(canalService.create(canal));
    }

    @PutMapping
    public ResponseEntity<Canal> update(@RequestBody Canal canal) {
        return ResponseEntity.ok(canalService.update(canal));
    }

    @DeleteMapping
    public void delete(@RequestBody Canal canal) {
        canalService.delete(canal);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        canalService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Canal findById(@PathVariable Integer id) {
        return canalService.findById(id);
    }

    @GetMapping("/{nome}")
    public Canal findByNome(@PathVariable String nome) {
        return canalService.findByNome(nome);
    }

    @GetMapping
    public List<Canal> findAll() {
        return canalService.findAll();
    }
}
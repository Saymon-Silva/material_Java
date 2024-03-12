package www.xxx.videos.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.xxx.videos.model.Autorizacao;
import www.xxx.videos.service.AutorizacaoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/autorizacao")
public class AutorizacoesController {
    private final AutorizacaoService autorizacaoService;

    @GetMapping("/id/{userId}")
    public List<Autorizacao> findAllAutorizacoes(@PathVariable Integer userId) {
        return autorizacaoService.findAllAutorizacoes(userId);
    }
}
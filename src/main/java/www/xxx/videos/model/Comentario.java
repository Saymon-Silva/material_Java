package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String mensagem;
    @OneToMany
    private List<Comentario> respostas;
    @OneToMany
    private List<Canal> curtidas;
    private Boolean visivel;
}
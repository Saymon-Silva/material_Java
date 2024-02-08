package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Canal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    @ManyToOne
    private Usuario criador;
    @OneToMany
    private Set<Canal> inscritos;
    @OneToMany
    private Set<Canal> inscricoes;
    @OneToMany
    private Set<Video> curtidos;
    @OneToMany(mappedBy = "criador")
    private Set<Video> postados;
    @OneToMany
    private List<Video> historico;
}

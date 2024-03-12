package www.xxx.videos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Canal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    @OneToOne
    private Usuario criador;
    @OneToMany
    private List<Canal> inscritos;
    @OneToMany
    private List<Canal> inscricoes;
    @OneToMany
    @JsonIgnore
    private List<Video> curtidos;
    @OneToMany(mappedBy = "criador")
    @JsonIgnore
    private List<Video> postados;
    @OneToMany
    @JsonIgnore
    private List<Video> historico;
}
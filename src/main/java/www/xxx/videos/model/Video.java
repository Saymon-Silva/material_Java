package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.format.DateTimeFormatter;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    @ManyToOne
    private Canal criador;
    @OneToMany
    private Set<Canal> curtidas;
    @OneToMany
    private Set<Comentario> comentarios;
    @OneToOne(cascade = CascadeType.ALL)
    private Arquivo picture;
}
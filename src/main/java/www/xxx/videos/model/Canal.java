package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Canal {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE.SEQUENCE)
    private Integer id;
    @ManyToOne
    private Usuario criador;
    @OneToMany
    private Set<Canal> inscritos;
    @OneToMany
    private Set<Canal> inscricoes;
    @OneToMany
    private Set<Video> curtidos;
}

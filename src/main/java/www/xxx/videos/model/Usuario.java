package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String sexo;
    private Integer idade;
    @OneToMany(mappedBy = "criador", fetch = FetchType.EAGER)
    private Set<Canal> canais;
}

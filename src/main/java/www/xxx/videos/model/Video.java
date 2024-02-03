package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE.SEQUENCE)
    private Integer id;
    private String nome;
    private Double duracao;
    @OneToMany
    private Set<Canal> likes;
}

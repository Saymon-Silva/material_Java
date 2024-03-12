package www.xxx.videos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @OneToOne(mappedBy = "criador", fetch = FetchType.EAGER)
    private Canal canal;
    @OneToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
    private UsuarioDetailsEntity usuarioDetailsEntity;
}
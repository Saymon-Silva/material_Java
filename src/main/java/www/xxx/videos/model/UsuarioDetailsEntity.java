package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.hibernate.validator.constraints.Length;

import java.util.Collection;
import java.util.List;


//com a criacao de uma segunda entity é bom deixar as necessidades de autentificacao na impleentacao do userDetails,
//e os atributos necessarios para a aplicacao na classe usuario
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString
public class UsuarioDetailsEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false, updatable = false)
//    @Email
    private String username;
    @Column(nullable = false)
    @Length(min = 6)
    private String password;
    private boolean enabled = true;
    //    @OneToMany
//    @Enumerated(EnumType.STRING)
    private List<Autorizacao> authorities = null;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;
    @OneToOne(mappedBy = "usuarioDetailsEntity")
//    @NonNull
//    @JsonIgnore
    private Usuario user;

    @Override
    public String toString() {
        return "UsuarioDetailsEntityRepository";
    }
}
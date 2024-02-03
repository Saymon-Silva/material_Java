package www.xxx.videos.model;

import jakarta.persistence.*;
import lombok.*;

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
}

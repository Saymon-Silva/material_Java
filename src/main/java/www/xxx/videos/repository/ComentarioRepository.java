package www.xxx.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.xxx.videos.model.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

}
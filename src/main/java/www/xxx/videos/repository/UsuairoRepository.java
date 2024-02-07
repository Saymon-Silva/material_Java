package www.xxx.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.xxx.videos.model.Usuario;

@Repository
public interface UsuairoRepository extends JpaRepository<Usuario, Integer> {
}

package www.xxx.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.xxx.videos.model.Canal;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Integer> {

}
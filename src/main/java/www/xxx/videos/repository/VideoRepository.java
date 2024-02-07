package www.xxx.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.xxx.videos.model.Video;

import javax.print.DocFlavor;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    Video findByNome(String nome);
}

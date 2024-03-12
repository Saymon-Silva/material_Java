package www.xxx.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import www.xxx.videos.model.Autorizacao;
import www.xxx.videos.model.Usuario;
import www.xxx.videos.model.UsuarioDetailsEntity;

import java.util.List;

@Repository
public interface UsuarioDetailsEntityRepository extends JpaRepository<UsuarioDetailsEntity, Integer> {
    UsuarioDetailsEntity findByUser_Id(Integer id);
     default List<Autorizacao> findAllById(Integer id){
        UsuarioDetailsEntity userDE =  findById(id).get();
        return userDE.getAuthorities();
    }
}
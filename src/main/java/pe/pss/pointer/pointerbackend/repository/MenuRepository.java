package pe.pss.pointer.pointerbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.Menu;
import pe.pss.pointer.pointerbackend.model.dto.Combo;


@Repository
public interface MenuRepository extends JpaRepository<Menu,String>{

    @Query(nativeQuery = true)
    List<Combo> getComboSelect(@Param("empresa") String empresa, @Param("valor")String valor, @Param("dato")String dato);
}

package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.AreaInteres;

import java.util.List;

@Repository
public interface AreaInteresRepository extends CrudRepository<AreaInteres,String> {

    List<AreaInteres> findByIdPostulante(String id);
}

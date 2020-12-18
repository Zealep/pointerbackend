package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.Discapacidad;

import java.util.List;

@Repository
public interface DiscapacidadRepository extends CrudRepository<Discapacidad,String> {

    List<Discapacidad> findByIdPostulante(String id);
}

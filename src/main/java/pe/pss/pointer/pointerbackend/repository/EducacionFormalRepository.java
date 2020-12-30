package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;

import java.util.List;

@Repository
public interface EducacionFormalRepository extends CrudRepository<EducacionFormal,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyFormal(String tabla,String campo,String empresa);

    List<EducacionFormal> findByIdPostulante(String id);
}

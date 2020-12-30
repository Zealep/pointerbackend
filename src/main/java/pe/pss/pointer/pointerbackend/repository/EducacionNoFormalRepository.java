package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.EducacionNoFormal;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;

import java.util.List;

@Repository
public interface EducacionNoFormalRepository extends CrudRepository<EducacionNoFormal,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyNoFormal(String tabla,String campo,String empresa);

    List<EducacionNoFormal> findByIdPostulante(String id);
}

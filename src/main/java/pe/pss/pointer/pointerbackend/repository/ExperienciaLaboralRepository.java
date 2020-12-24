package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;

import java.util.List;

@Repository
public interface ExperienciaLaboralRepository extends CrudRepository<ExperienciaLaboral,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyExperiencia(String tabla,String campo,String empresa);

    List<ExperienciaLaboral> findByIdPostulante(String id);
}

package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.Familia;

import java.util.List;

@Repository
public interface FamiliaRepository extends CrudRepository<Familia,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyFamilia(String tabla,String campo,String empresa);

    List<Familia> findByIdPostulante(String id);
}

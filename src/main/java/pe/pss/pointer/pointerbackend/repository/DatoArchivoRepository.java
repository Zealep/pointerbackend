package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.DatoArchivo;
import pe.pss.pointer.pointerbackend.model.EducacionNoFormal;

import java.util.List;

@Repository
public interface DatoArchivoRepository extends CrudRepository<DatoArchivo,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyDatoArchivo(String tabla,String campo,String empresa);

    List<DatoArchivo> findByIdCodigoRelacionalAndIdProceso(String id,String proceso);
}

package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.Idioma;

import java.util.List;

@Repository
public interface IdiomaRepository extends CrudRepository<Idioma,String> {

    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyIdioma(String tabla,String campo,String empresa);

    List<Idioma> findByIdPostulante(String id);

}

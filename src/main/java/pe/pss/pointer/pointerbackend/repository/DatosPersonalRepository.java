package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.DatosPersonal;

@Repository
public interface DatosPersonalRepository extends JpaRepository<DatosPersonal,String> {
    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyPostulante(String tabla,String campo,String empresa);

    DatosPersonal findByIdUsuarioWeb(String id);
}

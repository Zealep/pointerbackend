package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.Datos;

import java.util.List;

@Repository
public interface DatosRepository extends CrudRepository<Datos,String> {

    @Query("select d from Datos d where d.idTipoDatos = 'MA' AND d.valorDato = 'F'")
    List<Datos> getGradosInstruccion();

    @Query("select d from Datos d where d.idTipoDatos = 'MA' AND d.valorDato = 'F'")
    List<Datos> getInstituciones();

}

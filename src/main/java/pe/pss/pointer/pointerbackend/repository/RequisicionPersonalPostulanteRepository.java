package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPostulante;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;

import java.util.List;

public interface RequisicionPersonalPostulanteRepository extends CrudRepository<RequisicionPersonalPostulante,Long> {

}

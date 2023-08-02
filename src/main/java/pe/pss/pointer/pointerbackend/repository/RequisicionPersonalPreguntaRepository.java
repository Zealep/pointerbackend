package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;

import java.util.List;

public interface RequisicionPersonalPreguntaRepository extends CrudRepository<RequisicionPersonalPregunta,Integer> {

    @Query(value = "select r from RequisicionPersonalPregunta  r where r.requisicionPersonal.idRequisicionPersonal = ?1")
    List<RequisicionPersonalPregunta> getRequisicionPersonalPreguntaByRequisicion(String id);
}

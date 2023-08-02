package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;

import java.util.List;

public interface RequisicionPersonalPreguntaService {

    List<RequisicionPersonalPregunta> getAllByIdRequisicion(String id);

}

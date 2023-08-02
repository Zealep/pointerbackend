package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;
import pe.pss.pointer.pointerbackend.repository.RequisicionPersonalPreguntaRepository;
import pe.pss.pointer.pointerbackend.service.RequisicionPersonalPreguntaService;
import pe.pss.pointer.pointerbackend.service.RequisicionPersonalService;

import java.util.List;

@Service("requisicionPersonalPreguntaService")
public class RequisicionPersonalPreguntaServiceImpl implements RequisicionPersonalPreguntaService {

    @Autowired
    private RequisicionPersonalPreguntaRepository requisicionPersonalPreguntaRepository;

    @Override
    public List<RequisicionPersonalPregunta> getAllByIdRequisicion(String id) {
        return requisicionPersonalPreguntaRepository.getRequisicionPersonalPreguntaByRequisicion(id);
    }
}

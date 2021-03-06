package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.EducacionNoFormal;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.model.dto.EstudioNoFormalDTO;

import java.util.List;

public interface EducacionNoFormalService {

    EducacionNoFormal findById(String id);
    List<EducacionNoFormal> findByPostulante(String id);
    List<EducacionNoFormal> findAll();
    EducacionNoFormal save(EducacionNoFormal d);
    void deleteById(String id);
    List<EstudioNoFormalDTO> getNoFormalesDetailsByPostulante(String id);

}

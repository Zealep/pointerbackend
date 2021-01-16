package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.model.dto.FamiliaDTO;

import java.util.List;

public interface EducacionFormalService {

    EducacionFormal findById(String id);
    List<EducacionFormal> findByPostulante(String id);
    List<EducacionFormal> findAll();
    EducacionFormal save(EducacionFormal d);
    void deleteById(String id);
    List<EstudioFormalDTO> getFormalesDetailsByPostulante(String id);

}

package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;

import java.util.List;

public interface EducacionFormalService {

    EducacionFormal findById(String id);
    List<EducacionFormal> findByPostulante(String id);
    List<EducacionFormal> findAll();
    EducacionFormal save(EducacionFormal d);
    void deleteById(String id);
}

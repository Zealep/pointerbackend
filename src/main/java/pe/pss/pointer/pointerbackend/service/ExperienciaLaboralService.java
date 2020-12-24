package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;

import java.util.List;

public interface ExperienciaLaboralService {

    ExperienciaLaboral findById(String id);
    List<ExperienciaLaboral> findByPostulante(String id);
    List<ExperienciaLaboral> findAll();
    ExperienciaLaboral save(ExperienciaLaboral d);
    void deleteById(String id);
}

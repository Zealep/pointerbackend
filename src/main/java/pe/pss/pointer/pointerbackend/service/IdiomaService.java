package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.Idioma;
import pe.pss.pointer.pointerbackend.model.dto.IdiomaDTO;

import java.util.List;

public interface IdiomaService {

    Idioma findById(String id);
    List<Idioma> findByPostulante(String id);
    List<Idioma> findAll();
    Idioma save(Idioma d);
    void deleteById(String id);
    List<IdiomaDTO> getIdiomasDetailsByPostulante(String id);
}

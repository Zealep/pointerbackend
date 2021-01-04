package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.Familia;
import pe.pss.pointer.pointerbackend.model.Idioma;

import java.util.List;

public interface FamiliaService {

    Familia findById(String id);
    List<Familia> findByPostulante(String id);
    List<Familia> findAll();
    Familia save(Familia d);
    void deleteById(String id);
}

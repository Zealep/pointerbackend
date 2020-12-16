package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.model.Usuario;

import java.util.List;

public interface DatosPersonalService {

    DatosPersonal findById(String id);
    List<DatosPersonal> findAll();
    DatosPersonal save(DatosPersonal d);
    void deleteById(String id);
    DatosPersonal findByUserWeb(String id);
}

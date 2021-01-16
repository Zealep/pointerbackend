package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.Discapacidad;
import pe.pss.pointer.pointerbackend.model.dto.AreaInteresDTO;
import pe.pss.pointer.pointerbackend.model.dto.DiscapacidadDTO;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

public interface DiscapacidadService {

    Discapacidad save(Discapacidad a);
    List<Discapacidad> findByIdPostulante(String id);
    void delete(String id);
    List<Discapacidad> findAll();
    List<DiscapacidadDTO> getDiscapacidadesDetailsByPostulante(String id);

}

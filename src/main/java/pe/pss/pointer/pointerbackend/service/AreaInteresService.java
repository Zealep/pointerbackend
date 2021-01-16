package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.dto.AreaInteresDTO;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

public interface AreaInteresService {

    AreaInteres save(AreaInteres a);
    List<AreaInteres> findByIdPostulante(String id);
    void delete(String id);
    List<AreaInteres> findAll();
    List<AreaInteresDTO> getAreasDetailsByPostulante(String id);


}

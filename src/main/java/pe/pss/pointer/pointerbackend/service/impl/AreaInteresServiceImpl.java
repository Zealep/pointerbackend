package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.repository.AreaInteresRepository;
import pe.pss.pointer.pointerbackend.repository.DatosPersonalRepository;
import pe.pss.pointer.pointerbackend.service.AreaInteresService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("areaInteresService")
public class AreaInteresServiceImpl implements AreaInteresService {
    @Autowired
    AreaInteresRepository areaInteresRepository;

    @Autowired
    DatosPersonalRepository datosPersonalRepository;

    @Override
    public AreaInteres save(AreaInteres a) {

        String pk = datosPersonalRepository.generatePrimaryKeyPostulante(Constantes.TABLE_AREA_INTERES,Constantes.ID_TABLE_AREA_INTERES,Constantes.CODIGO_EMPRESA);
       a.setIdPostulanteAreas(pk);
       a.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return areaInteresRepository.save(a);
    }

    @Override
    public List<AreaInteres> findByIdPostulante(String id) {
        return areaInteresRepository.findByIdPostulante(id);
    }

    @Override
    public void delete(String id) {
        areaInteresRepository.deleteById(id);
    }

    @Override
    public List<AreaInteres> findAll() {
        return (List<AreaInteres>) areaInteresRepository.findAll();
    }
}

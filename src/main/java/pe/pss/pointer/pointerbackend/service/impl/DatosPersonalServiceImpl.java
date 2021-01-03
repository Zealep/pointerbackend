package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.model.Usuario;
import pe.pss.pointer.pointerbackend.repository.AreaInteresRepository;
import pe.pss.pointer.pointerbackend.repository.DatosPersonalRepository;
import pe.pss.pointer.pointerbackend.service.DatosPersonalService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("datosPersonalService")
public class DatosPersonalServiceImpl implements DatosPersonalService {

    @Autowired
    DatosPersonalRepository datosPersonalRepository;

    @Autowired
    AreaInteresRepository areaInteresRepository;

    @Override
    public DatosPersonal findById(String id) {
        return datosPersonalRepository.findById(id).orElse(null);
    }

    @Override
    public List<DatosPersonal> findAll() {
        return datosPersonalRepository.findAll();
    }

    @Override
    public DatosPersonal save(DatosPersonal d) {
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return datosPersonalRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        datosPersonalRepository.deleteById(id);
    }

    @Override
    public DatosPersonal findByUserWeb(String id) {
        return datosPersonalRepository.findByIdUsuarioWeb(id);
    }
}

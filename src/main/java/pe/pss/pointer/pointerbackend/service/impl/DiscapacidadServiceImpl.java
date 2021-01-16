package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.Discapacidad;
import pe.pss.pointer.pointerbackend.model.dto.DiscapacidadDTO;
import pe.pss.pointer.pointerbackend.repository.AreaInteresRepository;
import pe.pss.pointer.pointerbackend.repository.DatosPersonalRepository;
import pe.pss.pointer.pointerbackend.repository.DiscapacidadRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.DiscapacidadJdbcRepository;
import pe.pss.pointer.pointerbackend.service.AreaInteresService;
import pe.pss.pointer.pointerbackend.service.DiscapacidadService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("discapacidadService")
public class DiscapacidadServiceImpl implements DiscapacidadService {
    @Autowired
    DiscapacidadRepository discapacidadRepository;

    @Autowired
    DatosPersonalRepository datosPersonalRepository;

    @Autowired
    DiscapacidadJdbcRepository discapacidadJdbcRepository;

    @Override
    public Discapacidad save(Discapacidad a) {
       String pk = datosPersonalRepository.generatePrimaryKeyPostulante(Constantes.TABLE_DISCAPACIDAD,Constantes.ID_TABLE_DISCAPACIDAD,Constantes.CODIGO_EMPRESA);
       a.setIdDiscapacidadPostulante(pk);
       a.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return discapacidadRepository.save(a);
    }

    @Override
    public List<Discapacidad> findByIdPostulante(String id) {
        return discapacidadRepository.findByIdPostulante(id);
    }

    @Override
    public void delete(String id) {
        discapacidadRepository.deleteById(id);
    }

    @Override
    public List<Discapacidad> findAll() {
        return (List<Discapacidad>) discapacidadRepository.findAll();
    }

    @Override
    public List<DiscapacidadDTO> getDiscapacidadesDetailsByPostulante(String id) {
        return discapacidadJdbcRepository.getDiscapacidadesByPostulante(id);
    }
}

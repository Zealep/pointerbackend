package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;
import pe.pss.pointer.pointerbackend.repository.ExperienciaLaboralRepository;
import pe.pss.pointer.pointerbackend.service.ExperienciaLaboralService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("experienciaLaboralService")
public class ExperienciaLaboralServiceImpl implements ExperienciaLaboralService {

    @Autowired
    ExperienciaLaboralRepository experienciaLaboralRepository;

    @Override
    public ExperienciaLaboral findById(String id) {
        return experienciaLaboralRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExperienciaLaboral> findByPostulante(String id) {
        return experienciaLaboralRepository.findByIdPostulante(id);
    }

    @Override
    public List<ExperienciaLaboral> findAll() {
        return (List<ExperienciaLaboral>) experienciaLaboralRepository.findAll();
    }

    @Override
    public ExperienciaLaboral save(ExperienciaLaboral d) {
        String pk = experienciaLaboralRepository.generatePrimaryKeyExperiencia(Constantes.TABLE_EXPERIENCIA_LABORAL,Constantes.ID_TABLE_EXPERIENCIA_LABORAL,Constantes.CODIGO_EMPRESA);
        d.setIdExperienciaLaboral(pk);
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return experienciaLaboralRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        experienciaLaboralRepository.deleteById(id);
    }
}

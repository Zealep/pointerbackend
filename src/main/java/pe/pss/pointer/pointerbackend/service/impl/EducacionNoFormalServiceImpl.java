package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.EducacionNoFormal;
import pe.pss.pointer.pointerbackend.repository.EducacionNoFormalRepository;
import pe.pss.pointer.pointerbackend.service.EducacionNoFormalService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("educacionNoFormalService")
public class EducacionNoFormalServiceImpl implements EducacionNoFormalService {

    @Autowired
    EducacionNoFormalRepository educacionNoFormalRepository;

    @Override
    public EducacionNoFormal findById(String id) {
        return educacionNoFormalRepository.findById(id).orElse(null);
    }

    @Override
    public List<EducacionNoFormal> findByPostulante(String id) {
        return educacionNoFormalRepository.findByIdPostulante(id);
    }

    @Override
    public List<EducacionNoFormal> findAll() {
        return (List<EducacionNoFormal>) educacionNoFormalRepository.findAll();
    }

    @Override
    public EducacionNoFormal save(EducacionNoFormal d) {
        if(d.getIdEstudioNoFormal()==null) {
            String pk = educacionNoFormalRepository.generatePrimaryKeyNoFormal(Constantes.TABLE_ESTUDIO_NO_FORMAL, Constantes.ID_TABLE_ESTUDIO_NO_FORMAL, Constantes.CODIGO_EMPRESA);
            d.setIdEstudioNoFormal(pk);
        }
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return educacionNoFormalRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        educacionNoFormalRepository.deleteById(id);
    }
}

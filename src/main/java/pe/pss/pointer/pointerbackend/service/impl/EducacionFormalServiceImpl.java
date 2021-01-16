package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.repository.EducacionFormalRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.EstudioFormalJdbcRepository;
import pe.pss.pointer.pointerbackend.service.EducacionFormalService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("educacionFormalService")
public class EducacionFormalServiceImpl implements EducacionFormalService {

    @Autowired
    EducacionFormalRepository educacionFormaRepository;

    @Autowired
    EstudioFormalJdbcRepository estudioFormalJdbcRepository;

    @Override
    public EducacionFormal findById(String id) {
        return educacionFormaRepository.findById(id).orElse(null);
    }

    @Override
    public List<EducacionFormal> findByPostulante(String id) {
        return educacionFormaRepository.findByIdPostulante(id);
    }

    @Override
    public List<EducacionFormal> findAll() {
        return (List<EducacionFormal>) educacionFormaRepository.findAll();
    }

    @Override
    public EducacionFormal save(EducacionFormal d) {
        if(d.getIdEstudioFormal()==null) {
            String pk = educacionFormaRepository.generatePrimaryKeyFormal(Constantes.TABLE_ESTUDIO_FORMAL, Constantes.ID_TABLE_ESTUDIO_FORMAL, Constantes.CODIGO_EMPRESA);
            d.setIdEstudioFormal(pk);
        }
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return educacionFormaRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        educacionFormaRepository.deleteById(id);
    }

    @Override
    public List<EstudioFormalDTO> getFormalesDetailsByPostulante(String id) {
        return estudioFormalJdbcRepository.getFormalesByPostulante(id);
    }
}

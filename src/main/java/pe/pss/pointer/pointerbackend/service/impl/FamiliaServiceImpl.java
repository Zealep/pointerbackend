package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.Familia;
import pe.pss.pointer.pointerbackend.model.Idioma;
import pe.pss.pointer.pointerbackend.model.dto.FamiliaDTO;
import pe.pss.pointer.pointerbackend.repository.FamiliaRepository;
import pe.pss.pointer.pointerbackend.repository.IdiomaRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.FamiliaJdbcRepository;
import pe.pss.pointer.pointerbackend.service.FamiliaService;
import pe.pss.pointer.pointerbackend.service.IdiomaService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("familiaService")
public class FamiliaServiceImpl implements FamiliaService {

    @Autowired
    FamiliaRepository familiaRepository;

    @Autowired
    FamiliaJdbcRepository familiaJdbcRepository;

    @Override
    public Familia findById(String id) {
        return familiaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Familia> findByPostulante(String id) {
        return familiaRepository.findByIdPostulante(id);
    }

    @Override
    public List<Familia> findAll() {
        return (List<Familia>) familiaRepository.findAll();
    }

    @Override
    public Familia save(Familia d) {
        if(d.getIdFamilia()==null) {
            String pk = familiaRepository.generatePrimaryKeyFamilia(Constantes.TABLE_DATO_FAMILIA, Constantes.ID_TABLE_DATO_FAMILIA, Constantes.CODIGO_EMPRESA);
            d.setIdFamilia(pk);
        }
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return familiaRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        familiaRepository.deleteById(id);
    }

    @Override
    public List<FamiliaDTO> getFamiliasDetailsByPostulante(String id) {
        return familiaJdbcRepository.getFamiliasByPostulante(id);
    }
}

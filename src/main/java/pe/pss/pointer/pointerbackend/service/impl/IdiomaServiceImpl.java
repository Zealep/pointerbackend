package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.Idioma;
import pe.pss.pointer.pointerbackend.repository.EducacionFormalRepository;
import pe.pss.pointer.pointerbackend.repository.IdiomaRepository;
import pe.pss.pointer.pointerbackend.service.EducacionFormalService;
import pe.pss.pointer.pointerbackend.service.IdiomaService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("idiomaService")
public class IdiomaServiceImpl implements IdiomaService {

    @Autowired
    IdiomaRepository idiomaRepository;

    @Override
    public Idioma findById(String id) {
        return idiomaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Idioma> findByPostulante(String id) {
        return idiomaRepository.findByIdPostulante(id);
    }

    @Override
    public List<Idioma> findAll() {
        return (List<Idioma>) idiomaRepository.findAll();
    }

    @Override
    public Idioma save(Idioma d) {
        if(d.getIdIdioma()==null) {
            String pk = idiomaRepository.generatePrimaryKeyIdioma(Constantes.TABLE_DATO_IDIOMA, Constantes.ID_TABLE_DATO_IDIOMA, Constantes.CODIGO_EMPRESA);
            d.setIdIdioma(pk);
        }
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);
        return idiomaRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        idiomaRepository.deleteById(id);
    }
}

package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.ProcesoDocumento;
import pe.pss.pointer.pointerbackend.repository.ProcesoDocumentoRepository;
import pe.pss.pointer.pointerbackend.service.ProcesoDocumentoService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;
import java.util.stream.Collectors;

@Service("procesoDocumentoService")
public class ProcesoDocumentoServiceImpl implements ProcesoDocumentoService {

    @Autowired
    ProcesoDocumentoRepository procesoDocumentoRepository;


    @Override
    public List<ProcesoDocumento> getAllByIdProceso(String id) {
        List<ProcesoDocumento> procesoDocumentos = procesoDocumentoRepository.findByIdProceso(id);
        return procesoDocumentos.stream().filter(x-> x.getEstado().equals(Constantes.ESTADO_ACTIVO)).collect(Collectors.toList());
    }
}

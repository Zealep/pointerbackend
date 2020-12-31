package pe.pss.pointer.pointerbackend.service;

import pe.pss.pointer.pointerbackend.model.ProcesoDocumento;

import java.util.List;

public interface ProcesoDocumentoService {

   List<ProcesoDocumento> getAllByIdProceso(String id);
}

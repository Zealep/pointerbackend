package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.ProcesoDocumento;

import java.util.List;

@Repository
public interface ProcesoDocumentoRepository extends CrudRepository<ProcesoDocumento,String> {

    List<ProcesoDocumento> findByIdProceso(String id);
}

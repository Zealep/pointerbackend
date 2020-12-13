package pe.pss.pointer.pointerbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.pss.pointer.pointerbackend.model.TipoDocumentosIdentidad;

@Repository
public interface TipoDocumentosIdentidadRespository extends JpaRepository<TipoDocumentosIdentidad, String>{
		

}

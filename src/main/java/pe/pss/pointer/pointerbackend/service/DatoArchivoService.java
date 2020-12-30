package pe.pss.pointer.pointerbackend.service;

import org.springframework.web.multipart.MultipartFile;
import pe.pss.pointer.pointerbackend.model.DatoArchivo;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;

import java.util.List;

public interface DatoArchivoService {

    DatoArchivo findById(String id);
    List<DatoArchivo> findByIdCodigoRelacional(String id);
    List<DatoArchivo> findAll();
    DatoArchivo save(DatoArchivo d, MultipartFile file);
    void deleteById(String id);
}

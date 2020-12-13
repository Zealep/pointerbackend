package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.pss.pointer.pointerbackend.model.TipoDocumentosIdentidad;
import pe.pss.pointer.pointerbackend.repository.TipoDocumentosIdentidadRespository;

import java.util.List;

@RestController
@RequestMapping("/tipoDocumento")
public class TipoDocumentoController {

    @Autowired
    TipoDocumentosIdentidadRespository tipoDocumentosIdentidadRespository;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<TipoDocumentosIdentidad>> getAll(){
        return new ResponseEntity<List<TipoDocumentosIdentidad>>(tipoDocumentosIdentidadRespository.findAll(), HttpStatus.OK);
    }
}

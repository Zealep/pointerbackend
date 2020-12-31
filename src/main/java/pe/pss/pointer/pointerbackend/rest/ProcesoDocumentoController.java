package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.pss.pointer.pointerbackend.model.ProcesoDocumento;
import pe.pss.pointer.pointerbackend.service.ProcesoDocumentoService;

import java.util.List;

@RestController
@RequestMapping("/procesodocumento")
public class ProcesoDocumentoController {

    @Autowired
    ProcesoDocumentoService procesoDocumentoService;

    @GetMapping(value = "/findByProceso/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProcesoDocumento>> getProcesosByProceso(@PathVariable(value = "id")String id){
        try {
            return new ResponseEntity<List<ProcesoDocumento>>(procesoDocumentoService.getAllByIdProceso(id),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package pe.pss.pointer.pointerbackend.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pe.pss.pointer.pointerbackend.model.DatoArchivo;
import pe.pss.pointer.pointerbackend.service.DatoArchivoService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

@RestController
@RequestMapping("/archivo")
public class DatoArchivoController {

    @Autowired
    DatoArchivoService datoArchivoService;

    @PostMapping(value = "/save", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> registrar(@RequestParam(value="file") MultipartFile file, @RequestParam(value="archivo") String archivo) {
        try {
            ObjectMapper obj = new ObjectMapper();
            DatoArchivo img = obj.readValue(archivo,DatoArchivo.class);
            DatoArchivo i = datoArchivoService.save(img,file);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", i.getIdDatoArchivo(),""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}

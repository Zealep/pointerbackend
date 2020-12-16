package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.service.DatosPersonalService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;

@RestController
@RequestMapping("/datos-personal")
public class DatosPersonalController {

    @Autowired
    DatosPersonalService datosPersonalService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DatosPersonal>> listar() {
        try {
            return new ResponseEntity<List<DatosPersonal>>(datosPersonalService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping(value = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DatosPersonal> buscarPorId(@PathVariable String id) {
        try {
            return new ResponseEntity<DatosPersonal>(datosPersonalService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/findByUserWeb/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DatosPersonal> buscarPorIdUserWeb(@PathVariable String id) {
        try {
            return new ResponseEntity<DatosPersonal>(datosPersonalService.findByUserWeb(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> registrar(@RequestBody DatosPersonal datosPersonal) {
        try {
            DatosPersonal d = datosPersonalService.save(datosPersonal);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", Long.parseLong(d.getIdPostulante()), ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {

            datosPersonalService.deleteById(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

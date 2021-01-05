package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.Familia;
import pe.pss.pointer.pointerbackend.model.Idioma;
import pe.pss.pointer.pointerbackend.service.FamiliaService;
import pe.pss.pointer.pointerbackend.service.IdiomaService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;


@RestController
@RequestMapping("/familiares")
public class FamiliaController {

    @Autowired
    FamiliaService familiaService;


    @GetMapping(value = "/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Familia> findById(@PathVariable String id){
        try{
            return new ResponseEntity<Familia>(familiaService.findById(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/findByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Familia>> listPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<Familia>>((List<Familia>) familiaService.findByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Familia>> list(){
        try{
            return new ResponseEntity<List<Familia>>((List<Familia>) familiaService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> save(@RequestBody Familia familia){
        try {
            Familia e = familiaService.save(familia);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", e.getIdFamilia(), ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {
            familiaService.deleteById(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

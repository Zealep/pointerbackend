package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.Idioma;
import pe.pss.pointer.pointerbackend.model.dto.IdiomaDTO;
import pe.pss.pointer.pointerbackend.service.EducacionFormalService;
import pe.pss.pointer.pointerbackend.service.IdiomaService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;


@RestController
@RequestMapping("/idiomas")
public class IdiomaController {

    @Autowired
    IdiomaService idiomaService;


    @GetMapping(value = "/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Idioma> findById(@PathVariable String id){
        try{
            return new ResponseEntity<Idioma>(idiomaService.findById(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/findByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Idioma>> listPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<Idioma>>((List<Idioma>) idiomaService.findByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getDetailsByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<IdiomaDTO>> listIdiomasDetallesPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<IdiomaDTO>>((List<IdiomaDTO>) idiomaService.getIdiomasDetailsByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Idioma>> list(){
        try{
            return new ResponseEntity<List<Idioma>>((List<Idioma>) idiomaService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> save(@RequestBody Idioma idioma){
        try {
            Idioma e = idiomaService.save(idioma);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", e.getIdIdioma(), ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {
            idiomaService.deleteById(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

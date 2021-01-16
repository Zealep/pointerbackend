package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.EducacionFormal;
import pe.pss.pointer.pointerbackend.model.EducacionNoFormal;
import pe.pss.pointer.pointerbackend.model.dto.EstudioFormalDTO;
import pe.pss.pointer.pointerbackend.model.dto.EstudioNoFormalDTO;
import pe.pss.pointer.pointerbackend.service.EducacionFormalService;
import pe.pss.pointer.pointerbackend.service.EducacionNoFormalService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;


@RestController
@RequestMapping("/edu-noformal")
public class EstudioNoFormalController {

    @Autowired
    EducacionNoFormalService educacionNoFormalService;


    @GetMapping(value = "/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EducacionNoFormal> findById(@PathVariable String id){
        try{
            return new ResponseEntity<EducacionNoFormal>(educacionNoFormalService.findById(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/findByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EducacionNoFormal>> listPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<EducacionNoFormal>>((List<EducacionNoFormal>) educacionNoFormalService.findByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EducacionNoFormal>> list(){
        try{
            return new ResponseEntity<List<EducacionNoFormal>>((List<EducacionNoFormal>) educacionNoFormalService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getDetailsByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EstudioNoFormalDTO>> listDetallesPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<EstudioNoFormalDTO>>((List<EstudioNoFormalDTO>) educacionNoFormalService.getNoFormalesDetailsByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> save(@RequestBody EducacionNoFormal educacionNoFormal){
        try {
            EducacionNoFormal e = educacionNoFormalService.save(educacionNoFormal);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", e.getIdEstudioNoFormal(), ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {
            educacionNoFormalService.deleteById(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

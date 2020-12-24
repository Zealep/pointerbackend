package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.ExperienciaLaboral;
import pe.pss.pointer.pointerbackend.service.AreaInteresService;
import pe.pss.pointer.pointerbackend.service.ExperienciaLaboralService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;


@RestController
@RequestMapping("/expLaboral")
public class ExperienciaLaboralController {

    @Autowired
    ExperienciaLaboralService experienciaLaboralService;

    @GetMapping(value = "/findByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ExperienciaLaboral>> listPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<ExperienciaLaboral>>((List<ExperienciaLaboral>) experienciaLaboralService.findByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ExperienciaLaboral>> list(){
        try{
            return new ResponseEntity<List<ExperienciaLaboral>>((List<ExperienciaLaboral>) experienciaLaboralService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> save(@RequestBody ExperienciaLaboral experienciaLaboral){
        try {
            experienciaLaboralService.save(experienciaLaboral);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", null, ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {
            experienciaLaboralService.deleteById(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.Discapacidad;
import pe.pss.pointer.pointerbackend.model.dto.AreaInteresDTO;
import pe.pss.pointer.pointerbackend.model.dto.DiscapacidadDTO;
import pe.pss.pointer.pointerbackend.repository.AreaInteresRepository;
import pe.pss.pointer.pointerbackend.repository.DiscapacidadRepository;
import pe.pss.pointer.pointerbackend.service.DiscapacidadService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;


@RestController
@RequestMapping("/discapacidad")
public class DiscapacidadController {

    @Autowired
    DiscapacidadService discapacidadService;

    @GetMapping(value = "/findByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Discapacidad>> listDiscapacidadesPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<Discapacidad>>((List<Discapacidad>) discapacidadService.findByIdPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getDetailsByPostulante/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DiscapacidadDTO>> listDetallesPorPostulante(@PathVariable String id){
        try{
            return new ResponseEntity<List<DiscapacidadDTO>>((List<DiscapacidadDTO>) discapacidadService.getDiscapacidadesDetailsByPostulante(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Discapacidad>> listDiscapacidades(){
        try{
            return new ResponseEntity<List<Discapacidad>>((List<Discapacidad>) discapacidadService.findAll(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> grabarAreas(@RequestBody Discapacidad discapacidad){
        try {
            discapacidadService.save(discapacidad);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", null, ""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> eliminar(@PathVariable String id) {
        try {
            discapacidadService.delete(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null, ""), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

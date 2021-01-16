package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.pss.pointer.pointerbackend.model.AreaInteres;
import pe.pss.pointer.pointerbackend.model.Datos;
import pe.pss.pointer.pointerbackend.model.dto.CarreraEducativaDTO;
import pe.pss.pointer.pointerbackend.model.dto.InstitucionDTO;
import pe.pss.pointer.pointerbackend.repository.DatosRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.DatosJdbcRepsitory;

import java.util.List;

@RestController
@RequestMapping("/datos")
public class DatosController {

    @Autowired
    DatosRepository datosRepository;

    @Autowired
    DatosJdbcRepsitory datosJdbcRepository;

    @GetMapping(value = "/gradoInstruccion",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Datos>> getGradoInstruccion(){
        try{
            return new ResponseEntity<List<Datos>>((List<Datos>) datosRepository.getGradosInstruccion(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/institucion",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InstitucionDTO>> getInstituciones(){
        try{
            return new ResponseEntity<List<InstitucionDTO>>((List<InstitucionDTO>) datosJdbcRepository.getInstituciones(), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/carreras/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CarreraEducativaDTO>> getInstituciones(@PathVariable(value = "id")String id){
        try{
            return new ResponseEntity<List<CarreraEducativaDTO>>((List<CarreraEducativaDTO>) datosJdbcRepository.getCarreras(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

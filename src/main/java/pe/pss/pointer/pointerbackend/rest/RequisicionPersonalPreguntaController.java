package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.PostulanteRespuesta;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonal;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;
import pe.pss.pointer.pointerbackend.repository.PostulanteRespuestaRepository;
import pe.pss.pointer.pointerbackend.service.PostulanteRespuestaService;
import pe.pss.pointer.pointerbackend.service.RequisicionPersonalPreguntaService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;

@RestController
@RequestMapping("/requisicion-pregunta")
public class RequisicionPersonalPreguntaController {

    @Autowired
    private RequisicionPersonalPreguntaService requisicionPersonalPreguntaService;

    @Autowired
    private PostulanteRespuestaService postulanteRespuestaService;

    @GetMapping(value = "/idRequisicion/{id}")
    public ResponseEntity<List<RequisicionPersonalPregunta>> getById(@PathVariable(value = "id") String id){
        try{
            return new ResponseEntity<List<RequisicionPersonalPregunta>>(requisicionPersonalPreguntaService.getAllByIdRequisicion(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/saveRespuestas")
    public ResponseEntity<ResponseApi> saveRespuestas(@RequestBody List<PostulanteRespuesta> respuestas){
        try{
            postulanteRespuestaService.saveRespuestas(respuestas);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null,null), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

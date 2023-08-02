package pe.pss.pointer.pointerbackend.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonal;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPostulante;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionDTO;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionInDTO;
import pe.pss.pointer.pointerbackend.service.RequisicionPersonalService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;

@RestController
@RequestMapping("/requisicion")
public class RequisicionPersonalController {

    @Autowired
    RequisicionPersonalService requisicionPersonalService;

    @PostMapping(value = "/bandeja",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BandejaRequisicionDTO>> bandeja(@RequestBody BandejaRequisicionInDTO bandejaRequisicionInDTO){
        try{
            return new ResponseEntity<List<BandejaRequisicionDTO>>(requisicionPersonalService.listBandejaRequisicion(bandejaRequisicionInDTO), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/find/{id}")
    public ResponseEntity<RequisicionPersonal> getById(@PathVariable(value = "id") String id){
        try{
            return new ResponseEntity<RequisicionPersonal>(requisicionPersonalService.getById(id), HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/save/postulante",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RequisicionPersonalPostulante> bandeja(@RequestBody RequisicionPersonalPostulante requisicionPersonalPostulante){
        try{
            return new ResponseEntity<RequisicionPersonalPostulante>(requisicionPersonalService.saveRequisicionPostulante(requisicionPersonalPostulante), HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}

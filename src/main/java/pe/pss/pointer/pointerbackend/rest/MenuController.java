package pe.pss.pointer.pointerbackend.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.model.Menu;
import pe.pss.pointer.pointerbackend.model.TipoDocumentosIdentidad;
import pe.pss.pointer.pointerbackend.model.dto.Combo;
import pe.pss.pointer.pointerbackend.model.dto.RequestCombo;
import pe.pss.pointer.pointerbackend.repository.MenuRepository;
import pe.pss.pointer.pointerbackend.repository.TipoDocumentosIdentidadRespository;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<Menu>> getAll(){
        return new ResponseEntity<List<Menu>>(menuRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/select", produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<List<Combo>> getAllSelecteds(@RequestBody RequestCombo requestCombo){
        return new ResponseEntity<List<Combo>>(menuRepository.getComboSelect(requestCombo.getIdEmpresa(),requestCombo.getTable(),requestCombo.getDato()), HttpStatus.OK);
    }


}

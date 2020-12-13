package pe.pss.pointer.pointerbackend.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.business_services.EmailService;
import pe.pss.pointer.pointerbackend.exceptions.ConflictException;
import pe.pss.pointer.pointerbackend.model.Usuario;
import pe.pss.pointer.pointerbackend.service.UsuarioService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    Logger log = LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    EmailService emailService;

    @GetMapping(value = "/find/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Usuario> findById(@PathVariable String id){
        return new ResponseEntity<Usuario>(usuarioService.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Usuario>> findAll(){
        return new ResponseEntity<List<Usuario>>(usuarioService.findAll(),HttpStatus.OK);
    }

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> save(@RequestBody Usuario usuario){
            if(usuarioService.existUser(usuario.getCorreo())) {
                throw new ConflictException("El correo del usuario ya existe");
            }
            Usuario u = usuarioService.save(usuario);
        return new ResponseEntity<ResponseApi>(new ResponseApi("OK",Long.parseLong(u.getIdUsuarioWeb()),null),HttpStatus.CREATED);
    }

    @PostMapping(value = "/update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> update(@RequestBody Usuario usuario){
        Usuario u = usuarioService.save(usuario);
        return new ResponseEntity<ResponseApi>(new ResponseApi("OK",Long.parseLong(u.getIdUsuarioWeb()),null),HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<ResponseApi> delete(@PathVariable String id){
            usuarioService.delete(id);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null,null),HttpStatus.OK);
    }

    @PostMapping(value = "/sendEmail",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> enviarCorreo(@RequestParam(value = "correo") String correo){
        if(!usuarioService.existUser(correo)) {
            throw new ConflictException("El correo no se encuentra registrado");
        }

        String clave = usuarioService.restorePass(correo);
        String subject = "RECUPERACION CLAVE ";
        String text = "SU CLAVE ES "+ clave ;
        emailService.sendMailRestorePass(correo, subject, text);

        return new ResponseEntity<ResponseApi>(new ResponseApi("OK",null,null),HttpStatus.CREATED);
    }
}

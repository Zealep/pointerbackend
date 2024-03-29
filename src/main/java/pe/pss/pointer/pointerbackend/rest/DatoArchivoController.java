package pe.pss.pointer.pointerbackend.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.pss.pointer.pointerbackend.model.DatoArchivo;
import pe.pss.pointer.pointerbackend.service.DatoArchivoService;
import pe.pss.pointer.pointerbackend.util.ResponseApi;

import java.util.List;

@RestController
@RequestMapping("/archivo")
public class DatoArchivoController {

    @Autowired
    DatoArchivoService datoArchivoService;

    @PostMapping(value = "/save", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi> registrar(@RequestParam(value="file") MultipartFile file, @RequestParam(value="archivo") String archivo) {
        try {
            ObjectMapper obj = new ObjectMapper();
            DatoArchivo img = obj.readValue(archivo,DatoArchivo.class);
            DatoArchivo i = datoArchivoService.save(img,file);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK", i.getIdDatoArchivo(),""), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping(value = "/getByCodigoRelacional/{id}/{proceso}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DatoArchivo>> getArchivosByCodigoRelacional(@PathVariable(value = "id")String codigoRelacional,@PathVariable(value = "proceso")String idProceso){
        try {
            return new ResponseEntity<List<DatoArchivo>>(datoArchivoService.findByIdCodigoRelacional(codigoRelacional,idProceso),HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getFile",produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> getFile(@RequestParam(value = "url")String url){
        try {
            return new ResponseEntity<byte[]>(datoArchivoService.getFile(url),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getFile/proceso",produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public ResponseEntity<byte[]> getFile(@RequestParam(value = "url")String url,@RequestParam(value = "proceso")String proceso){
        try {
            return new ResponseEntity<byte[]>(datoArchivoService.getFileModulos(url,proceso),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping(value = "/deleteFile")
    public ResponseEntity<ResponseApi> deleteFile(@RequestParam(value = "url")String url,@RequestParam(value = "id")String id){
        try {
            datoArchivoService.deleteById(id);
            datoArchivoService.deleteFile(url);
            return new ResponseEntity<ResponseApi>(new ResponseApi("OK","",""),HttpStatus.NO_CONTENT);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

package pe.pss.pointer.pointerbackend.service.impl;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pe.pss.pointer.pointerbackend.model.DatoArchivo;
import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.repository.DatoArchivoRepository;
import pe.pss.pointer.pointerbackend.repository.DatosPersonalRepository;
import pe.pss.pointer.pointerbackend.service.DatoArchivoService;
import pe.pss.pointer.pointerbackend.service.DatosPersonalService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service("datoArchivoService")
public class DatoArchivoServiceImpl implements DatoArchivoService {

    @Value("${url-path-base-attachment}")
    private String URL_PATH_BASE_ATTACHMENT;

    @Autowired
    DatoArchivoRepository datoArchivoRepository;

    @Autowired
    DatosPersonalService datosPersonalService;


    @Override
    public DatoArchivo findById(String id) {
        return datoArchivoRepository.findById(id).orElse(null);
    }

    @Override
    public List<DatoArchivo> findByIdCodigoRelacional(String id,String proceso) {
        return datoArchivoRepository.findByIdCodigoRelacionalAndIdProceso(id,proceso);
    }

    @Override
    public List<DatoArchivo> findAll() {
        return (List<DatoArchivo>) datoArchivoRepository.findAll();
    }

    @Override
    public DatoArchivo save(DatoArchivo d, MultipartFile file) {

        if(d.getIdDatoArchivoPersona()==null) {
            String pk = datoArchivoRepository.generatePrimaryKeyDatoArchivo(Constantes.TABLE_DATO_ARCHIVO, Constantes.ID_TABLE_DATO_ARCHIVO, Constantes.CODIGO_EMPRESA);
            d.setIdDatoArchivoPersona(pk);
        }
        d.setIdEmpresa(Constantes.CODIGO_EMPRESA);


        try {
            String url = "/"+d.getNumeroDocumento() +"/"+ d.getIdProceso() + "/"+d.getIdCodigoRelacional();
            Path path = Paths.get(URL_PATH_BASE_ATTACHMENT+url);
            boolean dirExist = Files.exists(path);
            if (!dirExist) {
                Files.createDirectories(path);
            }

            Path nameImage = Paths.get(file.getOriginalFilename());
            Path targetLocation = path.resolve(nameImage);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            d.setNombreArchivo(file.getOriginalFilename());
            d.setPathArchivo(url+"/"+file.getOriginalFilename());
            d.setTipoArchivo(FilenameUtils.getExtension(file.getOriginalFilename()));
            d.setPesoArchivo(String.valueOf(file.getSize()));
            datoArchivoRepository.save(d);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return datoArchivoRepository.save(d);
    }

    @Override
    public void deleteById(String id) {
        datoArchivoRepository.deleteById(id);
    }

    @Override
    public void deleteFile(String path) {
        String url = URL_PATH_BASE_ATTACHMENT+path;
        Path p = Paths.get(url);
        try{
            Files.delete(p);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public byte[] getFile(String url) {
        try {
            String path = URL_PATH_BASE_ATTACHMENT + url;
            return FileUtils.readFileToByteArray(new File(FilenameUtils.separatorsToSystem(path)));
        }catch (IOException i){
            return null;
        }

    }

    private String getNameProcess(String code){
        String nameProcess="";
        switch (code){
            case Constantes.PROCESO_DATOS_BASICOS :nameProcess="datos-personales";break;
            case Constantes.PROCESO_ESTUDIOS_FORMALES:nameProcess="estudios-formales";break;
            case Constantes.PROCESO_ESTUDIOS_NO_FORMALES:nameProcess="estudios-noformales";break;
            case Constantes.PROCESO_EXPERIENCIA_LABORAL:nameProcess="experiencia-laboral";break;
            case Constantes.PROCESO_DATOS_FAMILIARES:nameProcess="datos-familiares";break;
            case Constantes.PROCESO_IDIOMAS:nameProcess="idiomas";break;
            default:nameProcess="";
        }
        return nameProcess;
    }

}

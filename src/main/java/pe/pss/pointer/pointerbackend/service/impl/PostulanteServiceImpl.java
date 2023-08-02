package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.pss.pointer.pointerbackend.model.PostulanteRespuesta;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPregunta;
import pe.pss.pointer.pointerbackend.repository.PostulanteRespuestaRepository;
import pe.pss.pointer.pointerbackend.service.PostulanteRespuestaService;

import java.util.List;

@Service("postulanteService")
public class PostulanteServiceImpl implements PostulanteRespuestaService {

    @Autowired
    private PostulanteRespuestaRepository postulanteRespuestaRepository;

    @Transactional
    @Override
    public void saveRespuestas(List<PostulanteRespuesta> list) {
        list.forEach(x->{
            this.postulanteRespuestaRepository.save(x);
        });
    }


}

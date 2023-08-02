package pe.pss.pointer.pointerbackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonal;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPostulante;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionDTO;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionInDTO;
import pe.pss.pointer.pointerbackend.repository.RequisicionPersonalPostulanteRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.BandejaRequisicionRepository;
import pe.pss.pointer.pointerbackend.repository.jdbc.RequisicionPersonalRepository;
import pe.pss.pointer.pointerbackend.service.RequisicionPersonalService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("requisicionPersonalService")
public class RequisicionPersonalServiceImpl implements RequisicionPersonalService {

    @Value("${host-pointer-erp}")
    private String HOST_POINTER_ERP;

    @Autowired
    private BandejaRequisicionRepository bandejaRequisicionRepository;

    @Autowired
    private RequisicionPersonalRepository requisicionPersonalRepository;

    @Autowired
    private RequisicionPersonalPostulanteRepository requisicionPersonalPostulanteRepository;

    //RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<BandejaRequisicionDTO> listBandejaRequisicion(BandejaRequisicionInDTO in) {
        return bandejaRequisicionRepository.listRequisicion(in);
    }

    @Override
    public RequisicionPersonal getById(String id) {
        RequisicionPersonal r = requisicionPersonalRepository.findById(id).orElse(null);
        r.setDetalleBeneficiosHtml(r.getDetalleBeneficios()!=null?new String(r.getDetalleBeneficios()):null);
        r.setDetalleFuncionesHtml(r.getDetalleFunciones()!=null?new String(r.getDetalleFunciones()):null);
        r.setDetalleRequisitosHtml(r.getDetalleRequisitos()!=null?new String(r.getDetalleRequisitos()):null);
        return r;
    }

    @Override
    public RequisicionPersonalPostulante saveRequisicionPostulante(RequisicionPersonalPostulante requisicionPersonalPostulante) {
        requisicionPersonalPostulante.setEstado(Constantes.ESTADO_ACTIVO);
        return requisicionPersonalPostulanteRepository.save(requisicionPersonalPostulante);
    }
}

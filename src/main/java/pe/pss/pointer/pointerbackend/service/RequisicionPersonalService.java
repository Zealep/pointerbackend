package pe.pss.pointer.pointerbackend.service;


import pe.pss.pointer.pointerbackend.model.RequisicionPersonal;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonalPostulante;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionDTO;
import pe.pss.pointer.pointerbackend.model.dto.BandejaRequisicionInDTO;

import java.util.List;

public interface RequisicionPersonalService {

    List<BandejaRequisicionDTO> listBandejaRequisicion(BandejaRequisicionInDTO in);
    RequisicionPersonal getById(String id);

    RequisicionPersonalPostulante saveRequisicionPostulante(RequisicionPersonalPostulante requisicionPersonalPostulante);

}

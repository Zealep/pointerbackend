package pe.pss.pointer.pointerbackend.repository.jdbc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.RequisicionPersonal;

import java.util.Optional;

@Repository
public interface RequisicionPersonalRepository extends CrudRepository<RequisicionPersonal,String> {


}

package pe.pss.pointer.pointerbackend.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.Menu;


@Repository
public interface MenuRepository extends JpaRepository<Menu,String>{
	
}

package pe.pss.pointer.pointerbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerbackend.model.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {

    @Query("select u from Usuario u where u.correo=?1")
    Optional<Usuario> findByUsername(String username);
    
    @Procedure(value = "spu_GeneraCorrelativoAnoMes")
    String generatePrimaryKeyUsuario(String tabla,String campo,String empresa);
    
    @Query("select u.contraseña from Usuario u where u.correo=?1")
    String findPassByEmail(String email);
    
    Usuario findByCorreo(String correo);
}

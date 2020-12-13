package pe.pss.pointer.pointerbackend.service;


import pe.pss.pointer.pointerbackend.model.Usuario;

import java.util.List;

public interface UsuarioService {

	 Usuario findById(String id);
	 List<Usuario> findAll();
	 Usuario findByCorreo(String correo);
	 Usuario save(Usuario usuario);
	 void delete(String id);
	 String restorePass(String email);
	 boolean existUser(String correo);
	
}

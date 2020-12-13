package pe.pss.pointer.pointerbackend.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pss.pointer.pointerbackend.model.Usuario;
import pe.pss.pointer.pointerbackend.repository.UsuarioRepository;
import pe.pss.pointer.pointerbackend.service.UsuarioService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario usuario) {
		String pk = usuarioRepository.generatePrimaryKeyUsuario(Constantes.TABLE_POSTULANTE, Constantes.ID_TABLE_POSTULANTE, Constantes.CODIGO_EMPRESA);
		usuario.setIdUsuarioWeb(pk);
		usuario.setEstado(Constantes.ESTADO_ACTIVO);
		usuario.setIdEmpresa(Constantes.CODIGO_EMPRESA);
		return usuarioRepository.save(usuario);
	}
	@Override
	public void delete(String id) {

	}

	@Override
	public String restorePass(String email) {
		return usuarioRepository.findPassByEmail(email);
	}

	@Override
	public Usuario findById(String id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario findByCorreo(String correo) {	
		return usuarioRepository.findByCorreo(correo);
	}

	@Override
	public boolean existUser(String correo) {
		return findByCorreo(correo)!=null?true:false;
	}

	
	

}

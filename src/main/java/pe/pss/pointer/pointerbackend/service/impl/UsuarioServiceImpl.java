package pe.pss.pointer.pointerbackend.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pss.pointer.pointerbackend.model.DatosPersonal;
import pe.pss.pointer.pointerbackend.model.Usuario;
import pe.pss.pointer.pointerbackend.repository.DatosPersonalRepository;
import pe.pss.pointer.pointerbackend.repository.UsuarioRepository;
import pe.pss.pointer.pointerbackend.service.UsuarioService;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.List;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	DatosPersonalRepository datosPersonalRepository;

	@Override
	public Usuario save(Usuario usuario) {
		String pk = usuarioRepository.generatePrimaryKeyUsuario(Constantes.TABLE_POSTULANTE, Constantes.ID_TABLE_POSTULANTE, Constantes.CODIGO_EMPRESA);
		usuario.setIdUsuarioWeb(pk);
		usuario.setEstado(Constantes.ESTADO_ACTIVO);
		usuario.setIdEmpresa(Constantes.CODIGO_EMPRESA);

		DatosPersonal d = MapperUsuarioToDatosPersonales(usuario);
		datosPersonalRepository.save(d);

		return usuarioRepository.save(usuario);
	}
	@Override
	public void delete(String id) {
		usuarioRepository.deleteById(id);
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

	private DatosPersonal MapperUsuarioToDatosPersonales(Usuario usuario){
		DatosPersonal d = new DatosPersonal();
		String pk = datosPersonalRepository.generatePrimaryKeyPostulante(Constantes.TABLE_DATOS_PERSONAL, Constantes.ID_TABLE_DATOS_PERSONAL, Constantes.CODIGO_EMPRESA);
		d.setIdPostulante(pk);
		d.setIdEmpresa(usuario.getIdEmpresa());
		d.setIdUsuarioWeb(usuario.getIdUsuarioWeb());
		d.setApellidoPaterno(usuario.getApellidoPaterno());
		d.setApellidoMaterno(usuario.getApellidoMaterno());
		d.setNombres(usuario.getNombres());
		d.setTipoDocumentosIdentidad(usuario.getTipoDocumentosIdentidad());
		d.setNumeroDocumento(usuario.getNumeroDocumento());
		return d;
	}
	

}

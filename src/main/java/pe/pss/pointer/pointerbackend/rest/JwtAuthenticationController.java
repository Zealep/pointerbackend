package pe.pss.pointer.pointerbackend.rest;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import pe.pss.pointer.pointerbackend.config.JwtTokenUtil;
import pe.pss.pointer.pointerbackend.exceptions.BusinessException;
import pe.pss.pointer.pointerbackend.model.Usuario;
import pe.pss.pointer.pointerbackend.model.jwt.JwtRequest;
import pe.pss.pointer.pointerbackend.model.jwt.JwtResponse;
import pe.pss.pointer.pointerbackend.repository.UsuarioRepository;
import pe.pss.pointer.pointerbackend.util.BusinessMsgError;
import pe.pss.pointer.pointerbackend.util.Constantes;

import java.util.Objects;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

	private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationController.class);

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> generateAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
			throws Exception {

		authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

		validateUser(authenticationRequest.getUsername());

		final UserDetails userDetails = jwtInMemoryUserDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());


		final String token = jwtTokenUtil.generateToken(userDetails);

		final Usuario usuario = usuarioRepository.findByUsername(authenticationRequest.getUsername()).orElse(null);


		return ResponseEntity.ok(new JwtResponse(token,usuario.getIdUsuarioWeb(),usuario.getNombres()));
	}

	private void authenticate(String username, String password) throws Exception {
		Objects.requireNonNull(username);
		Objects.requireNonNull(password);
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new BusinessException(BusinessMsgError.ERROR_USUARIO_INCORRECTO,e);
		}
	}

	private void validateUser(String username) throws Exception{
		Usuario u = usuarioRepository.findByUsername(username).orElse(null);

		if(!u.getEstado().equals(Constantes.ESTADO_ACTIVO)){
			throw new BusinessException(BusinessMsgError.ERROR_USUARIO_INACTIVO);
		}
	}
}

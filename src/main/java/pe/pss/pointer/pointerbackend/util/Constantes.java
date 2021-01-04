package pe.pss.pointer.pointerbackend.util;

public interface Constantes {
	
	public static final String ESTADO_ACTIVO = "ACT";
	public static final String CODIGO_EMPRESA = "01";
	public static final String TABLE_POSTULANTE= "rh_rl_tz_usuario_web";
	public static final String ID_TABLE_POSTULANTE= "idUsuarioWeb";

	public static final String TABLE_DATOS_PERSONAL= "rh_rl_tz_postulante";
	public static final String ID_TABLE_DATOS_PERSONAL= "idPostulante";

	public static final String TABLE_AREA_INTERES= "rh_rl_tz_postulante_area_interes";
	public static final String ID_TABLE_AREA_INTERES= "idPostulanteAreas";

	public static final String TABLE_DISCAPACIDAD= "rh_rl_tz_postulante_discapacidad";
	public static final String ID_TABLE_DISCAPACIDAD= "idDiscapacidadPostulante";

	public static final String TABLE_EXPERIENCIA_LABORAL= "rh_rl_tz_experiencia_laboral";
	public static final String ID_TABLE_EXPERIENCIA_LABORAL= "idExperienciaLboral";

	public static final String TABLE_ESTUDIO_FORMAL= "rh_rl_tz_estudio_formal";
	public static final String ID_TABLE_ESTUDIO_FORMAL= "idEstudioFormal";

	public static final String TABLE_ESTUDIO_NO_FORMAL= "rh_rl_tz_estudio_no_formal";
	public static final String ID_TABLE_ESTUDIO_NO_FORMAL= "idEstudioNoFormal";

	public static final String TABLE_DATO_ARCHIVO= "mg_tz_dato_archivo_persona";
	public static final String ID_TABLE_DATO_ARCHIVO= "idDatoArchivoPersona";

	public static final String TABLE_DATO_IDIOMA= "rh_rl_tz_idioma";
	public static final String ID_TABLE_DATO_IDIOMA= "idDatoIdioma";

	public static final String TABLE_DATO_FAMILIA= "rh_rl_tz_familia";
	public static final String ID_TABLE_DATO_FAMILIA= "idDatoFamilia";

	public static final String PROCESO_DATOS_BASICOS = "00024";
	public static final String PROCESO_ESTUDIOS_FORMALES = "00025";
	public static final String PROCESO_ESTUDIOS_NO_FORMALES = "00026";
	public static final String PROCESO_EXPERIENCIA_LABORAL = "00027";
	public static final String PROCESO_DATOS_FAMILIARES = "00028";
	public static final String PROCESO_IDIOMAS = "00029";



	public static final int RESPONSE_OK = 200;
	public static final int RESPONSE_ERROR = 300;
	public static final int RESPONSE_VALIDATION_ERROR = 301;
	public static final int RESPONSE_UNEXPECTED_ERROR = 302;
	public static String RESPONSE_OK_DEFAULT_MESSAGE = "OK";
}

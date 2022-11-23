package idatcom.AlumnoMicroServicioIIIE.servicio;

import java.util.List;

import idatcom.AlumnoMicroServicioIIIE.dto.AlumnoDTO;

public interface AlumnoService {
	
	List<AlumnoDTO> listar();
	AlumnoDTO obtener(Integer idAlumno);
	void guardar(AlumnoDTO alumno);
	void actualizar(AlumnoDTO alumno);
	void eliminar(Integer idAlumno);

}

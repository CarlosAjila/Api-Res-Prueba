package ec.gob.banco.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.banco.DTO.EstadoDeCuentaTO;
import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.repository.ClienteRepository;
import ec.gob.banco.repository.PersonaRepository;
import ec.gob.banco.repository.ReporteRepository;





@Service
public class ReporteService {
	
	@Autowired
	private ReporteRepository reporteRepository;
	
	
//	public List<EstadoDeCuentaTO> getEstadoDeCuenta (Date fechaInicio,Date fechaFin, String Identificacion) {
//		return reporteRepository.getEstadoDeCuenta(fechaInicio,fechaFin,Identificacion);
//	}
	
	

}

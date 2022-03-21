package ec.gob.banco.rest;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.gob.banco.DTO.EstadoDeCuentaTO;
import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.service.ClienteService;
import ec.gob.banco.service.PersonaService;
import ec.gob.banco.service.ReporteService;



@RestController
@RequestMapping ("/api/reporte/")
public class ResporteREST {
	
	@Autowired
	private ReporteService reporteService;
	
	
//	@GetMapping (value = "{id}")
//	private ResponseEntity<List<EstadoDeCuentaTO>> getEstadoDeCuenta (Date fechaInicio, Date fechaFin, String identificacion){
//		
//		return ResponseEntity.ok(reporteService.getEstadoDeCuenta(fechaInicio,fechaFin,identificacion));
//	}
	

}
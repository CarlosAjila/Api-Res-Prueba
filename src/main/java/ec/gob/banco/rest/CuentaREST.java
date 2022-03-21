package ec.gob.banco.rest;

import java.net.URI;
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

import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.service.ClienteService;
import ec.gob.banco.service.CuentaService;
import ec.gob.banco.service.PersonaService;



@RestController
@RequestMapping ("/api/cuentas/")
public class CuentaREST {
	
	@Autowired
	private CuentaService cuentaService;

	
	@PostMapping
	private ResponseEntity<Cuenta> guardar (@RequestBody Cuenta cuenta){
	
		Cuenta temporal = this.cuentaService.create(cuenta);
		
		try {
			return ResponseEntity.created(new URI("/api/cuentas"+temporal.getCuetId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	
	@GetMapping (value = "/listarTodasLosCuentas")
	private ResponseEntity<List<Cuenta>> listarTodasLosCuentas (){
		return ResponseEntity.ok(cuentaService.getAllCuenta());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCliente (@RequestBody Cuenta cuenta){
		cuentaService.delete(cuenta);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Cuenta>> listarCuentaPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(cuentaService.findById(id));
	}
	

}
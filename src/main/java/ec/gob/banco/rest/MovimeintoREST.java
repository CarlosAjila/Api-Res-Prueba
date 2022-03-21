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
import ec.gob.banco.modelo.Movimiento;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.service.ClienteService;
import ec.gob.banco.service.MovimientoService;
import ec.gob.banco.service.PersonaService;



@RestController
@RequestMapping ("/api/movimientos/")
public class MovimeintoREST {
	
	@Autowired
	private MovimientoService movimientoService;

	
	@PostMapping
	private ResponseEntity<Movimiento> guardar (@RequestBody Movimiento movimiento){
		
		Double parametroLimite = new Double("10000");
		
		
		if(movimiento.getMovTipo().compareTo("DEBITO")==0) {
			if(movimiento.getMovSaldo()==0) {
				System.out.println("Saldo no disponible");
				return null;
			}else if(movimiento.getMovValor() != 0) {
			
				movimiento.setMovValor(movimiento.getMovValor()*-1);
			}
		}
		
		Movimiento temporal = this.movimientoService.create(movimiento);
		
		try {
			return ResponseEntity.created(new URI("/api/movimientos"+temporal.getMovId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	

	
	
	@GetMapping (value = "/listarTodasLosMovimiento")
	private ResponseEntity<List<Movimiento>> listarTodasLosMovimiento (){
		return ResponseEntity.ok(movimientoService.getAllMovimiento());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCliente (@RequestBody Movimiento movimiento){
		movimientoService.delete(movimiento);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Movimiento>> listarMovimientoPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(movimientoService.findById(id));
	}
	

}
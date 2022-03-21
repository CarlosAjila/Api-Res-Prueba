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
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.service.ClienteService;
import ec.gob.banco.service.PersonaService;



@RestController
@RequestMapping ("/api/clientes/")
public class ClienteREST {
	
	@Autowired
	private ClienteService clienteService;
	
	
	@PostMapping
	private ResponseEntity<Cliente> guardar (@RequestBody Cliente cliente){
	
		Cliente temporal = this.clienteService.create(cliente);
		
		try {
			return ResponseEntity.created(new URI("/api/clientes"+temporal.getCliId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	

	
	
	@GetMapping (value = "/listarTodasLosClientes")
	private ResponseEntity<List<Cliente>> listarTodasLosClientes (){
		return ResponseEntity.ok(clienteService.getAllClientes());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarCliente (@RequestBody Cliente cliente){
		clienteService.delete(cliente);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Cliente>> listarClientePorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(clienteService.findById(id));
	}
	

}
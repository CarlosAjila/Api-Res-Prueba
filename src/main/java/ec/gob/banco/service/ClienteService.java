package ec.gob.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.repository.ClienteRepository;
import ec.gob.banco.repository.PersonaRepository;





@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente create (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente modificar (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllClientes (){
		return clienteRepository.findAll();
	}
	
	public void delete (Cliente cliente) {
		clienteRepository.delete(cliente);
	}
	
	public Optional<Cliente> findById (Long id) {
		return clienteRepository.findById(id);
	}
	

}

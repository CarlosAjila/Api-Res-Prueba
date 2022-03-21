package ec.gob.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.repository.ClienteRepository;
import ec.gob.banco.repository.CuentaRepository;
import ec.gob.banco.repository.PersonaRepository;





@Service
public class CuentaService {
	
	@Autowired
	private CuentaRepository cuentaRepository;
	
	
	public Cuenta create (Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}
	
	public List<Cuenta> getAllCuenta (){
		return cuentaRepository.findAll();
	}
	
	public void delete (Cuenta cuenta) {
		cuentaRepository.delete(cuenta);
	}
	
	public Optional<Cuenta> findById (Long id) {
		return cuentaRepository.findById(id);
	}
	

}

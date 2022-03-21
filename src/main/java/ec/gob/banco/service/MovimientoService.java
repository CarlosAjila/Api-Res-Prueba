package ec.gob.banco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Movimiento;
import ec.gob.banco.modelo.Persona;
import ec.gob.banco.repository.ClienteRepository;
import ec.gob.banco.repository.CuentaRepository;
import ec.gob.banco.repository.MovimientoRepository;
import ec.gob.banco.repository.PersonaRepository;





@Service
public class MovimientoService {
	
	@Autowired
	private MovimientoRepository movimientoRepository;
	
	
	public Movimiento create (Movimiento movimiento) {
		return movimientoRepository.save(movimiento);
	}
	
	public List<Movimiento> getAllMovimiento (){
		return movimientoRepository.findAll();
	}
	
	public void delete (Movimiento movimiento) {
		movimientoRepository.delete(movimiento);
	}
	
	public Optional<Movimiento> findById (Long id) {
		return movimientoRepository.findById(id);
	}
	

}

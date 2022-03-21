package ec.gob.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Movimiento;
import ec.gob.banco.modelo.Persona;





public interface PersonaRepository extends JpaRepository<Persona, Long>{

}

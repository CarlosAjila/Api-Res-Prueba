package ec.gob.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Movimiento;





public interface MovimientoRepository extends JpaRepository<Movimiento, Long>{

}

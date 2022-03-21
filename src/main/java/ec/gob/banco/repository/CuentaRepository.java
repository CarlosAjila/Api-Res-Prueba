package ec.gob.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.banco.modelo.Cuenta;





public interface CuentaRepository extends JpaRepository<Cuenta, Long>{

}

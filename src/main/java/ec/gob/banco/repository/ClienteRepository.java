package ec.gob.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.gob.banco.modelo.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}

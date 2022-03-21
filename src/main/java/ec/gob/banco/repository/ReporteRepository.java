package ec.gob.banco.repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ec.gob.banco.DTO.EstadoDeCuentaTO;
import ec.gob.banco.modelo.Cuenta;
import ec.gob.banco.modelo.Movimiento;
import ec.gob.banco.modelo.Persona;





public interface ReporteRepository extends JpaRepository<Persona, Long>{

//	@Query("SELECT c FROM Car c WHERE c.model = :model")
//	List<EstadoDeCuentaTO> getCarsByModel(@Param("model") String model);
//	@Query("SELECT  new ec.gob.banco.DTO.EstadoDeCuentaTO (cue.cuet_numero AS cuenta, movi.mov_saldo AS saldo, movi.mov_tipo AS tipoMpovimiento, movi.mov_valor AS valor) "
//			+ "FROM tbl_movimiento movi INNER JOIN tbl_cuenta cue ON (movi.cuet_id = cue.cuet_id) "
//			+ "	 INNER JOIN tbl_cliente cli ON (cue.cli_id = cli.cli_id) "
//			+ "	 INNER JOIN tbl_persona per ON (per.per_id = cli.per_id) "
//			+ "WHERE  (movi.mov_fecha BETWEEN :fechaInicio AND :fechaFin) AND  "
//			+ "	  per.per_identificacion = :identificacion "
//			+ "ORDER BY movi.mov_fecha DESC")
	
//	@Query("SELECT  new ec.gob.banco.DTO.EstadoDeCuentaTO ("
//			+ "c.cuetNumero AS cuenta, m.movSaldo AS saldo, m.movTipo AS tipoMpovimiento, m.movValor AS valor) "
//			+ "FROM Movimiento m, m.cuenta c, c.cliente cli, cli.persona per "
//			+ "WHERE  (m.movFecha BETWEEN :fechaInicio AND :fechaFin) AND  "
//			+ "	  per.movFecha = :identificacion "
//			+ "ORDER BY m.movFecha DESC")
	

//	@Query("SELECT  new ec.gob.banco.DTO.EstadoDeCuentaTO ("
//			+ "cu.cuetNumero AS cuenta, mov.movSaldo AS saldo, mov.movTipo AS tipoMpovimiento, mov.movValor AS valor) "
//			+ "FROM Movimiento mov "
//			+ " JOIN Cuenta cu ON mov.cuenta =cu"
//			+ " JOIN Cliente cli ON cu.cliente = cli "
//			+ " JOIN Persona per ON per = cli.persona "
//			+ "WHERE  (mov.movFecha BETWEEN :fechaInicio AND :fechaFin) AND  "
//			+ "	  per.perIdentificacion = :identificacion "
//			+ "ORDER BY mov.movFecha DESC")
//
//	List<EstadoDeCuentaTO> getEstadoDeCuenta(@Param("fechaInicio") Date fechaInicio,@Param("fechaFin") Date fechaFin, @Param("identificacion") String identificacion);
	
	
}

package ec.gob.banco.DTO;

import ec.gob.banco.modelo.Cliente;
import ec.gob.banco.modelo.Persona;

public class EstadoDeCuentaTO {
	//cue.cuet_numero, movi.mov_saldo, movi.mov_tipo, movi.mov_valor
	private String cuenta;
	private String saldo;
	private String tipoMpovimiento;
	private String valor;
	
	
	
	public EstadoDeCuentaTO() {
		super();
	}
	
	
	
	
	public EstadoDeCuentaTO(String cuenta, String saldo, String tipoMpovimiento, String valor) {
		super();
		this.cuenta = cuenta;
		this.saldo = saldo;
		this.tipoMpovimiento = tipoMpovimiento;
		this.valor = valor;
	}




	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	public String getTipoMpovimiento() {
		return tipoMpovimiento;
	}
	public void setTipoMpovimiento(String tipoMpovimiento) {
		this.tipoMpovimiento = tipoMpovimiento;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	

}

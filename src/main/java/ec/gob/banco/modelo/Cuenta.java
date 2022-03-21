package ec.gob.banco.modelo;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cuenta")
public class Cuenta implements Serializable {


	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cuetId;
    
    private Integer cuetNumero;

    private String cuetTipoCuenta;

    private Double cuetSaldoInicial;

    private Boolean cuetEstado;
    
    @JoinColumn(name = "cliId", referencedColumnName = "cliId")
    @ManyToOne(optional = false)
    private Cliente cliente;
    

    public Cuenta() {
    } 

    public Integer getCuetId() {
		return cuetId;
	}

	public void setCuetId(Integer cuetId) {
		this.cuetId = cuetId;
	}

	public Integer getCuetNumero() {
		return cuetNumero;
	}

	public void setCuetNumero(Integer cuetNumero) {
		this.cuetNumero = cuetNumero;
	}

	public String getCuetTipoCuenta() {
		return cuetTipoCuenta;
	}

	public void setCuetTipoCuenta(String cuetTipoCuenta) {
		this.cuetTipoCuenta = cuetTipoCuenta;
	}

	public Double getCuetSaldoInicial() {
		return cuetSaldoInicial;
	}

	public void setCuetSaldoInicial(Double cuetSaldoInicial) {
		this.cuetSaldoInicial = cuetSaldoInicial;
	}

	public Boolean getCuetEstado() {
		return cuetEstado;
	}

	public void setCuetEstado(Boolean cuetEstado) {
		this.cuetEstado = cuetEstado;
	}





	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (cuetId != null ? cuetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.cuetId == null && other.cuetId != null) || (this.cuetId != null && !this.cuetId.equals(other.cuetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.TblCuenta[ cuetId=" + cuetId + " ]";
    }
    
}
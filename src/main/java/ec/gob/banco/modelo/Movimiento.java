package ec.gob.banco.modelo;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_movimiento")
public class Movimiento implements Serializable {



	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movId;
    

    private Date movFecha;
    private String movTipo;
    private Double movValor;
    private Double movSaldo;
    @JoinColumn(name = "cuetId", referencedColumnName = "cuetId")
    @ManyToOne
    private Cuenta cuenta;

    public Long getMovId() {
		return movId;
	}

	public void setMovId(Long movId) {
		this.movId = movId;
	}

	public Date getMovFecha() {
		return movFecha;
	}

	public void setMovFecha(Date movFecha) {
		this.movFecha = movFecha;
	}

	public String getMovTipo() {
		return movTipo;
	}

	public void setMovTipo(String movTipo) {
		this.movTipo = movTipo;
	}

	public Double getMovValor() {
		return movValor;
	}

	public void setMovValor(Double movValor) {
		this.movValor = movValor;
	}

	public Double getMovSaldo() {
		return movSaldo;
	}

	public void setMovSaldo(Double movSaldo) {
		this.movSaldo = movSaldo;
	}
	
	

    public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (movId != null ? movId.hashCode() : 0);
        return hash;
    }

   

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimiento)) {
            return false;
        }
        Movimiento other = (Movimiento) object;
        if ((this.movId == null && other.movId != null) || (this.movId != null && !this.movId.equals(other.movId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.TblMovimiento[ movId=" + movId + " ]";
    }
    
}

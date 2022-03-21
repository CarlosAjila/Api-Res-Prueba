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
@Table(name = "tbl_cliente")
public class Cliente implements Serializable {

  
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliId;

    private String cliContrasenia;
  
    private Boolean cliEstado;
    
    @JoinColumn(name = "perId", referencedColumnName = "perId")
    @ManyToOne
    private Persona persona;
    

    public Cliente() {
    }
    
    






	public Integer getCliId() {
		return cliId;
	}








	public void setCliId(Integer cliId) {
		this.cliId = cliId;
	}








	public String getCliContrasenia() {
		return cliContrasenia;
	}








	public void setCliContrasenia(String cliContrasenia) {
		this.cliContrasenia = cliContrasenia;
	}








	public Boolean getCliEstado() {
		return cliEstado;
	}








	public void setCliEstado(Boolean cliEstado) {
		this.cliEstado = cliEstado;
	}













	public Persona getPersona() {
		return persona;
	}








	public void setPersona(Persona persona) {
		this.persona = persona;
	}








	@Override
    public int hashCode() {
        int hash = 0;
        hash += (cliId != null ? cliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliId == null && other.cliId != null) || (this.cliId != null && !this.cliId.equals(other.cliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.TblCliente[ cliId=" + cliId + " ]";
    }
    
}

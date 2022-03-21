package ec.gob.banco.modelo;



import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer perId;

    private String perNombre;

    private String perGenero;

    private Integer perEdad;

    private String perIdentificacion;

    private String perDireccion;

    private String perTelefono;
    

    public Persona() {
    }


  


    public Integer getPerId() {
		return perId;
	}





	public void setPerId(Integer perId) {
		this.perId = perId;
	}





	public String getPerNombre() {
		return perNombre;
	}





	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}





	public String getPerGenero() {
		return perGenero;
	}





	public void setPerGenero(String perGenero) {
		this.perGenero = perGenero;
	}





	public Integer getPerEdad() {
		return perEdad;
	}





	public void setPerEdad(Integer perEdad) {
		this.perEdad = perEdad;
	}





	public String getPerIdentificacion() {
		return perIdentificacion;
	}





	public void setPerIdentificacion(String perIdentificacion) {
		this.perIdentificacion = perIdentificacion;
	}





	public String getPerDireccion() {
		return perDireccion;
	}





	public void setPerDireccion(String perDireccion) {
		this.perDireccion = perDireccion;
	}





	public String getPerTelefono() {
		return perTelefono;
	}





	public void setPerTelefono(String perTelefono) {
		this.perTelefono = perTelefono;
	}





	@Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication3.TblPersona[ perId=" + perId + " ]";
    }
    
}


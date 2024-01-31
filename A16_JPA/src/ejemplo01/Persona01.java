package ejemplo01;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//para crear JAVABEAN

//tiene que implementar serealizable
// tiene que tener constructor por defecto
//no puede ser clase interna 
//no puede ser clase final
//tiene que tener geter and seters
//hacer mapeo

@Entity// esto avisa a JPA que me lo tiene que gestionar 
@Table (name ="persona")

public class Persona01 implements Serializable{
//	hay que indicarle cual se va asociar como primary key con @Id
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //los Id van ha ser generados Identity genera los ids autoincrementables
	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona01 other = (Persona01) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona01 [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + "]";
	}
	
	
	

}

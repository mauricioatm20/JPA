package ejemplo02;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table (name ="personas")

public class Persona02 implements Serializable{
//	hay que indicarle cual se va asociar como primary key con @Id
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //los Id van ha ser generados Identity genera los ids autoincrementables
	
	@Column(name = "id_persona")
	private int idPersona;
	
	@Column(name = "p_apellidos")
	private String apellidos;
	
	@Column(name = "p_apodo")
	private String apodo;
	
	@Column(name = "p_nombre")
	private String nombre;
	
	@Column(name = "p_dni")
	private String dni;
	
	
//	mirar ejemplos de enum en el paquete teoria.enumerado 
	
	@Column(name = "p_sexo")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	
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
	
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
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
		Persona02 other = (Persona02) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona02 [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + "]";
	}
	
	
	

}

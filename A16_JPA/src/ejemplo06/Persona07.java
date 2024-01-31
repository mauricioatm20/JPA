package ejemplo06;

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
import javax.persistence.Transient;



@Entity 
@Table (name ="personas")
public class Persona07 implements Serializable{

	private int idPersona;
	private String apellidos;
	private String apodo;
	private String nombre;
	private String dni;
	private Genero genero;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) 
	@Column(name = "id_persona")
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	@Column(name = "p_apellidos")
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@Column(name = "p_apodo")
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	@Column(name = "p_nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name ="p_dni" )
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Column(name = "p_sexo")
	@Enumerated(EnumType.STRING)
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Transient
	public String getnombreCompleto() {
		return nombre + " " + apellidos;
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
		Persona07 other = (Persona07) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona02 [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + "]";
	}
	
	
	

}

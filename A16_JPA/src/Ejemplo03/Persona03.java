package Ejemplo03;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ejemplo02.Genero;

//para crear JAVABEAN

//tiene que implementar serealizable
// tiene que tener constructor por defecto
//no puede ser clase interna 
//no puede ser clase final
//tiene que tener geter and seters
//hacer mapeo

@Entity// esto avisa a JPA que me lo tiene que gestionar 
@Table (name ="persona_04")

public class Persona03 implements Serializable{
//	hay que indicarle cual se va asociar como primary key con @Id
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY ) //los Id van ha ser generados Identity genera los ids autoincrementables
	
	@Column(name = "idPersona")
	private int idPersona;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "apodo")
	private String apodo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "dni")
	private String dni;
	
	
//	mirar ejemplos de enum en el paquete teoria.enumerado para el sexo

	@Column(name = "genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	
//	le estoy diciendo que todos los atributos que tengan domicilio estan en la tabala personas04
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column (name = "tipo_via"))// en la clase domicilo se ha comentado @colum porque se hace de esta manera
	@AttributeOverride(name = "codigoPostal", column = @Column(name = "codigo_postal"))// lo mismo 
//	                   nombre = "atributo"                     nombre = columna
	private Domicilio dom;
	
	
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
	public void setGnero(Genero genero) {
		this.genero = genero;
	}
	
	public Domicilio getDomicilio() {
		return dom;
	}
	public void setDomicilio(Domicilio dom) {
		this.dom = dom;
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
		Persona03 other = (Persona03) obj;
		return idPersona == other.idPersona;
	}
	@Override
	public String toString() {
		return "Persona03 [idPersona=" + idPersona + ", apellidos=" + apellidos + ", apodo=" + apodo + ", nombre="
				+ nombre + ", dni=" + dni + ", domicilio = " + dom + "]";
	}
	
	
	

}

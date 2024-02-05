package ejemplo13;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "jugadores_03")
public class Jugador implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugador;
	@Column(name = "nombreyapellidos")
	private String nombre ;
	
	private String dorsal;
	
	@Column(name= "licencia")
	private String nroLicencia;
	
	@ManyToMany
	@JoinTable(name = "equipos_jugadores_03" , 
				joinColumns = @JoinColumn (name = "fk_jugador"),
				inverseJoinColumns =@JoinColumn(name = "fk_equipo"))
	private Set<Equipo> equipos;
	
	
	
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDorsal() {
		return dorsal;
	}
	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}
	public String getNroLicencia() {
		return nroLicencia;
	}
	public void setNroLicencia(String nroLicencia) {
		this.nroLicencia = nroLicencia;
	}
	
	
	public Set<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(Set<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idJugador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return idJugador == other.idJugador;
	}
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", nombre=" + nombre + ", dorsal=" + dorsal + ", nroLicencia="
				+ nroLicencia + "]";
	}
	
	
}

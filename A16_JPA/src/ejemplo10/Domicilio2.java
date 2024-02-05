package ejemplo10;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "domicilio")
public class Domicilio2 implements Serializable {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomicilio;
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;

	@Transient
	private String codigoPostal;
	private String ciudad;
	@Transient
	private String provincia;
	
	@OneToOne(mappedBy = "dom") //nombre del atributo donde fue mapeado
	private Contacto2 contacto;
//***********************************************************	
	
	public int getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
//	*******************************************************	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
//	*******************************************************
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}
//****************************************************
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
//**********************************************************
	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
//***********************************************************
	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
//******************************************************
	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
//**********************************************************
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
//*****************************************************************
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
//***********************************************

	public Contacto2 getContacto() {
		return contacto;
	}

	public void setContacto(Contacto2 contacto) {
		this.contacto = contacto;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(idDomicilio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio2 other = (Domicilio2) obj;
		return idDomicilio == other.idDomicilio;
	}

	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", tipoVia=" + tipoVia + ", via=" + via + ", numero=" + numero
				+ ", piso=" + piso + ", puerta=" + puerta + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad
				+ ", provincia=" + provincia + "]";
	}




}

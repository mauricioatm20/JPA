package ejemplo08;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "figuras01")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE ) // tipo de estrategia
@DiscriminatorColumn(name = "tipo_figura", discriminatorType = DiscriminatorType.STRING)
public abstract class Figura  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFigura;
	private double y;
	private double x;
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Figura() {}
	
	public abstract double area();
	
	public abstract double perimetro();

	
	
	public int getIdFigura() {
		return idFigura;
	}

	public void setIdFigura(int idFigura) {
		this.idFigura = idFigura;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFigura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		return idFigura == other.idFigura;
	}
	
	
	

}

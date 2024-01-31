package ejemplo09;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rectangulo_02")
public class Rectangulo02 extends Figura02 {
	
	@Column(name = "l1")
	private double lado1;
	@Column(name = "l2")
	private double lado2;
	
	public Rectangulo02(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Rectangulo02() {
	}
	
	public double area() {
		return lado1 * lado2;
	}
	
	public double perimetro() {
		return 2 * (lado1 + lado2);
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

//	el equals lo hereda de Figura
	
	public String toString() {
		return "Rectangulo[" + getX() + ", " + getY() + ", " + lado1 + ", " + lado2 + "]";
	}
}

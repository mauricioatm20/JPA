package teoria.enumerado;

public enum Mes {

	ENERO("ene",31), FEBRERO("feb",28), MARZO("mar",31), ABRIL("abril",30), MAYO("mayo", 30), JUNIO("jun",31);
	
	private String abrev;
	private int dias;
	
	private Mes(String abrev, int dias) {
		
		this.abrev = abrev;
		this.dias = dias;
	}
	public String getAbrev() {
		return abrev;
	}
	public int getDias() {
		return dias;
	}
	
}

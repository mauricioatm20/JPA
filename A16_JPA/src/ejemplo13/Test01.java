package ejemplo13;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Jugador j = em.find(Jugador.class, 5);
		if(j != null) {
			System.out.println(j);
		}
		
		
		
		
		em.close();
	}
}

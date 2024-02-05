package ejemplo13;

import javax.persistence.EntityManager;

import util.EMF;

public class Test02 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Equipo e = em.find(Equipo.class, 10);
		if(e != null) {
			System.out.println(e);
		}
		
		
		
		
		em.close();
	}
}

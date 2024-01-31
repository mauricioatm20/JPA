package ejemplo09;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Rectangulo02 r = em.find(Rectangulo02.class, 66);
		if(r != null) {
			System.out.println(r);
		}
		
		
		
		em.close();
	}
}

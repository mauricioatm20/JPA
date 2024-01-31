package ejemplo06;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
	
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona07 p = em.find(Persona07.class, 5);
		if(p != null) 
			System.out.println(p);
		
		
		em.close();
		EMF.getInstance().close();
		
	}
}

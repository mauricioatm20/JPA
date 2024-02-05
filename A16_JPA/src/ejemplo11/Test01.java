package ejemplo11;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Contacto03 c = em.find(Contacto03.class, 2);
		if(c != null) {
			System.out.println(c);
			for(String telefono : c.getTelefonos()) {
				System.err.println(telefono);
			}
		}
		
		
		
		
		em.close();
	}
	
}

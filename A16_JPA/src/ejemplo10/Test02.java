package ejemplo10;

import javax.persistence.EntityManager;

import util.EMF;

public class Test02 {

	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Contacto2 c = em.find(Contacto2.class, 7);
		if(c != null) {
			System.out.println(c);
		}
		
		Domicilio2 d = em.find(Domicilio2.class, 2);
		if(d != null) {
			System.out.println(d);
			System.out.println(d.getContacto());
		}
		
		em.close();
	}
	
}

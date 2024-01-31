package Ejemplo03;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona03 p= em.find(Persona03.class, 7);
		if(p!= null) {
			System.out.println(p);
		}
		em.close();
	}
}

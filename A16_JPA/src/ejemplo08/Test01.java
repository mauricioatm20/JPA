package ejemplo08;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Circulo c = em.find(Circulo.class, 30);
		if(c != null)
		System.out.println(c);
		
		//inserta
		Rectangulo nuevo = new Rectangulo(1.5,3.14,10,7.2);
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		
		//actualiza 
		Rectangulo nuevo1 = em.find(Rectangulo.class, 26);
		if(nuevo1 != null ) {
			System.out.println(nuevo1);
		}
		
		nuevo1.setLado1(1.5);
		nuevo1.setLado2(9.9);
		em.getTransaction().begin();
		em.merge(nuevo1);
		em.getTransaction().commit();
		
		em.close();
	}
}

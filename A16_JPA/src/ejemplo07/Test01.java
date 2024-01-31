package ejemplo07;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
	
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona08 p = em.find(Persona08.class, 6);
		if(p != null) 
			System.out.println(p);
		
		p.setApodo("Pirulo");
		
		Persona08 nuevo = new Persona08();
		nuevo.setNombre("Maria");
		nuevo.setApellidos("Ramirez");
		nuevo.setApodo("Mary");
		
		em.getTransaction().begin();
		em.persist(nuevo);
		em.getTransaction().commit();
		
		
		em.close();
		EMF.getInstance().close();
		
	}
}

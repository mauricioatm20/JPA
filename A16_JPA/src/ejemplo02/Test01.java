package ejemplo02;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {
	public static void main(String[] args) {
	
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona02 p = em.find(Persona02.class, 6);
		if(p != null) 
			System.out.println(p);
		
		p.setApodo("Juancho");
		p.setGenero(Genero.MASCULINO);
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
		
		
		em.close();
		EMF.getInstance().close();
		
	}
}

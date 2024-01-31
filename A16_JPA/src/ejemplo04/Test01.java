package ejemplo04;

import javax.persistence.EntityManager;

import util.EMF;

public class Test01 {

	public static void main(String[] args) {
		
	EntityManager em = EMF.getInstance().createEntityManager();
	
	Persona05 p= em.find(Persona05.class, new Dni05(999999, 'x'));
	if(p != null)
		System.out.println(p);
	
	
	em.close();
	}
}

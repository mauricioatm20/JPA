package ejemplo12;

import javax.persistence.EntityManager;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import util.EMF;

public class Test01 {

	
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Partido p = em.find(Partido.class, 3);
		if(p != null) {
			System.out.println(p);
		}
		
		
		em.close();
	}
}

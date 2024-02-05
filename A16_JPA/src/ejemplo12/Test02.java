package ejemplo12;

import javax.persistence.EntityManager;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;

import util.EMF;

public class Test02 {

	
	public static void main(String[] args) {
		
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Campo02 c = em.find(Campo02.class, 2);
		if(c != null) {
			System.out.println(c);
			for(Partido02 partido : c.getPartidos()) {// le pido los partidos
				System.out.println(partido);
			}
		}
		em.close();
	}
}

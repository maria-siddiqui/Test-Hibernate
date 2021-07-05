import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Hibernate {
	public static void main(String[] args){
		Job usman=new Job();
		usman.setId(424); 
		usman.setFname("Muhammad");
		usman.setLname("Usman");
		usman.setDepartment("Engineering");
		usman.setSalary(54000);
		
		
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Job.class);
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		session.save(usman);
		
	}

}

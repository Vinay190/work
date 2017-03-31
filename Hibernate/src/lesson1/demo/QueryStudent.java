package lesson1.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {
		
		//create session factory
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
	   Session session = factory.getCurrentSession();
	   
	   
		try{
			
			//begin transaction
			session.beginTransaction();
			
			//query students
			List<Student> thestudents = session.createQuery("from Student").list();
			
			//display
			for(Student tempStudent : thestudents){
				System.out.println(tempStudent);
			}
			
			//query students : lastName = 'Doe'
			thestudents = session.createQuery("from Student s where s.lastName='a'").list();
			
			//dislay
			for(Student tempStudent : thestudents){
				System.out.println(tempStudent);
			}
			
			
			
			
			//commit transaction
			session.getTransaction().commit();
		System.out.println("done !!!!!");
		}
		finally{
			factory.close();
		}
		
		
		
		

	}

}

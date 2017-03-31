package lesson1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		
		//create session factory
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
	   Session session = factory.getCurrentSession();
	   
	   
		try{
			//use sesion obj to save java obj
			
			//create student obj
			System.out.println("creating new student obj");
			Student tempStudent = new Student("hari", "a", "harish@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			//save  student onj
			System.out.println("saving student.......");
			session.save(tempStudent);
			
			
			//commit transaction
			session.getTransaction().commit();
		System.out.println("done !!!!!");
		}
		finally{
			factory.close();
		}
		
		
		
		

	}

}

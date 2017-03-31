package lesson1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		
		//create session factory
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
	   Session session = factory.getCurrentSession();
	   
	   
		try{

			int studentId = 1;
			//READ DATA
			
			//start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve data based on id
			System.out.println("\n getting student with id" + studentId);
			 
			Student myStudent = session.get(Student.class,studentId);
			
			System.out.println("updating  student.......: " );
			myStudent.setFirstName("hello");

			session.getTransaction().commit();
			
			
			
			//start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			System.out.println("update email for all");
			session.createQuery("update Student set email ='h@gmail.com'").executeUpdate();
			
			//commit transaction
			
			session.getTransaction().commit();
			
			
		System.out.println("done !!!!!");
		}
		finally{
			factory.close();
		}
		
		
		
		

	}

}

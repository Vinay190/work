package lesson1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class DeleteStudent {

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


			//delete student
			//System.out.println("deleting ..student "+myStudent);
			//session.delete(myStudent);
			
			//delete student id = 2
			System.out.println("deleting student with id =2");
			session.createQuery("delete from Student where id = 2").executeUpdate();
			
			session.getTransaction().commit();
			
			
		System.out.println("done !!!!!");
		}
		finally{
			factory.close();
		}
		
		
		
		

	}

}

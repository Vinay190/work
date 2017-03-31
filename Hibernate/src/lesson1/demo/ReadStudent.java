package lesson1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class ReadStudent {

	public static void main(String[] args) {
		
		//create session factory
	   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
	   Session session = factory.getCurrentSession();
	   
	   
		try{
			//use sesion obj to save java obj
			
			//create student obj
			System.out.println("creating new student obj");
			Student tempStudent = new Student("hari1", "a", "harish@gmail.com");
			
			//begin transaction
			session.beginTransaction();
			//save  student onj
			System.out.println("saving student.......");
			System.out.println(tempStudent);
			session.save(tempStudent);
			
			
			//commit transaction
			session.getTransaction().commit();
			
			
			//READ DATA
			//find student's primary key : id
			System.out.println("save student. generated id : " +tempStudent.getId());
			
			//start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve data based on id
			System.out.println("\n getting student with id" + tempStudent.getId());
			
			Student myStudent = session.get(Student.class,tempStudent.getId());
			
			System.out.println("get complete : " +myStudent);
			
			//commit transaction
			
			session.getTransaction().commit();
			
			
		System.out.println("done !!!!!");
		}
		finally{
			factory.close();
		}
		
		
		
		

	}

}

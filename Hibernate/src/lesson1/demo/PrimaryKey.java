package lesson1.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lesson1.entity.Student;

public class PrimaryKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create session factory
		   SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			
		   Session session = factory.getCurrentSession();
		   
		   
			try{
				//use sesion obj to save java obj
				
				//create 3 student obj
				System.out.println("creating 3 new student obj");
				Student tempStudent1 = new Student("hari", "a", "harish@gmail.com");
				Student tempStudent2 = new Student("def", "b", "def@gmail.com");
				Student tempStudent3 = new Student("abc", "c", "abc@gmail.com");
				
				//begin transaction
				session.beginTransaction();
				//save  student onj
				System.out.println("saving student.......");
				session.save(tempStudent1);
				session.save(tempStudent2);		
				session.save(tempStudent3);		
				
				//commit transaction
				session.getTransaction().commit();
			System.out.println("done !!!!!");
			}
			finally{
				factory.close();
			}
			
			
			
			

		}

		
		
		
	}



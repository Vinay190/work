package springs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class1 {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       shape shap = (shape) context.getBean("circle");
       shap.draw();
       System.out.println(context.getMessage("Greeting", null,"Default greeting",null));
	}

}

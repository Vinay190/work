package springs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor1 implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException {
		
		System.out.println("after initiazation " +beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("before initialization "+ beanName);
		return bean;
	}

	
}

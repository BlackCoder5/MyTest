package sxf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sxf.demo.dubbo.api.MoneyDubbo;

@ImportResource("classpath:consumer-context.xml")
@SpringBootApplication
public class DemoApplication   extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
	
	public static void main(String[] args) {

		SpringApplication springApplication = new SpringApplication(DemoApplication.class);

		springApplication.run(args);
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer-context.xml");
		MoneyDubbo dubbo =(MoneyDubbo) context.getBean("moneyDubbo");
		// 消费
		System.out.println("测试结果" + dubbo.getMoney());
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8081); 
		
	}
}

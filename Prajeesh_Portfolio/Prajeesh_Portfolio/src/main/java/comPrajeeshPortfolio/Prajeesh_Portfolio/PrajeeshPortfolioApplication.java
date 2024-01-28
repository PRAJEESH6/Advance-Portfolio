package comPrajeeshPortfolio.Prajeesh_Portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import comPrajeeshPortfolio.Prajeesh_Portfolio.Service.Implement;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class PrajeeshPortfolioApplication {

	@Autowired
	private Implement mailMethod;
	
	public static void main(String[] args) {
		SpringApplication.run(PrajeeshPortfolioApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		mailMethod.sendEmail("sprajeesh947@gmail.com", "Hii Prajeesh", "I'm sure you're the best developer in the world..");
	}



}
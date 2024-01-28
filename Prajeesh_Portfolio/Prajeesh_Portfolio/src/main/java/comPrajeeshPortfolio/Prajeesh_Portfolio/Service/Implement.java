package comPrajeeshPortfolio.Prajeesh_Portfolio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import comPrajeeshPortfolio.Prajeesh_Portfolio.DTO.SaveDTO;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Repo.Repos;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Repo.TouchRepo;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.Schemas;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.TouchSchema;

@Service
public class Implement  {

	@Autowired
	private Repos repos;
	
	@Autowired
	private TouchRepo repo;
	
	@Autowired
	private JavaMailSender mailsender;


	public void addDevelopers(Schemas saveDTO) {
		// TODO Auto-generated method stub
		repos.save(saveDTO);
	}


	public void getinTouch(TouchSchema touch) {
		// TODO Auto-generated method stub
		repo.save(touch);
		
	}
	
	public void sendEmail(String toEmail, String subject , String Body) 
	{
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("sprajeesh947@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(Body);
		
		mailsender.send(message);
		System.out.println("Mail send Successfully..");
		
	}
		
	
}

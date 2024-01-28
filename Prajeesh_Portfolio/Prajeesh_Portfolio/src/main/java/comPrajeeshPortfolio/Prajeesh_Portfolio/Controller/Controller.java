package comPrajeeshPortfolio.Prajeesh_Portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comPrajeeshPortfolio.Prajeesh_Portfolio.DTO.SaveDTO;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.Schemas;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.TouchSchema;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Service.Implement;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Service.Method;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/prajeesh_portfolio")
public class Controller {
	
	@Autowired
	private Implement method;
	
	@PostMapping(value = "/signup")
	public String AddDevelopers(@RequestBody Schemas saveDTO)
	{
		method.addDevelopers(saveDTO);
		return saveDTO.getName();
	}
	
	@PostMapping(value = "/messages")
	public String GetinTouch(@RequestBody TouchSchema touch)
	{
		method.getinTouch(touch);
		return touch.getUser_name();
	}


}

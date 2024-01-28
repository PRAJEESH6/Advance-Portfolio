package comPrajeeshPortfolio.Prajeesh_Portfolio.Repo;


import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import comPrajeeshPortfolio.Prajeesh_Portfolio.DTO.SaveDTO;
import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.Schemas;
//import comPrajeeshPortfolio.Prajeesh_Portfolio.Service.Users;

@EnableJpaRepositories
@Repository
public interface Repos extends MongoRepository <Schemas , String> {

	void save(SaveDTO saveDTO);

  

}

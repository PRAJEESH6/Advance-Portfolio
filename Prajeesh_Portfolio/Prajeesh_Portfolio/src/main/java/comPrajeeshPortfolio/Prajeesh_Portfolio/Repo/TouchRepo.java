package comPrajeeshPortfolio.Prajeesh_Portfolio.Repo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import comPrajeeshPortfolio.Prajeesh_Portfolio.Schemas.TouchSchema;

@EnableJpaRepositories
@Repository
public interface TouchRepo extends MongoRepository<TouchSchema , String> {

}

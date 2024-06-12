package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Jpa.Repository.PersonReposirory;

@Service
public class PersonService {

    @Autowired
    private PersonReposirory personReposirory;

    public Person getById(long id){
      return   personReposirory.findById(id).orElse(null);
    }
}

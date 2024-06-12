package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Jpa.Repository.PersonReposirory;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonReposirory personReposirory;


    public Person createPersona(Person person) {
        return personReposirory.save(person);
    }
    public List<Person> findAllPersons() {
        return personReposirory.findAll();
    }
    public  Person findPersonById( long id) {
        return personReposirory.findById(id).orElse(null);
    }
    public  void deletePerson(long id) {
        personReposirory.deleteById(id);
    }
}

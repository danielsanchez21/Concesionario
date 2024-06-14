package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Jpa.Model.TypeDocument;
import uptc.frw.coches.Jpa.Repository.PersonReposirory;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonReposirory personReposirory;

    @Autowired
    private TypeDocumentService typeDocumentService;


    public Person createPersona(Person person) {
        TypeDocument typeDocument = typeDocumentService.findById(person.getTypeDocument());
        person.setTypeDocumentsPerson(typeDocument);
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

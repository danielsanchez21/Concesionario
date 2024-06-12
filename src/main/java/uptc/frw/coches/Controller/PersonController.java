package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Service.PersonService;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(Person person) {
        return personService.createPersona(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return  personService.findAllPersons();
    }

    @GetMapping("/{id}")
    public  Person getPersonById(@PathVariable long id) {
        return personService.findPersonById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable long id) {
        personService.deletePerson(id);
    }

}

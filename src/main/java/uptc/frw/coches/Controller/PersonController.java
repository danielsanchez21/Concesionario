package uptc.frw.coches.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uptc.frw.coches.Service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
    private PersonService personService;
}

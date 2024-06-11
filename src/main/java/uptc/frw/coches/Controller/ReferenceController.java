package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uptc.frw.coches.Service.ReferenceService;

@RestController
@RequestMapping("ref")
public class ReferenceController {
    @Autowired
    private ReferenceService referenceService;
}

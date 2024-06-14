package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import uptc.frw.coches.Jpa.Model.Reference;
import uptc.frw.coches.Service.ReferenceService;

import java.util.List;

@RestController
@RequestMapping("ref")
public class ReferenceController {
    @Autowired
    private ReferenceService referenceService;

    @GetMapping
    public List<Reference> getReferences() {
        return referenceService.getReference();
    }

    @GetMapping("/{id}")
    public Reference findReferenceById(@PathVariable long id) {
        return referenceService.findReferenceById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReferenceById(@PathVariable long id) {
        referenceService.deleteReference(id);
    }
    @PostMapping
    public Reference createRef( @RequestBody Reference reference){
        return  referenceService.createReference(reference);
    }
}

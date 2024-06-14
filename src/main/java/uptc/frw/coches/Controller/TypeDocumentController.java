package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uptc.frw.coches.Jpa.Model.TypeDocument;
import uptc.frw.coches.Service.TypeDocumentService;

import java.util.List;
@RestController
@RequestMapping("typeDocument")
public class TypeDocumentController {
    @Autowired
    private TypeDocumentService typeDocumentService;

    @GetMapping
    public List<TypeDocument> getAllVersions() {
        return typeDocumentService.findAll();

    }

    @GetMapping("/{id}")
    public TypeDocument getDocuemntById(@PathVariable long id) {
        return typeDocumentService.findById(id);
    }

    @PostMapping
    public TypeDocument saveTypeDocument(@RequestBody TypeDocument version) {
        return typeDocumentService.createTypeDcoument(version);
    }

    @DeleteMapping("/{id}")
    public void deleteTypeDocument(@PathVariable long id) {
        typeDocumentService.deleteTypeDocument(id);
    }

    @PutMapping("/{id}")
    public TypeDocument updateVersion(@PathVariable long id, String nombre, String siglas) {
        return typeDocumentService.updateTypeDocument(id,nombre,siglas);
    }

}

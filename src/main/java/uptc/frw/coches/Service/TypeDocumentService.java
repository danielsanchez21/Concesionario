package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.TypeDocument;
import uptc.frw.coches.Jpa.Repository.TypeDocumentRepository;

import java.util.List;

@Service
public class TypeDocumentService {
    @Autowired
    private TypeDocumentRepository typeDocumentRepository;

    public List<TypeDocument> findAll() {
        return typeDocumentRepository.findAll();
    }

    public TypeDocument findById(long id) {
        return typeDocumentRepository.findById(id).orElse(null);
    }

    public TypeDocument createTypeDcoument(TypeDocument typeDocument) {
        return typeDocumentRepository.save(typeDocument);
    }

    public TypeDocument updateTypeDocument(long id, String descripcion, String siglas) {
        TypeDocument typeDocument= findById(id);
        typeDocument.setDescripcion(descripcion);
        typeDocument.setSiglas(siglas);
        return typeDocumentRepository.save(typeDocument);
    }

    public void deleteTypeDocument(long id) {
        typeDocumentRepository.deleteById(id);
    }
}
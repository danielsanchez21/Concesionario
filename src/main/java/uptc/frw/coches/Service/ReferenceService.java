package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Reference;
import uptc.frw.coches.Jpa.Repository.ReferenceRepository;

import java.util.List;

@Service
public class ReferenceService {
    @Autowired
    private ReferenceRepository referenceRepository;

    public List<Reference> getReference(){
       return  referenceRepository.findAll();
    }


    public Reference findReferenceById(long id) {
        return referenceRepository.findById(id).orElse(null);
    }

    public void deleteReference(long id){
       referenceRepository.deleteById(id);
    }
}

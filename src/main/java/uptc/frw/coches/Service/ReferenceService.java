package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Repository.ReferenceRepository;

@Service
public class ReferenceService {
    @Autowired
    private ReferenceRepository referenceRepository;
}

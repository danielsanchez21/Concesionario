package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Version;
import uptc.frw.coches.Jpa.Repository.VersionRepository;

import java.util.List;

@Service
public class VersionService {
    @Autowired
    private VersionRepository versionRepository;

    public List<Version> findAll() {
        return versionRepository.findAll();
    }

    public Version findById(long id) {
        return versionRepository.findById(id).orElse(null);
    }

    public Version createVersion(Version version) {
        return versionRepository.save(version);
    }

    public Version updateVersion(long id, String descripcion, String nombre) {
        Version version= findById(id);
        version.setDescripcion(descripcion);
        version.setNombre(nombre);
        return versionRepository.save(version);
    }

    public void deleteVersion(long id) {
        versionRepository.deleteById(id);
    }
}

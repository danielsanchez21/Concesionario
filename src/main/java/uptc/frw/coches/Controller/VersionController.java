package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uptc.frw.coches.Jpa.Model.Version;
import uptc.frw.coches.Service.VersionService;

import java.util.List;


@RestController
@RequestMapping("version")
public class VersionController {
    @Autowired
    private VersionService versionService;

    @GetMapping
    public List<Version> getAllVersions() {
        return versionService.findAll();

    }

    @GetMapping("/{id}")
    public Version getVersionById(@PathVariable long id) {
        return versionService.findById(id);
    }

    @PostMapping
    public Version saveVersion(@RequestBody Version version) {
        return versionService.createVersion(version);
    }

    @DeleteMapping("/{id}")
    public void deleteVersion(@PathVariable long id) {
        versionService.deleteVersion(id);
    }

    @PutMapping("/{id}")
    public Version updateVersion(@PathVariable long id, String nombre, String descripcion) {
        return versionService.updateVersion(id,nombre,descripcion);
    }

}


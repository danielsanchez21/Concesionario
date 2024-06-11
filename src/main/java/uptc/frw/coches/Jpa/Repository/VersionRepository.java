package uptc.frw.coches.Jpa.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uptc.frw.coches.Jpa.Model.Version;

public interface VersionRepository extends JpaRepository<Version, Long> {


}

package uptc.frw.coches.Jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uptc.frw.coches.Jpa.Model.Person;

public interface PersonReposirory extends JpaRepository<Person, Long> {
}

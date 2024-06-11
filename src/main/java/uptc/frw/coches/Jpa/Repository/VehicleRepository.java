package uptc.frw.coches.Jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uptc.frw.coches.Jpa.Model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}

package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Vehicle;
import uptc.frw.coches.Jpa.Repository.VehicleRepository;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle() {
        return vehicleRepository.findAll();
    }

    public Vehicle findVehicleById(long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public void deleteVehicle(long id) {
        vehicleRepository.deleteById(id);
    }
}

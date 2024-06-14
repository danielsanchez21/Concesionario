package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import uptc.frw.coches.Jpa.Model.Vehicle;
import uptc.frw.coches.Service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getVehicles() {
        return vehicleService.getVehicle();
    }

    @GetMapping("/{id}")
    public Vehicle findVehicleById(@PathVariable long id) {
        return vehicleService.findVehicleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteVehicleById(@PathVariable long id) {
        vehicleService.deleteVehicle(id);
    }

    @PostMapping
    public  Vehicle createVehicle(@RequestBody Vehicle vehicle){
      return   vehicleService.createVehicle(vehicle);
    }
}

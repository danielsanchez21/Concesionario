package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uptc.frw.coches.Service.VehicleService;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;
}

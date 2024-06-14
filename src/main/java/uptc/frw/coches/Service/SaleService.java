package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Jpa.Model.Reference;
import uptc.frw.coches.Jpa.Model.Sale;
import uptc.frw.coches.Jpa.Model.Vehicle;
import uptc.frw.coches.Jpa.Repository.SaleRepository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private PersonService personService;

    @Autowired
    private VehicleService vehicleService;


    @Autowired
    ReferenceService referenceService;

    public List<Sale> saleList() {
        return saleRepository.findAll();
    }

    public Sale findById(long id) {

        return saleRepository.findById(id).orElse(null);

    }

    public Sale createSale(Sale sale) {
        Person customer = personService.findPersonById(sale.getIdCustomer());
        Person vendor = personService.findPersonById(sale.getIdVendor());
        Vehicle vehiclenew = vehicleService.findVehicleById(sale.getIdVehicle());
        Vehicle vehicleOld = null;
        if (sale.getTransferVehicle() != null) {
            vehicleOld = vehicleService.findVehicleById(sale.getTransferVehicle());
        }
        sale.setDateSale(new Date());
        sale.setPersonVendor(vendor);
        sale.setPersonCustomer(customer);
        sale.setVehicleSale(vehiclenew);
        sale.setVehicleTransfer(vehicleOld);
        return saleRepository.save(sale);
    }

    public Sale updateSale(long id, Double price) {
        Sale sale = findById(id);
        sale.setPrice(price);
        return saleRepository.save(sale);
    }

    public void deleteSale(long idSale) {
        saleRepository.deleteById(idSale);
    }

    public Map<String, List<?>> report(long idVendor, long idCustomer) {
        Person customer = personService.findPersonById(idCustomer);
        Person vendor = personService.findPersonById(idVendor);
        List<Sale> saleList = saleList();

        List<Sale> filteredSales = saleList.stream()
                .filter(sale -> sale.getPersonVendor().equals(vendor) && sale.getPersonCustomer().equals(customer))
                .collect(Collectors.toList());

        List<Vehicle> saleVehicles = filteredSales.stream()
                .flatMap(sale -> vehicleService.getVehicle().stream()
                        .filter(vehicle -> vehicle.getVehicleSale().equals(sale)))
                .collect(Collectors.toList());

        List<Reference> references = saleVehicles.stream()
                .flatMap(vehicle -> referenceService.getReference().stream()
                        .filter(reference -> reference.getVersionVehiculo().equals(vehicle)))
                .collect(Collectors.toList());

        Map<String, List<?>> result = new HashMap<>();
        result.put("sales", filteredSales);
        result.put("vehicles", saleVehicles);
        result.put("references", references);

        return result;
    }
}


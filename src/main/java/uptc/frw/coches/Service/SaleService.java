package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Person;
import uptc.frw.coches.Jpa.Model.Sale;
import uptc.frw.coches.Jpa.Model.Vehicle;
import uptc.frw.coches.Jpa.Repository.SaleRepository;

import java.util.Date;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private PersonService personService;

    @Autowired
    private VehicleService vehicleService;

    public List<Sale> saleList (){
        return saleRepository.findAll();
    }

    public Sale findById(long id){

        return saleRepository.findById(id).orElse(null);

    }
    public Sale createSale(Sale sale){
        Person customer = personService.findPersonById(sale.getIdCustomer());
        Person vendor = personService.findPersonById(sale.getIdVendor());
        Vehicle vehiclenew = vehicleService.findVehicleById(sale.getIdVehicle());
        Vehicle vehicleOld=null;
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

    public void deleteSale(long idSale){
        saleRepository.deleteById(idSale);
    }
}

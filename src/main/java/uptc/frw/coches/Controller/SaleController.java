package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uptc.frw.coches.Jpa.Model.Sale;
import uptc.frw.coches.Service.SaleService;

import java.util.List;

@RestController
@RequestMapping("sale")
public class SaleController {
    @Autowired
    private SaleService saleService;
    @GetMapping
    public List<Sale> getFindAllSales(){
        return saleService.saleList();
    }
    @GetMapping("/{id}")
    public Sale getFindById(@PathVariable long id){
        return saleService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable long id){
        saleService.deleteSale(id);
    }
    @PostMapping
    public Sale createSale(@RequestBody Sale sale){
        return saleService.createSale(sale);
    }

    @PutMapping("/{id}")
    public Sale updateSale(@PathVariable long id, @RequestParam Double price){
        return  saleService.updateSale(id,price);
    }

}

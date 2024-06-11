package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

}

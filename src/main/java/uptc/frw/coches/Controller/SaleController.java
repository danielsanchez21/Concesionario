package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public Sale getFindById(long id){
        return saleService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteById(long id){
        saleService.deleteSale(id);
    }

}

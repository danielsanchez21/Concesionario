package uptc.frw.coches.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uptc.frw.coches.Service.SaleService;

@RestController
@RequestMapping("sale")
public class SaleController {
    @Autowired
    private SaleService saleService;


}

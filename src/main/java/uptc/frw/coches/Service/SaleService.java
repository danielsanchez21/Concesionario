package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Repository.SaleRepository;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

}

package uptc.frw.coches.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uptc.frw.coches.Jpa.Model.Sale;
import uptc.frw.coches.Jpa.Repository.SaleRepository;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;

    public List<Sale> saleList (){
        return saleRepository.findAll();
    }

    public Sale findById(long id){
        return saleRepository.findById(id).orElse(null);

    }

    public void deleteSale(long idSale){
        saleRepository.deleteById(idSale);
    }
}

package uptc.frw.coches.Jpa.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "persona")
public class Person {

    @Id
    @Column(name = "pk_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "razon_social")
    private  String businessName;
    @Column(name = "tipo_documento")
    private  long typeDocument;
    @Column(name = "numero_documento")
    private  String numberDocument;
    @Column(name = "direccion")
    private String address;
    @Column(name = "telefono")
    private String phoneNumber;

    @JsonIgnore
    @OneToMany(mappedBy = "personCustomer")
    private List<Sale> saleCustomer;

    @JsonIgnore
    @OneToMany(mappedBy = "personVendor")
    private List<Sale> saleVendor;
    public Person() {
    }

    public List<Sale> getSaleVendor() {
        return saleVendor;
    }

    public void setSaleVendor(List<Sale> saleVendor) {
        this.saleVendor = saleVendor;
    }

    public List<Sale> getSaleCustomer() {
        return saleCustomer;
    }

    public void setSaleCustomer(List<Sale> saleCustomer) {
        this.saleCustomer = saleCustomer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public long getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(long typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", businessName='" + businessName + '\'' +
                ", typeDocument=" + typeDocument +
                ", numberDocument='" + numberDocument + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

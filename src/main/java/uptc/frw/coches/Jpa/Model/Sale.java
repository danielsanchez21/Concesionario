package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "venta")
public class Sale {
    @Id
    @Column(name = "pk_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fk_vendedor",insertable = false,updatable = false)
    private long idVendor;
    @Column(name = "fk_cliente",insertable = false,updatable = false)
    private long idCustomer;
    @Column(name = "fk_vehiculo")
    private long idVehicle;
    @Column(name = "precio")
    private Double price;
    @Column(name = "fk_vehiculo_cesion")
    private long transferVehicle;

    @ManyToOne
    @JoinColumn(name = "fk_cliente")
    private Person ventaCliente;

    @ManyToOne
    @JoinColumn(name = "fk_vendedor")
    private Person ventaVehiculo;

    public Sale() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdVendor() {
        return idVendor;
    }

    public void setIdVendor(long idVendor) {
        this.idVendor = idVendor;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public long getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(long idVehicle) {
        this.idVehicle = idVehicle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getTransferVehicle() {
        return transferVehicle;
    }

    public void setTransferVehicle(long transferVehicle) {
        this.transferVehicle = transferVehicle;
    }

    public Person getVentaCliente() {
        return ventaCliente;
    }

    public void setVentaCliente(Person ventaCliente) {
        this.ventaCliente = ventaCliente;
    }

    public Person getVentaVehiculo() {
        return ventaVehiculo;
    }

    public void setVentaVehiculo(Person ventaVehiculo) {
        this.ventaVehiculo = ventaVehiculo;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", idVendor=" + idVendor +
                ", idCustomer=" + idCustomer +
                ", idVehicle=" + idVehicle +
                ", price=" + price +
                ", transferVehicle=" + transferVehicle +
                '}';
    }
}

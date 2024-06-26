package uptc.frw.coches.Jpa.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vehiculo")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_vehiculo")
    private long id;

    @Column(name = "fk_referencia", insertable = false, updatable = false)
    private long fkReferencia;

    @Column(name = "cilindraje")
    private long cilindraje;

    @Column(name = "precio_cesion")
    private Double precioSesion;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "fecha")
    private Date fecha;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fk_referencia")
    private Reference referenciaVehiculos;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicleSale")
    private List<Sale> vehicleSale;
    @JsonIgnore
    @OneToMany(mappedBy = "vehicleTransfer")
    private List<Sale> vehicleTransfer;

    public Vehicle() {
    }


    public List<Sale> getVehicleTransfer() {
        return vehicleTransfer;
    }

    public void setVehicleTransfer(List<Sale> vehicleTransfer) {
        this.vehicleTransfer = vehicleTransfer;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Sale> getVehicleSale() {
        return vehicleSale;
    }

    public void setVehicleSale(List<Sale> vehicleSale) {
        this.vehicleSale = vehicleSale;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Reference getReferenciaVehiculos() {
        return referenciaVehiculos;
    }

    public void setReferenciaVehiculos(Reference referenciaVehiculos) {
        this.referenciaVehiculos = referenciaVehiculos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFkReferencia() {
        return fkReferencia;
    }

    public void setFkReferencia(long fk_Referencia) {
        this.fkReferencia = fk_Referencia;
    }

    public long getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(long cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Double getPrecioSesion() {
        return precioSesion;
    }

    public void setPrecioSesion(Double precioSesion) {
        this.precioSesion = precioSesion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", fk_Referencia=" + fkReferencia +
                ", cilindraje=" + cilindraje +
                ", precioSesion=" + precioSesion +
                ", matricula='" + matricula + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

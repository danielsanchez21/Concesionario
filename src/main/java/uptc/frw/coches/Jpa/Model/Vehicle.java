package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "vehiculo")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_vehiculo")
    private long id;

    @Column(name = "fk_referencia",insertable = false, updatable = false)
    private long fk_Referencia;

    @Column(name = "cilindraje")
    private long cilindraje;

    @Column(name = "precio_cesion")
    private float precioSesion;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "fk_referencia")
    private Reference referenciaVehiculos;

    public Vehicle() {
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

    public long getFk_Referencia() {
        return fk_Referencia;
    }

    public void setFk_Referencia(long fk_Referencia) {
        this.fk_Referencia = fk_Referencia;
    }

    public long getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(long cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getPrecioSesion() {
        return precioSesion;
    }

    public void setPrecioSesion(float precioSesion) {
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
                ", fk_Referencia=" + fk_Referencia +
                ", cilindraje=" + cilindraje +
                ", precioSesion=" + precioSesion +
                ", matricula='" + matricula + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}

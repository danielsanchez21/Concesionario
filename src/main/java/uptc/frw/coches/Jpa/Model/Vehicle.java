package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

import javax.xml.crypto.Data;

@Entity
@Table(name = "vehiculo")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_vehiculo")
    private long id;

    @Column(name = "fk_referencia")
    private long fk_Referencia;

    @Column(name = "cilindraje")
    private long cilindraje;

    @Column(name = "precio_cesion")
    private float precioSesion;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "fecha")
    private Data fecha;

    public Vehicle() {
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

    public Data getFecha() {
        return fecha;
    }

    public void setFecha(Data fecha) {
        this.fecha = fecha;
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

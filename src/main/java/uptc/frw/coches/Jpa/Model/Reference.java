package uptc.frw.coches.Jpa.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "referencia")
public class Reference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_referencia")
    public long pk_referencia;

    @Column(name = "modelo")
    public String modelo;

    @Column(name = "marca")
    public String marca;

    @Column(name = "anio")
    public int anio;

    @Column(name = "fk_version", insertable = false, updatable = false)
    private long fkVersion;
    @JsonIgnore
    @OneToMany(mappedBy = "referenciaVehiculos")
    private List<Vehicle> vehiculos;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "fk_version")
    private Version versionVehiculo;

    public Reference() {
    }

    public Version getVersionVehiculo() {
        return versionVehiculo;
    }

    public void setVersionVehiculo(Version versionVehiculo) {
        this.versionVehiculo = versionVehiculo;
    }

    public List<Vehicle> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehicle> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public long getPk_referencia() {
        return pk_referencia;
    }

    public void setPk_referencia(long pk_referencia) {
        this.pk_referencia = pk_referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public long getFkVersion() {
        return fkVersion;
    }

    public void setFkVersion(long fk_version) {
        this.fkVersion = fk_version;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "pk_referencia=" + pk_referencia +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", fk_version=" + fkVersion +
                '}';
    }
}

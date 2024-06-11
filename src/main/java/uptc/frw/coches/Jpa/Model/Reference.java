package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "referencia")
public class Reference {

    @Id
    @Column(name = "pk_referencia")
    public long pk_referencia;

    @Column(name = "modelo")
    public String modelo;

    @Column(name = "marca")
    public String marca;

    @Column(name = "anio")
    public int anio;

    @Column(name = "fk_version")
    private long fk_version;

    @OneToMany(mappedBy = "referenciaVehiculos")
    private List<Vehicle> vehiculos;

    public Reference() {
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

    public long getFk_version() {
        return fk_version;
    }

    public void setFk_version(long fk_version) {
        this.fk_version = fk_version;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "pk_referencia=" + pk_referencia +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", anio=" + anio +
                ", fk_version=" + fk_version +
                '}';
    }
}

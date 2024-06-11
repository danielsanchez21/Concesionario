package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "version")
public class Version {
 @Id

 @Column (name = "pk_version")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long idVersion;
 @Column (name = "nombre")
 private String nombre;
 @Column(name = "descripcion")
 private String descripcion;

 @OneToMany(mappedBy = "versionVehiculo")
    private List<Reference> vehiculosVersion;

    public Version() {

    }

    public List<Reference> getVehiculosVersion() {
        return vehiculosVersion;
    }

    public void setVehiculosVersion(List<Reference> vehiculosVersion) {
        this.vehiculosVersion = vehiculosVersion;
    }

    public long getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(long idVersion) {
        this.idVersion = idVersion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Version{" +
                "idVersion=" + idVersion +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

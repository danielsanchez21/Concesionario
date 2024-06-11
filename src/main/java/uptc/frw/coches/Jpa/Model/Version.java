package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

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


    public Version() {

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
}

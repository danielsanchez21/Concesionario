package uptc.frw.coches.Jpa.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoDocumento")
public class TypeDocument {
    @Id
    @Column(name = "pk_tipo_documento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTypeDocument;

    @Column (name = "descripcion")
    private String descripcion;

    @Column(name = "siglas")
    private String siglas;

    public TypeDocument() {
    }

    public long getIdTypeDocument() {
        return idTypeDocument;
    }

    public void setIdTypeDocument(long idTypeDocument) {
        this.idTypeDocument = idTypeDocument;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "TypeDocument{" +
                "idTypeDocument=" + idTypeDocument +
                ", descripcion='" + descripcion + '\'' +
                ", siglas='" + siglas + '\'' +
                '}';
    }
}

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fabricante")
public class Fabricante {

  private String idFabricante;
  private String nombre;
  private String domicilio;

  @Id
  @Column(name = "idFabricante")
  public String getIdFabricante() {
    return idFabricante;
  }

  @Column(name = "nombre")
  public String getNombre() {
    return nombre;
  }

  @Column(name = "domicilio")
  public String getDomicilio() {
    return domicilio;
  }
}

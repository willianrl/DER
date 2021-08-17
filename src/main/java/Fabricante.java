import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fabricante")
public class Fabricante {

  @Id
  @Column(name = "idFabricante")
  private String idFabricante;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "domicilio")
  private String domicilio;

  //CONSTRUCTOR

  public Fabricante(String idFabricante, String nombre, String domicilio) {
    this.idFabricante = idFabricante;
    this.nombre = nombre;
    this.domicilio = domicilio;
  }

  //GETTERS

  public String getIdFabricante() {
    return idFabricante;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDomicilio() {
    return domicilio;
  }

  //SETTERS

  public void setIdFabricante(String idFabricante) {
    this.idFabricante = idFabricante;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }
}

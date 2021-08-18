import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

  @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
  private List<Paleta> paletas = new ArrayList<>();

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

  public List<Paleta> getPaletas() {
    return paletas;
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

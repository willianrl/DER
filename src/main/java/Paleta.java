import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paleta")
public class Paleta {

  @Id
  @Column(name = "idPaleta")
  private String idPaleta;

  @Column(name = "grosor")
  private Float grosor;

  @Column(name = "idColor")
  private String idColor;

  @Column(name = "idFabricante")
  private String idFabricante;

  //CONSTRUCTOR

  public Paleta(String idPaleta, Float grosor, String idColor, String idFabricante) {
    this.idPaleta = idPaleta;
    this.grosor = grosor;
    this.idColor = idColor;
    this.idFabricante = idFabricante;
  }

  //GETTERS

  public String getIdPaleta() {
    return idPaleta;
  }

  public Float getGrosor() {
    return grosor;
  }

  public String getIdColor() {
    return idColor;
  }

  public String getIdFabricante() {
    return idFabricante;
  }

  //SETTETS

  public void setIdPaleta(String idPaleta) {
    this.idPaleta = idPaleta;
  }

  public void setGrosor(Float grosor) {
    this.grosor = grosor;
  }

  public void setIdColor(String idColor) {
    this.idColor = idColor;
  }

  public void setIdFabricante(String idFabricante) {
    this.idFabricante = idFabricante;
  }
}

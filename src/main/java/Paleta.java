import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paleta")
public class Paleta {

  private String idPaleta;
  private Float grosor;
  private String idColor;
  private String idFabricante;

  @Id
  @Column(name = "idPaleta")
  public String getIdPaleta() {
    return idPaleta;
  }

  @Column(name = "grosor")
  public Float getGrosor() {
    return grosor;
  }

  @Column(name = "idColor")
  public String getIdColor() {
    return idColor;
  }

  @Column(name = "idFabricante")
  public String getIdFabricante() {
    return idFabricante;
  }
}

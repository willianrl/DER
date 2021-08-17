import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cancha")
public class Cancha {

  private Long idCancha;
  private String nombre;
  private String idColor;
  private Boolean iluminacion;

  @Id
  @Column(name = "idCancha")
  public Long getIdCancha() {
    return idCancha;
  }

  @Column(name = "nombre")
  public String getNombre() {
    return nombre;
  }

  @Column(name = "idColor")
  public String getIdColor() {
    return idColor;
  }

  @Column(name = "iluminacion", updatable = false)
  public Boolean getIluminacion() {
    return iluminacion;
  }
}

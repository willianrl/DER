import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Color")
public class Color {

  private Long idColor;
  private String descripcion;

  @Id
  @Column(name = "idColor")
  public Long getIdColor() {
    return idColor;
  }

  @Column(name = "descripcion")
  public String getDescripcion() {
    return descripcion;
  }

}

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Color")
public class Color {

  @Id
  @Column(name = "idColor")
  private Long idColor;

  @Column(name = "descripcion")
  private String descripcion;

  //CONSTRUCTOR

  public Color(Long idColor, String descripcion) {
    this.idColor = idColor;
    this.descripcion = descripcion;
  }

  //GETTERS

  public Long getIdColor() {
    return idColor;
  }

  public String getDescripcion() {
    return descripcion;
  }

  //SETTERS

  public void setIdColor(Long idColor) {
    this.idColor = idColor;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}

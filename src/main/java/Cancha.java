import javax.persistence.*;

@Entity
@Table(name = "Cancha")
public class Cancha {

  @Id
  @Column(name = "idCancha")
  private Long idCancha;

  @Column(name = "nombre")
  private String nombre;

  @OneToOne(cascade = { CascadeType.ALL })
  @JoinColumn(name = "idColor")
  private Color color;

  @Column(name = "iluminacion", updatable = false)
  private Boolean iluminacion;

  //Contractor

  public Cancha(Long idCancha, String nombre, Color color, Boolean iluminacion) {
    this.idCancha = idCancha;
    this.nombre = nombre;
    this.color = color;
    this.iluminacion = iluminacion;
  }

  //GETTERS

  public Long getIdCancha() {
    return idCancha;
  }

  public String getNombre() {
    return nombre;
  }

  public Color getColor() {
    return color;
  }

  public Boolean getIluminacion() {
    return iluminacion;
  }

  //SETTERS

  public void setIdCancha(Long idCancha) {
    this.idCancha = idCancha;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(Color color) {
    this.color = color;
  }

}

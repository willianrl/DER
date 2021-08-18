import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cancha")
public class Cancha {

  @Id
  @Column(name = "idCancha")
  private Long idCancha;

  @Column(name = "nombre")
  private String nombre;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name= "idColor")
  private Color color;

  @Column(name = "iluminacion", updatable = false)
  private Boolean iluminacion;

  @OneToMany(mappedBy = "cancha", cascade = CascadeType.ALL)
  private List<Partido> partidos = new ArrayList<>();

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

  public List<Partido> getPartidos() {
    return partidos;
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

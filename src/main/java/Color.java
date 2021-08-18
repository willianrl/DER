import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Color")
public class Color {

  @Id
  @Column(name = "idColor")
  private Long idColor;

  @Column(name = "descripcion")
  private String descripcion;

  @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
  private List<Paleta> paletas = new ArrayList<>();

  @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
  private List<Cancha> canchas = new ArrayList<>();

  @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
  private List<JugadorPorPartido> jugadorPorPartidos = new ArrayList<>();

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

  public List<Paleta> getPaletas() {
    return paletas;
  }

  public List<Cancha> getCanchas() {
    return canchas;
  }

  public List<JugadorPorPartido> getJugadorPorPartidos() {
    return jugadorPorPartidos;
  }

  //SETTERS

  public void setIdColor(Long idColor) {
    this.idColor = idColor;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}

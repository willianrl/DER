import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Paleta")
public class Paleta {

  @Id
  @Column(name = "idPaleta")
  private String idPaleta;

  @Column(name = "grosor")
  private Float grosor;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idColor")
  private Color color;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idFabricante")
  private Fabricante fabricante;

  @OneToMany(mappedBy = "paleta", cascade = CascadeType.ALL)
  private List<JugadorPorPartido> jugadorPorPartido = new ArrayList<>();
  //CONSTRUCTOR

  public Paleta(String idPaleta, Float grosor, Color color, Fabricante fabricante) {
    this.idPaleta = idPaleta;
    this.grosor = grosor;
    this.color = color;
    this.fabricante = fabricante;
  }

  //GETTERS

  public String getIdPaleta() {
    return idPaleta;
  }

  public Float getGrosor() {
    return grosor;
  }

  public Color getColor() {
    return color;
  }

  public Fabricante getFabricante() {
    return fabricante;
  }

  public List<JugadorPorPartido> getJugadorPorPartido() {
    return jugadorPorPartido;
  }

  //SETTETS

  public void setIdPaleta(String idPaleta) {
    this.idPaleta = idPaleta;
  }

  public void setGrosor(Float grosor) {
    this.grosor = grosor;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setFabricante(Fabricante fabricante) {
    this.fabricante = fabricante;
  }
}

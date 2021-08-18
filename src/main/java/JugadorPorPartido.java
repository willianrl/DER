import javax.persistence.*;

@Entity
@Table(name = "JugadorPorPartido")
public class JugadorPorPartido {

  @Id
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPartido")
  private Partido partido;

  @Id
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idJugador")
  private Jugador jugador;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idPaleta")
  private Paleta paleta;

  //CONSTRUCTOR

  public JugadorPorPartido(Partido partido, Jugador jugador, Paleta paleta) {
    this.partido = partido;
    this.jugador = jugador;
    this.paleta = paleta;
  }

  //GETTERS

  public Partido getPartido() {
    return partido;
  }

  public Jugador getJugador() {
    return jugador;
  }

  public Paleta getPaleta() {
    return paleta;
  }

  //SETTERS

  public void setPartido(Partido partido) {
    this.partido = partido;
  }

  public void setJugador(Jugador jugador) {
    this.jugador = jugador;
  }

  public void setPaleta(Paleta paleta) {
    this.paleta = paleta;
  }
}

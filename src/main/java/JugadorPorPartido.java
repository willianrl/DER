import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JugadorPorPartido")
public class JugadorPorPartido {

  @Column(name = "idPartido")
  private String idPartido;

  @Column(name = "idJugador")
  private String idJugador;

  @Column(name = "idPaleta")
  private String idPaleta;

  //CONSTRUCTOR

  public JugadorPorPartido(String idPartido, String idJugador, String idPaleta) {
    this.idPartido = idPartido;
    this.idJugador = idJugador;
    this.idPaleta = idPaleta;
  }

  //GETTERS

  public String getIdPartido() {
    return idPartido;
  }

  public String getIdJugador() {
    return idJugador;
  }

  public String getIdPaleta() {
    return idPaleta;
  }

  //SETTERS

  public void setIdPartido(String idPartido) {
    this.idPartido = idPartido;
  }

  public void setIdJugador(String idJugador) {
    this.idJugador = idJugador;
  }

  public void setIdPaleta(String idPaleta) {
    this.idPaleta = idPaleta;
  }
}

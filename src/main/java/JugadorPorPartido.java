import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "JugadorPorPartido")
public class JugadorPorPartido {

  private String idPartido;
  private String idJugador;
  private String idPaleta;

  @Column(name = "idPartido")
  public String getIdPartido() {
    return idPartido;
  }

  @Column(name = "idJugador")
  public String getIdJugador() {
    return idJugador;
  }

  @Column(name = "idPaleta")
  public String getIdPaleta() {
    return idPaleta;
  }
}

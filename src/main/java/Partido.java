import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Partido")
public class Partido {


  @Id
  @Column(name = "idPartido")
  private String idPartido;

  @Column(name = "idCancha")
  private String idCancha;

  @Column(name = "inicioPartido")
  private LocalDateTime inicioPartido;

  @Column(name = "finPartido")
  private LocalDateTime finPartido;

  //CONSTRUCTOR

  public Partido(String idPartido, String idCancha, LocalDateTime inicioPartido, LocalDateTime finPartido) {
    this.idPartido = idPartido;
    this.idCancha = idCancha;
    this.inicioPartido = inicioPartido;
    this.finPartido = finPartido;
  }

  //GETTERS

  public String getIdPartido() {
    return idPartido;
  }

  public String getIdCancha() {
    return idCancha;
  }

  public LocalDateTime getInicioPartido() {
    return inicioPartido;
  }

  public LocalDateTime getFinPartido() {
    return finPartido;
  }

  //SETTERS

  public void setIdPartido(String idPartido) {
    this.idPartido = idPartido;
  }

  public void setIdCancha(String idCancha) {
    this.idCancha = idCancha;
  }

  public void setInicioPartido(LocalDateTime inicioPartido) {
    this.inicioPartido = inicioPartido;
  }

  public void setFinPartido(LocalDateTime finPartido) {
    this.finPartido = finPartido;
  }
}

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Partido")
public class Partido {

  private String idPartido;
  private String idCancha;
  private LocalDateTime inicioPartido;
  private LocalDateTime finPartido;

  @Id
  @Column(name = "idPartido")
  public String getIdPartido() {
    return idPartido;
  }

  @Column(name = "idCancha")
  public String getIdCancha() {
    return idCancha;
  }

  @Column(name = "inicioPartido")
  public LocalDateTime getInicioPartido() {
    return inicioPartido;
  }

  @Column(name = "finPartido")
  public LocalDateTime getFinPartido() {
    return finPartido;
  }
}

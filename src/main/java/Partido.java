import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Partido")
public class Partido {

  @Id
  @Column(name = "idPartido")
  private Long idPartido;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name= "idCancha")
  private Cancha cancha;

  @Column(name = "inicioPartido")
  private LocalDateTime inicioPartido;

  @Column(name = "finPartido")
  private LocalDateTime finPartido;

  @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL)
  private List<JugadorPorPartido> jugadorPorPartido = new ArrayList<>();

  //CONSTRUCTOR

  public Partido(Long idPartido, Cancha cancha, LocalDateTime inicioPartido, LocalDateTime finPartido) {
    this.idPartido = idPartido;
    this.cancha = cancha;
    this.inicioPartido = inicioPartido;
    this.finPartido = finPartido;
  }

  //GETTERS

  public Long getIdPartido() {
    return idPartido;
  }

  public Cancha getCancha() {
    return cancha;
  }

  public LocalDateTime getInicioPartido() {
    return inicioPartido;
  }

  public LocalDateTime getFinPartido() {
    return finPartido;
  }

  public List<JugadorPorPartido> getJugadorPorPartido() {
    return jugadorPorPartido;
  }

  //SETTERS

  public void setIdPartido(Long idPartido) {
    this.idPartido = idPartido;
  }

  public void setCancha(Cancha cancha) {
    this.cancha = cancha;
  }

  public void setInicioPartido(LocalDateTime inicioPartido) {
    this.inicioPartido = inicioPartido;
  }

  public void setFinPartido(LocalDateTime finPartido) {
    this.finPartido = finPartido;
  }
}

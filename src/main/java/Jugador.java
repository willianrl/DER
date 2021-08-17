import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Jugador")
public class Jugador {

  public String idJugador;
  public String nombre;
  public String apellido;
  public String direccion;
  public LocalDateTime fechaNacimiento;

  @Id
  @Column(name = "idJugador")
  public String getIdJugador() {
    return idJugador;
  }

  @Column(name = "nombre")
  public String getNombre() {
    return nombre;
  }

  @Column(name = "apellido")
  public String getApellido() {
    return apellido;
  }

  @Column(name = "direccion")
  public String getDireccion() {
    return direccion;
  }

  @Column(name = "fechaNacimiento")
  public LocalDateTime getFechaNacimiento() {
    return fechaNacimiento;
  }
}

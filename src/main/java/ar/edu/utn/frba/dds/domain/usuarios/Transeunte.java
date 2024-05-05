package ar.edu.utn.frba.dds.domain.usuarios;
import java.util.Objects;
import java.util.Scanner;
import ar.edu.utn.frba.dds.domain.viajes.Parada;
import ar.edu.utn.frba.dds.domain.viajes.Trayecto;

public class Transeunte extends Persona{
  public Boolean notificacionesActivas = true;
  public String direccionActual;
  public Trayecto trayecto;

  public Transeunte(String direccionActual, Boolean notificacionesActivas, Trayecto trayecto) {
    this.direccionActual = direccionActual;
    this.notificacionesActivas = notificacionesActivas;
    this.trayecto = trayecto;
  }

  public void solicitarTraslado(){
    System.out.println("Solicitando traslado");
    Scanner scanner = new Scanner(System.in);
    String respuesta = "s";
    while (Objects.equals(respuesta, "s")){
      System.out.println("Agregue la siguiente parada");
      Parada parada = new Parada();
      System.out.println("Ingrese la direccion de la parada:");
      parada.direccion = scanner.nextLine();
      System.out.println("Ingrese la demora de la parada:");
      parada.demora = scanner.nextInt();
      this.trayecto.agregarParada(parada);
      scanner.nextLine(); // Consumir el carácter de nueva línea pendiente
      System.out.println("Desea agregar otra parada? (s/n)");
      respuesta = scanner.nextLine();
    }
   this.trayecto.calcularDemora();

  }

}

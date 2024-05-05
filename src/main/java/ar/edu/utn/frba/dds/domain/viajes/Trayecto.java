package ar.edu.utn.frba.dds.domain.viajes;

import java.util.ArrayList;
import java.util.List;

public class Trayecto {
  public List<Parada> paradas = new ArrayList<Parada>();
  public Boolean seDentendraEnCadaParada;

  public Trayecto(List<Parada> paradas, Boolean seDentendraEnCadaParada) {
    this.paradas = paradas;
    this.seDentendraEnCadaParada = seDentendraEnCadaParada;
  }

  public void agregarParada(Parada parada) {
  this.paradas.add(parada);}

public void calcularDemora(){
  if (seDentendraEnCadaParada) {
    paradas.forEach(parada -> System.out.println("La demora en la parada " + parada.direccion + " es de " + parada.demora + " minutos"));
}
    Integer demora = 0;
    for (Parada parada : paradas) {
      demora += parada.demora;
    }
    System.out.println("La demora total es de " + demora + " minutos");
}

}

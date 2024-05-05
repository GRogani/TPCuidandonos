package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.usuarios.Transeunte;
import ar.edu.utn.frba.dds.domain.viajes.Trayecto;
import ar.edu.utn.frba.dds.domain.viajes.Parada;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Trayecto trayecto = new Trayecto(new ArrayList<Parada>(), true);
    Transeunte alyster = new Transeunte("Av. Rivadavia 1234",true, trayecto);
    alyster.solicitarTraslado();
  }
}

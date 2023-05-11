import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
  private String nombre;
  private ArrayList<Jugador> jugadores;

  public Equipo(final String nombre) {
    this.nombre = nombre;
    this.jugadores = new ArrayList();
  }

  public String getNombre() {
    return nombre;
  }

  public void addJugador (Jugador jugador) {

    this.jugadores.add(jugador);
  }

  public ArrayList<Jugador> getJugadores() {

    return jugadores;
  }

  public void mostrarJugadoresTitulares(){

     Collections.sort(jugadores);
     for(Jugador j: this.jugadores){
       if(j.isTitular()){
         System.out.println("Jugador: " + j.getNombre() + " N " + j.getNroCamiseta());;
       }
     }
  }

  public int getCantidadJugadoresLesionados() {
    int jugadoresLesionados = 0;
    for (Jugador jugador : this.jugadores) {
      if (jugador.isLesionado()) {
        jugadoresLesionados++;
      }
    }
    return jugadoresLesionados;
  }
}

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Jugador messi = new Jugador(10, "Lio", false, true);
    Jugador falcao = new Jugador(9, "Radamel", false, true );
    Jugador suarez = new Jugador(11, "Luis", true, true);

    Equipo laMejorCamada = new Equipo("laMejorCamada");

    laMejorCamada.addJugador(messi);
    laMejorCamada.addJugador(falcao);
    laMejorCamada.addJugador(suarez);

    ArrayList<Jugador> listaJugadores = laMejorCamada.getJugadores();

    //for each si hay que recorrer la totalidad y for cuando solo es una porcion
    for (Jugador jugador : listaJugadores) {
      System.out.println("Jugador" + " " + jugador.getNombre());
    }

    laMejorCamada.mostrarJugadoresTitulares();
    System.out.println(laMejorCamada.getCantidadJugadoresLesionados());

  }
}
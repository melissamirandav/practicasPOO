package mesaTrabajo;

import java.util.Scanner;

public class Mdt3 {

    //desafio 1 Y 2
    private static int cualGana(String jugada1, String jugada2){
        if(jugada1 == jugada2){
            return 0;
        }
        String jugadaGanadora = jugadaGanadora(jugada1, jugada2);
        return jugadaGanadora==jugada1?1:2;
    }


    private static String jugadaGanadora(String jugada1, String jugada2){
        if(("PIEDRA".equals(jugada1) || "PIEDRA".equals(jugada2)) && ("TIJERA".equals(jugada2)) ||"TIJERA".equals(jugada1)){
            return "PIEDRA";
        }
        if(("PIEDRA".equals(jugada1) || "PIEDRA".equals(jugada2)) && ("PAPEL".equals(jugada2)) ||"PAPEL".equals(jugada1)){
            return "PAPEL";
        }
        if(("TIJERA".equals(jugada1) || "TIJERA".equals(jugada2)) && ("PAPEL".equals(jugada2)) ||"PAPEL".equals(jugada1)){
            return "TIJERA";
        }
        if(("SPOCK".equals(jugada1) || "SPOCK".equals(jugada2)) && ("PAPEL".equals(jugada2)) ||"PAPEL".equals(jugada1)){
            return "PAPEL";
        }

        return "SPOCK";
    }


    private static String capturarDatos(String nombreJugador, Scanner scanner){
        System.out.println("Elige opcion de juego" + nombreJugador);
        System.out.println("1. PIEDRA");
        System.out.println("2. PAPEL");
        System.out.println("3. TIJERA");
        System.out.println("4. SPOCK");
        System.out.println("5. FINALIZAR JUEGO");

        int opcionSeleccionada = scanner.nextInt();
        switch (opcionSeleccionada){
            case 1:
                return "PIEDRA";
            case 2:
                return "PAPEL";
            case 3:
                return "TIJERA";
            case 4:
                return "SPOCK";
            default:
                return "*";
        }

    }

    public static void main(String[] args) {

        String nombreJugador1;
        String nombreJugador2;
        Scanner scanner = new Scanner(System.in);

        int empate = 0;
        int ganaJugador1 = 0;
        int ganaJugador2 = 0;

        System.out.println("Ingresa el nombre del jugador 1");
        nombreJugador1 = scanner.nextLine();

        System.out.println("Ingresa el nombre del jugador 2");
        nombreJugador2 = scanner.nextLine();

        do {
            String obtenerDatosJugador1 = capturarDatos(nombreJugador1, scanner);
            if (obtenerDatosJugador1.equals("*")) {
                break;
            }
            String obtenerDatosJugador2 = capturarDatos(nombreJugador2, scanner);
            if (obtenerDatosJugador2.equals("*")) {
                break;
            }
            int ganador = cualGana(obtenerDatosJugador1,obtenerDatosJugador2);

            if(ganador == 0){
                empate++;
            } else if (ganador == 1) {
                ganaJugador1++;

            }
            else {
                ganaJugador2++;
            }
            System.out.println("Cantidad de juegos empatados:" + empate);
            System.out.println("Cantidad de juegos ganados Jugador 1:" + nombreJugador1 + " " + ganaJugador1);
            System.out.println("Cantidad de juegos ganados Jugador 2:" + nombreJugador2 + " " + ganaJugador2);
        }
        while (true);

    }




}

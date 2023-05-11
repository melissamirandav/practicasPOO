package mesaTrabajo;

public class Main {

    public static void main (String[] args){
        //Mesa de trabajo 1 - ejercicio 1
        Mdt1 mesaTrabajo1 = new Mdt1();
        System.out.println(mesaTrabajo1.esPrimo(4));
        // ejercicio 2
        System.out.println(mesaTrabajo1.maximoEntreTresNumeros(4, 5, 6));
        //ejercicio 3
        System.out.println(mesaTrabajo1.cadenasDeTextoDistintas("Anahi", "Ana"));

    }
}

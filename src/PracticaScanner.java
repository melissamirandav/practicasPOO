import java.util.Scanner;

public class PracticaScanner {

    public static void main (String[] args){
        //Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        //una tercera tus iniciales.

        Scanner lector = new Scanner(System.in);
        String name;
        String lastName;
        String iniciales;

        System.out.println("Ingresa tu nombre:= ");
        name = lector.nextLine();

        System.out.println("Ingresa tu apellido:");
        lastName = lector.nextLine();

        iniciales = name.charAt(0) + "" + lastName.charAt(0);
        System.out.println(iniciales);

    }
}

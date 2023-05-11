package mesaTrabajo;

import java.util.Scanner;

public class Md3_Desafio3 {

    private static boolean esPrimo(int numeroEvaluar){
        for(int i=2; i<numeroEvaluar; i++){
            if (numeroEvaluar % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros primos que desee ver:");
        int n = scanner.nextInt();

        int contador = 0;
        int numeroEvaluar = 1;

        while(contador <= n){
            boolean esPrimo = esPrimo(numeroEvaluar);


            if(esPrimo){
                contador++;
                System.out.println("El primo numero " + contador + " es " + numeroEvaluar );
            }
            numeroEvaluar++;
        }
    }
}

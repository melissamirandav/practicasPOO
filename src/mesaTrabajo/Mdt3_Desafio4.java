package mesaTrabajo;

import java.util.Scanner;

public class Mdt3_Desafio4 {

    private static double calcularSueldoSemanal(int horasLaboradas){
        int valorHora = 875;
        double sueldo = valorHora * horasLaboradas;

        if(horasLaboradas > 40){
            double valorHoraExtra = valorHora * 0.5;
            int numeroHorasExtras = horasLaboradas - 40;
            double calculoHorasExtras = numeroHorasExtras * valorHoraExtra;
            sueldo = sueldo + calculoHorasExtras;
        }
        return sueldo;
    }

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas horas laboro en la semana?");
        int horasLaboradas = scanner.nextInt();

        System.out.println("Su sueldo semanal es de: " + calcularSueldoSemanal(horasLaboradas));


    }
}

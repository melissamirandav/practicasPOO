package mesaTrabajo;

public class Mdt1 {

    public boolean esDivisible(int numero1, int numero2) {

        return numero1 % numero2 == 0;
    }

    public boolean esPrimo(int num1) {
        for (int i = 2; i < num1; i++) {
            if (esDivisible(num1, i)) {
                return false;
            }
        }
        return true;
    }


    //Otra opcion
    public Integer maximo(int num1, int num2) {
        return num1 < num2 ? num2 : num1;
    }

    //ejercicio 3
    public boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.toLowerCase().equals(unTextoB.toLowerCase());
    }


    // ejercicio 2
    public Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
            unNumeroC) {
        Integer numeroMayor = maximo(unNumeroA, unNumeroB);
        return maximo(numeroMayor, unNumeroC);
    }
}
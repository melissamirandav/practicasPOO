
    public class PracticaTipoClasesEj2 {
        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.

        public  static void main(String[] args){
            Integer valor1 = 1234;
            Integer valor2 = 123;
            int comparar;

            if(valor1.equals(valor2)){
                System.out.println("Son iguales");
            }
            else{
                comparar=valor1.compareTo(valor2);
                if(comparar>0){
                    System.out.println("valor1 es mayor que valor2");
                }
                else{
                    System.out.println("valor1 es menor que valor2");
                }
            }
        }


    }


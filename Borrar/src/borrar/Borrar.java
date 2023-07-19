package borrar;

public class Borrar {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 0, 0};
        String[] nombres = new String[5];
        int cargadas = 0;
        int cargadas2 = 0;

        // Vector numeros
        System.out.println("Total de Celdas: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] != 0) {
                cargadas++;
            }

        }

        //Vector nombres
        System.out.println("Total de Celdas: " + nombres.length);
        nombres[0] = "Marcelo";
        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i] != null) {
                cargadas2++;
            }

        }

        System.out.println("Total de datos Cargados numericos: " + cargadas);
        System.out.println("Total de datos Cargados nombres: " + cargadas2);
    }

}

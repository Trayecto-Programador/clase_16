/**
 * Se tienen las notas del primer parcial de los alumnos de dos cursos,
 * Matemática y el Física, cada curso cuenta con 5 alumnos. Realizar un
 * programa que muestre el curso que obtuvo el mayor promedio general.
 */
package actividad01;

public class Actividad01 {

    public static void main(String[] args) {
        // Declaracion e Inicializacion de variables
        int[] notasMatematica = {10, 9, 8, 7, 6};
        int[] notasFisica = {10, 9, 8, 7, 6};
       
        //Declaracion de variables
        double promedioMatematica, promedioFisica;
        int totalMatematicas, totalFisica;
        
        //Inicializacion de Variables
        totalMatematicas = 0;
        totalFisica = 0;
       
        //Calcular los totales de Matematicas
        for (int i = 0; i < notasMatematica.length; i++) {
            totalMatematicas = totalMatematicas + notasMatematica[i];

        }

        //Calcular los totales de Fisica
        for (int i = 0; i < notasFisica.length; i++) {
            totalFisica = totalFisica + notasFisica[i];

        }
        
          
        
        // comparar los promedios 
        promedioMatematica = totalMatematicas / notasMatematica.length;
        promedioFisica = totalFisica / notasFisica.length;

        if (promedioFisica > promedioMatematica) {
            System.out.println("El curso de Fisica obtuvo el mejor promedio General " + promedioFisica);
        } else {
            if(promedioMatematica > promedioFisica){
                System.out.println("El curso de Matematica obtuvo el mejor promedio General " + promedioMatematica);
            } else{
                System.out.println("Ninguno de los cursos obtuvo el mejor promedio");
            }
            
        }
    }

}

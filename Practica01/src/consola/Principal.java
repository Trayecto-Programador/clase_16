/**
 * Ingresar los nombres de 5 empleados con sus respectivos sueldos
 * Calcular y Mostrar lo siguiente:
 * Mostrar nomina de sueldos de los empleados con sus nombres
 * Total de sueldo (sumatoria)
 * Primer Sueldo
 * Ultimo Sueldo
 * Mayor Sueldo
 * Menor Sueldo
 * Cantidad de Empleados
 * Promedio de Sueldos
 * Reemplazar el sueldo del segundo empleado
 */
package consola;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        //Declaracion de Variables
        int totalSueldos, longitud, cantidadEmpleados, mayorSueldo, menorSueldo;
        int[] sueldos;
        double promedio;
        String[] nombres;

        // Asignacion de Variables
        totalSueldos = 0;
        cantidadEmpleados = 0;
        promedio = 0;
        menorSueldo = 0;
        mayorSueldo = 0;
        longitud = 5;
        sueldos = new int[longitud];
        nombres = new String[longitud];

        // carga de Datos
        for (int i = 0; i < longitud; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado  " + (i + 1));
            sueldos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado - " + (i + 1)));
        }

        // Mostrar nomnina de Empleados
        System.out.println("<----Nomina de Empleados---->");
        for (int i = 0; i < longitud; i++) {
            System.out.println((i + 1) + " - Empleado: " + nombres[i]);
            System.out.println((i + 1) + "  - Sueldo: " + sueldos[i]);

        }
        System.out.println("");
        
        //Total de sueldos
        for (int i = 0; i < longitud; i++) {
            totalSueldos = totalSueldos + sueldos[i];

        }

        //Primer sueldo
        System.out.println("Primer sueldo: " + sueldos[0]);

        // Ultimo sueldo
        System.out.println("Ultimo Sueldo: " + sueldos[longitud - 1]);

        // Menor Sueldo
        for (int i = 1; i < longitud; i++) {
            menorSueldo = sueldos[0];
            if (menorSueldo > sueldos[i]) {
                menorSueldo = sueldos[i];
            }
        }
        // Mayor Sueldo
        for (int j = 0; j < longitud; j++) {
            if (mayorSueldo < sueldos[j]) {
                mayorSueldo = sueldos[j];
            }
        }

        // Cantidad de empleados
        cantidadEmpleados = longitud;

        // Promedio de Sueldos
        promedio = totalSueldos / cantidadEmpleados;

        //Reemplazar el sueldo del segundo empleados
        sueldos[1] = 75000;

        // Mostrar Datos
        System.out.println("Total de Sueldos: " + totalSueldos);
        System.out.println("Menor Sueldo: " + menorSueldo);
        System.out.println("Mayor Sueldo: " + mayorSueldo);
        System.out.println("Cantidad de Empleados: " + cantidadEmpleados);
        System.out.println("Promedio de Sueldos: " + promedio);
        System.out.println("Nuevo sueldo empleado 2: " + sueldos[1]);

    }

}

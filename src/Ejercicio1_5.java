
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */

/*5. Codifica un programa Java que lea un array con las notas de Programación de 20 alumnos, y que escriba :
- Nota media de la asignatura.
- Porcentaje de aprobados
- Cuantas notas inferiores a 2.
- Si ha habido algún 10.
*/

public class Ejercicio1_5 {

    static Scanner tec = new Scanner(System.in);

    static double[] leerArray() {

        double[] listaNotas = new double[20];   // Modificar aqui para el rango del array

        for (int i = 0; i < listaNotas.length; i++) {

            do {
                System.out.println("Dame notas, debe estar entre 0 y 10 ");
                listaNotas[i] = tec.nextDouble();
                if (listaNotas[i] < 0 || listaNotas[i] > 10) {         // VALIDACIÓN
                    System.out.println("NOTA ERRÓNEA, debe estar entre 0 y 10");
                }

            } while (listaNotas[i] < 0 || listaNotas[i] > 10);

        }
        return listaNotas;
    }

    static void notaMedia(double[] lista) {

        double sumNotas = 0;
        

        for (int i = 0; i < lista.length; i++) {

            sumNotas += lista[i];

        }
        System.out.println("La nota media de la clase es de " + (sumNotas / lista.length));

    }

    static void porcentajeAprobados(double[] lista) {

        int contAprobados = 0;
       

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] >= 5) {
                contAprobados++;
            }

        }

        System.out.println("El porcentaje de aprobados es de " + ((contAprobados * 100) / lista.length) + "%" + " lo que quiere decir que han aprobado " + contAprobados + " alumnos, de un total de " + lista.length + " alumnos.");

    }

    static void notaMenorDos(double[] lista) {

        int contDos = 0;
        

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] < 2) {
                contDos++;
            }

        }

        System.out.println("Hay " + contDos + " notas inferiores a 2.");

    }

    static void notaDiez(double[] lista) {

        boolean hayDiez = false;
        

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] == 10) {

                hayDiez = true;  // mira si hay diez
            }

        }

        if (hayDiez = true) {

            System.out.println("Hay algún 10.");    // solo se pide si hay algun diez, no cuantos. PAra saber cuantos, se mete un contador y listo.
        } else {
            System.out.println("No hay ningún 10.");
        }

    }

    public Ejercicio1_5() {

        double notas[] = leerArray();
        notaMedia(notas);
        porcentajeAprobados(notas);
        notaMenorDos(notas);
        notaDiez(notas);

    }

    public static void main(String[] args) {

        Ejercicio1_5 RandomName = new Ejercicio1_5();

    }

}

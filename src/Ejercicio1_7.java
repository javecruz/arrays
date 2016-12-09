
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

/*7. Carga un vector de 15 elementos T(I) y a partir de él crea otro N(J) de 15 elementos de la siguiente forma:
N(1) = T(1)
N(2) = T(1) + T(2)
:
N(15) = T(1) + T(2) + T(3)+ ….T(15)*/
public class Ejercicio1_7 {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNum = new int[5];   // CAMBIAR RANGO PARA LA LISTA, pongo 5 para comprobar que va bien.

        for (int i = 0; i < listaNum.length; i++) {

            System.out.println("Dame el numero de la posicion " + (i + 1));
            listaNum[i] = tec.nextInt();
        }

        System.out.println("LISTA ORIGINAL:");
        for (int i = 0; i < listaNum.length; i++) {
            System.out.println(listaNum[i]);
        }

        return listaNum;
    }

    static void proceso(int[] vector) {

        int i = 0;
        int j = 0;

        int[] vectorFinal = new int[vector.length];

        for (i = 0; i < vector.length; i++) {
            for (j = 0; j < i + 1; j++) {
                vectorFinal[i] += vector[j];
            }

        }
        
        System.out.println("LISTA DEFINITIVA:");
        for (i = 0; i < vectorFinal.length; i++) {
            System.out.println(vectorFinal[i]);
        }
    }

    public Ejercicio1_7() {

        int[] listaDeNumeros = leerArray();
        proceso(listaDeNumeros);
    }

    public static void main(String[] args) {

        Ejercicio1_7 RandomName = new Ejercicio1_7();

    }

}

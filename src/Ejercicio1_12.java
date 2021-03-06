
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AlumMati
 */

/*12.
Codifica un programa Java que lea un array de 10 elementos v[ ] .
•
Crea un array nuevo con los 5 primeros elementos del array v[].
•
Visualiza el array v ordenado.
•
Busca un valor en el array ordenado, utilizando la búsqueda binaria.*/
public class Ejercicio1_12 {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNumeros = new int[10];   // Modificar aqui para el rango del array
        Random rnd = new Random();
        
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) (rnd.nextDouble() * 100 + 0);
            //System.out.println("Dame el numero " + (i + 1));
            //listaNumeros[i] = tec.nextInt();

        }
        System.out.println("LISTA ORIGINAL");           // visualizo para poder ver que esta todo bien al ejecutarlo..
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);
        }
        return listaNumeros;
    }

    static void arrayCorto(int[] primerArray) {

        int[] listaCorta = new int[5];

        for (int i = 0; i < listaCorta.length; i++) {   // me crea un array de 5 valores a partir del segundo.
            listaCorta[i] = primerArray[i];
        }
        System.out.println("LISTA CORTA DE " + listaCorta.length + " ELEMENTOS.");
        for (int i = 0; i < listaCorta.length; i++) {
            System.out.println(listaCorta[i]);              // visualizo para comparar con el original y ver que todo está bien..

        }

    }

    static int[] ordenarArrayOriginal(int[] arrayOriginal) {

        int[] arrayOrdenado = new int[arrayOriginal.length];

        
        for (int i = 0; i < arrayOriginal.length; i++) {           // quiero mantener el array Ordenado, asi que creo otro igual que será el que modificaré
            arrayOrdenado[i] = arrayOriginal[i];
        }

        for (int i = 0; i < (arrayOrdenado.length-1); i++) {
            for (int j = (i+1); j < arrayOrdenado.length; j++) {
                if (arrayOrdenado[i] > arrayOrdenado[j]) {
                    int aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = aux;
                }

            }

        }
        System.out.println("LISTA ORDENADA");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }

        return arrayOrdenado;
    }

    static boolean buscarNumero(int[] listaOrdenada) {

        
        
        int low = 0;
        int high = listaOrdenada.length - 1;
        boolean encontrado = false;
        
        System.out.println("Dame el número a buscar");
        int key = tec.nextInt();

        while (high >= low) {
            int middle = (low + high) / 2;
            if (listaOrdenada[middle]==key) {
            return true;
            }
            else if (listaOrdenada[middle] < key) {
                low = middle + 1;

            } else {
                
                    high = middle -1;
            }
        }
        
        return false;

    }

    static public void imprimirBuscar(boolean aux) {
    
    if(aux==true) {
        System.out.println("El número buscado SÍ se encuentra en la lista");
    }
    else {
        System.out.println("El número buscado NO está en la lista.");
    }
    
    
    }
    
    public Ejercicio1_12() {

        int[] listaDeNumeros = leerArray();
        arrayCorto(listaDeNumeros);
        int[] listaDeNumerosOrdenados = ordenarArrayOriginal(listaDeNumeros);
        boolean aux = buscarNumero(listaDeNumerosOrdenados);
        imprimirBuscar(aux);
    }

    public static void main(String[] args) {
        Ejercicio1_12 RandomName = new Ejercicio1_12();

    }

}

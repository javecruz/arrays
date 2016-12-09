
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



/*Escribir un método que reciba un array y un número entero y devuelva cuántas veces aparece ese número en el
array.*/
public class Ejercicio1_9 {
    
    static Scanner tec = new Scanner(System.in);
    
    static int[] leerArray() {

        int[] listaNumeros = new int[10];   // Modificar aqui para el rango del array

        for (int i = 0; i < listaNumeros.length; i++) {

           
                System.out.println("Dame el numero " + (i+1));
                listaNumeros[i] = tec.nextInt();
                
        }
        return listaNumeros;
    }
    
    static int leerNumero() {
    int num;
        System.out.println("Dame el número entero.");
        num = tec.nextInt();
    
    return num;

    }
    
    static int proceso (int[] lista, int numero) {
    
    int i;
    int cont = 0;
    
    for (i=0;i<lista.length;i++) {
    
    if(lista[i]==numero) {
    cont++;
    }
    
    }
    
    
    return cont;
   
    }
    
    static void imprimir(int num, int cont) {
        System.out.println("EL número " + num + " aparece " + cont + " veces.");
    
    }
    
    
    public Ejercicio1_9() {
    int listaDeNumeros[] = leerArray();
    int buscarNum = leerNumero();
    int vecesNumero = proceso(listaDeNumeros, buscarNum);
    imprimir(buscarNum, vecesNumero);
    
    }
    
    
    public static void main(String[] args) {
    
    Ejercicio1_9 RandomName = new Ejercicio1_9();
    
    
    }
    
}

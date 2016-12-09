
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
/*6. Desarrolla un algoritmo que cargue un vector de 30 elementos y cambie el mayor elemento a la posición del menor
y el menor a la posición del mayor.*/
public class Ejercicio1_6 {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNum = new int[10];   // se pone 30, tengo menos, para las pruebas
       int i;
        for (i = 0; i < listaNum.length; i++) {

            System.out.println("Dame el numero de la posicion " + (i + 1));
            listaNum[i] = tec.nextInt();
        }
        System.out.println("Lista Original");
        
        for(i=0;i<listaNum.length;i++) {
            System.out.println(listaNum[i]);
        }

        return listaNum;
    }

    static void proceso(int[] lista) {

        
        int i;
        int minimo = 0;
        int minPos = 0;
        int maximo = 0;
        int maxPos = 0;

        for (i = 0; i < lista.length; i++) {

            if (i == 0) {
                minimo = lista[0];
                minPos = i;
                maximo = lista[0];
                maxPos = i;
            }

            if (minimo > lista[i]) {
                minimo = lista[i];
                minPos = i;
            }

            if (maximo < lista[i]) {
                maximo = lista[i];
                maxPos = i;
            }

        }

        lista[minPos] = maximo;   // INTERCAMBIO VALORES
        lista[maxPos] = minimo;
        
        System.out.println("Lista DEFINITIVA");
        for (i = 0;i<lista.length;i++) {
            System.out.println(lista[i]);  
        }
    }
    
    
    public Ejercicio1_6() {
    
    int[] listaDeNumeros = leerArray();
    proceso(listaDeNumeros);
    
    }
    
    public static void main(String[] args) {
    Ejercicio1_6 RandomName = new Ejercicio1_6();
    }
    
    

}

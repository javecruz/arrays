
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
/*Escribir un método que saque por pantalla el mayor y el menor elemento de un array que recibe como parámetro.*/
public class Ejercicio1_11 {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNumeros = new int[10];   // Modificar aqui para el rango del array

        for (int i = 0; i < listaNumeros.length; i++) {

            System.out.println("Dame el numero " + (i + 1));
            listaNumeros[i] = tec.nextInt();

        }
        System.out.println("LISTA:");
        for (int i=0;i<listaNumeros.length;i++){
            System.out.println(listaNumeros[i]);
        }
        return listaNumeros;
    }

    static void proceso(int[] listaNum) {

        int max = 0;
        int min = 0;

        for (int i = 0; i < listaNum.length; i++) {

            if (i == 0) {
                max = listaNum[i];
                min = listaNum[i];
            } else {

                if (max < listaNum[i]) {    // mira si el max es menor al número del array y lo cambia
                    max = listaNum[i];
                }
                if (min > listaNum[i]) {    // idem, pero con min.
                    min = listaNum[i];
                }
            }

        }

        
        System.out.println("El valor mínimo del array es " + min);
        System.out.println("El valor máximo del array es " + max);
        
        
    }
    
    
    public Ejercicio1_11() {
    
    int[] listaDeNumeros = leerArray();
    proceso(listaDeNumeros);
    
    }
    
    public static void main(String[] args) {
    
    Ejercicio1_11 RandomName = new Ejercicio1_11();
    
    }
    

}

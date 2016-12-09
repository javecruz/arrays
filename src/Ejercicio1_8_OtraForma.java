
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


/*
Introducir una secuencia de 50 números, cuyos valores están comprendidos entre 1 y 10. Queremos saber al final
que números del 1 al 10 no han sido introducidos.
*/
public class Ejercicio1_8_OtraForma {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNumeros = new int[15];   // Modificar aqui para el rango del array

        for (int i = 0; i < listaNumeros.length; i++) {

            do {
                System.out.println("Dame el numero " + (i + 1));
                listaNumeros[i] = tec.nextInt();
                if (listaNumeros[i] < 1 || listaNumeros[i] > 10) {         // VALIDACIÓN
                    System.out.println("NUMERO ERRÓNEO, debe estar entre 1 y 10");
                }

            } while (listaNumeros[i] < 1 || listaNumeros[i] > 10);

        }
        return listaNumeros;
    }

    static void proceso(int[] lista) {

        int[] listaDeNumeros = lista;
        boolean[] valores = new boolean[10]; // me servirá para comprobar los valores del 1 al 10.
        int i;

        for (i = 0; i < valores.length; i++) {  // inicializo el array de boolean a false.
            valores[i] = false;
        }

        for (i = 0; i < listaDeNumeros.length; i++) {   // me pone en true los valores encontrados
            valores[listaDeNumeros[i]-1] = true;   // 
        }

        for (i = 0; i < valores.length; i++) {    // mira que valores estan en false y los imprime
            if (valores[i] == false) {

                System.out.println("El número " + (i + 1) + " no está en la lista.");   // i +1 porque son valores del 1 al 10, y el el rango del array es 0 a 9.

            }

        }

    }

    public Ejercicio1_8_OtraForma() {
    
    int lista[] = leerArray();
    proceso(lista);
    
    }
    
    
    public static void main(String[] args) {
    
    Ejercicio1_8_OtraForma RandomName = new Ejercicio1_8_OtraForma();
    
    }
    
}

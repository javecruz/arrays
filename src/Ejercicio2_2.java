
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Javi
 */

/*2. Partiendo de una matriz de 10x10 :
a) Visualiza los elementos de la diagonal secundaria.
b) Busca el mayor elemento e indica en qué columna se encuentra.
c) Intercambia los elementos de la fila 8 por los de la fila 3*/
public class Ejercicio2_2 {

    public int[][] leerMatriz() {

        int[][] m = new int[10][10];   // Modificar aqui para el rango del array
        Random rnd = new Random();
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (rnd.nextDouble() * 89 + 10);        // rango de números = 10-99        
            }
        }

        System.out.println("LISTA ORIGINAL:");
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.println("");
        }

        return m;
    }

    public void verDiagonalSecundaria(int[][] matriz) {

        System.out.println("\nLISTA CON DIAGONAL SECUNDARIA");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                if ((i + j) + 1 == matriz.length) {

                    System.out.print(matriz[i][j] + "  ");
                } else {
                    System.out.print("XX  ");
                }

            }
            System.out.println("");
        }

    }

    public void buscaMayor(int[][] matriz) {

        int col = 0; // var columna que tendrá el mayor valor.
        int max = 0; // var que tendra el número más alto

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                if (i == 0 && j == 0) {  // inicializo variables al primer valor de la matriz
                    max = matriz[i][j];
                    col = j + 1;     // columna 0 es igual a columna 1.
                } else if (max < matriz[i][j]) {
                    max = matriz[i][j];
                    col = j + 1;
                }

            }

        }
            System.out.println("\nEl valor más alto es de " + max + " que está en la columna " + col + ".");
    }
    
    public void cambiarFilas(int[][] matriz) {
    
    int[] arrayAux = new int[10]; // me va a servir de array auxiliar para guardar los numeros de 1 fila para que al copiarlos luego no se me borren.
    
    
    for(int i=0;i<matriz.length;i++){
    arrayAux[i] = matriz[2][i]; // ahora arrayAux tendra guardada la fila 3 de matriz. 
    }
    
    for(int i=0;i<matriz.length;i++) {      // aqui ya intercambio valores
    matriz[2][i] = matriz[7][i];            
    matriz[7][i] = arrayAux[i];

    }
    
    System.out.println("\nLISTA CON FILAS INTERCAMBIADAS:");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }
    
    
    public Ejercicio2_2() {
    
        int[][] matriz = leerMatriz();
        verDiagonalSecundaria(matriz);
        buscaMayor(matriz);
        cambiarFilas(matriz);
    
    }
    
    public static void main(String[] args) {
    
        Ejercicio2_2 RandomName = new Ejercicio2_2();
    }

}

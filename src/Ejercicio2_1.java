
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
/*1. Codifica un programa Java que lea una matriz de 10 x 10 y :
a) Visualice los elementos de la diagonal principal.
b) Visualice la suma de sus filas.
c) Ponga a 0 los elementos de la columna 7.*/
public class Ejercicio2_1 {

    static Scanner tec = new Scanner(System.in);

    public int[][] leerMatriz() {

        int[][] m = new int[10][10];   // Modificar aqui para el rango del array, el ejercicio pide más, pero para comprobarlo pongo menos..
        Random rnd = new Random();
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int)(rnd.nextDouble() * 10 + 0);        // asi no tengo que meter 100 números, me crea uno aleatorio de 0 a 99
                // m[i][j] = tec.nextInt();          // no valido, no lo pide.
            }
        }
        
        System.out.println("LISTA ORIGINAL:");
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                  System.out.print(m[i][j]+ "  ");
            }
            System.out.println("");
        }
        
        
        
        
        return m;
    }

    public void verDiagonal(int[][] matriz) {

        
        System.out.println("LISTA CON DIAGONALES");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if(j!=i) {
                System.out.print("X  "); 
                }
                else{
                    System.out.print(matriz[i][j] + "  ");
                }
                                             // escribe las diagonales con la forma de la matriz dejando en blanco los demás huecos.
            }
            System.out.println("");
        }

    }

    public void sumaFilas(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; i++) {
                
                    sum += matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es de " + sum);    //imprimo por pantalla el resultado de cada fila
            sum = 0;  //reinicio
        }
        
    }
    
    
    public void ponerAcero(int[][] matriz) {
    
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; i++) {
                if(j==6) {  // columna 7 es indice 6.
                    
                    matriz[i][j]=0;  // pongo a cero la columna 7
                    
                }
            }
                    
            }
        System.out.println("LISTA CON 0 EN LA SÉPTIMA COLUMNA");
            for(int i = 0;i<matriz.length;i++) {
                for (int j=0;i<matriz[i].length;j++){
                    System.out.print(matriz[i][j] + "  ");
                
                }
            
                  System.out.println("");
            }
    
    
    }
    
    
    public Ejercicio2_1() {
    
    int[][] matriz = leerMatriz();
    verDiagonal(matriz);
    sumaFilas(matriz);
    ponerAcero(matriz);
    
    
    }
    
    public static void main(String[] args) {
    
    Ejercicio2_1 RandomName = new Ejercicio2_1();
    }

}

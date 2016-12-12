
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AlumMati
 */

/*Codifica un programa que pida los datos de una matriz de dimensiones n X n, y compruebe
si la matriz forma un cuadrado mágico (es decir si todas las filas suman el mismo número y
todas las columnas también, y además ese número coincide con el de las filas). Debéis
crear los métodos que consideréis oportunos.*/
public class Ejercicio2_4 {

    public int[][] leerMatriz() {

        int[][] m = new int[10][10];   // Modificar aqui para el rango del array
        Random rnd = new Random();
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (rnd.nextDouble() * 10 + 0);        // asi no tengo que meter 100 números, me crea uno aleatorio de 0 a 9
                // m[i][j] = tec.nextInt();          // no valido, no lo pide.
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

    public int sumFila(int[][] matriz) {

        // metodo que me va a devolver la suma de la primera fila del array.
        int sumFila = 0;

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                sumFila += matriz[i][j];
            }

        }
        return sumFila;
    }

    public int sumCol(int[][] matriz) {

        // metodo que me va a devolver la suma de la primera fila del array.
        int sumCol = 0;

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                sumCol += matriz[j][i];     // columnas es j y luego i
            }

        }
        return sumCol;
    }

    public boolean valFilas(int filaUno, int[][] matriz) {
        boolean sw = false;
        int aux = filaUno;

        for (int i = 1; i < matriz.length && filaUno == aux; i++) {     // i = 1 porque la primera fila ya la tengo en filaUno
            aux = 0; // reinicio auxiliar
            for (int j = 0; j < matriz.length; j++) {
                aux += matriz[i][j];

            }
        }
        if (aux == filaUno) {
            sw = true;
        }

        return sw;
    }

    public boolean valCols(int colUno, int[][] matriz) {
        boolean sw = false;
        int aux = colUno;
        //System.out.println(colUno + "AQUIIIII " );
        for (int i = 1; i < matriz.length && colUno == aux; i++) {
            aux = 0; // reinicio auxiliar
            for (int j = 0; j < matriz.length; j++) {       // j = 1 porque la primera col ya esta sumada
                aux += matriz[j][i];

            }
        }

        if (aux == colUno) {
            sw = true;
        }
        
        return sw;
    }

    public void proceso(int[][] matriz, int filaReferencia, int colReferencia) {
        if (filaReferencia == colReferencia) {

            boolean sumFilas = valFilas(filaReferencia, matriz);
            boolean sumCols = valCols(colReferencia, matriz);

            if (sumFilas == sumCols) {
                System.out.println("ES UN CUADRADO MÁGICO");

            } else {
                System.out.println("NO ES UN CUADRADO MÁGICO");
                
            }

        } else {
            System.out.println("NO ES UN CUADRADO MÁGICO");
        }

    }

    public Ejercicio2_4() {

        int[][] matriz = leerMatriz();
        int filaReferencia = sumFila(matriz);       // sumatorio de la primera fila
        int colReferencia = sumCol(matriz);         // sumatorio de la primera columna

        proceso(matriz, filaReferencia, colReferencia);

    }

    public static void main(String[] args) {

        Ejercicio2_4 RandomName = new Ejercicio2_4();

    }

}

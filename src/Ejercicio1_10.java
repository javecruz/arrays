
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


/*10.
Modificar la función ya vista en clase de fibonacci para que almacene cada uno de los términos calculados en una 
posición de un array.*/
public class Ejercicio1_10 {
    
    
    static Scanner tec = new Scanner(System.in);
    
    
    static void proceso () {
    
    
        int[] listaFibonacci = new int[10];  // cambiar si quieres más valores de fibonacci
        
        
        listaFibonacci[0] = 0;   // INICIALIZO LOS DOS PRIMEROS VALORES
        listaFibonacci[1] = 1;
        
        
        for(int i = 2;i<listaFibonacci.length;i++) {
           listaFibonacci[i] = (listaFibonacci[i -1] + listaFibonacci[i-2]);
        
        }
    
        for(int i=0;i<listaFibonacci.length;i++){
        
            System.out.println(listaFibonacci[i]);
        
        }
        
        
    }
    
    public Ejercicio1_10() {
    
    proceso();
    
    }
    
    
    public static void main(String[] args) {
    
    Ejercicio1_10 RandomName = new Ejercicio1_10();
    }
    
}

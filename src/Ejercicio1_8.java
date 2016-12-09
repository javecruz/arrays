
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

/*Introducir una secuencia de 50 números, cuyos valores están comprendidos entre 1 y 10. Queremos saber al final
que números del 0 al 10 no han sido introducidos.*/
public class Ejercicio1_8 {
    
    
     static Scanner tec = new Scanner(System.in);
    
    static int[] leerArray() {

        int[] listaNumeros = new int[50];   // Modificar aqui para el rango del array

        for (int i = 0; i < listaNumeros.length; i++) {

            do {
                System.out.println("Dame el numero " + (i+1));
                listaNumeros[i] = tec.nextInt();
                if (listaNumeros[i] < 0 || listaNumeros[i] > 10) {         // VALIDACIÓN
                    System.out.println("NUMERO ERRÓNEO, debe estar entre 0 y 10");
                }

            } while (listaNumeros[i] < 0 || listaNumeros[i] > 10);

        }
        return listaNumeros;
    }
    
    
    
    static void proceso(int[] lista) {
    
    int[] listaNum = lista;
    boolean cero = false;   // el ejercicio no pedia el 0, pero yo lo he puesto.
    boolean uno = false;
    boolean dos = false;
    boolean tres = false;
    boolean cuatro = false;
    boolean cinco = false;
    boolean seis = false;
    boolean siete = false;
    boolean ocho = false;
    boolean nueve = false;
    boolean diez = false;
    boolean todos = false;
    
    
    for (int i = 0;i<listaNum.length;i++) {
    
    switch (listaNum[i]) {
    
        case 0:                 // el ejercicio no pedia el 0, pero yo lo he puesto.
            cero = true;
            break;
        case 1:
            uno = true;
            break;
        case 2:
            dos = true;
            break;
        case 3:
            tres = true;
            break;
        case 4:
            cuatro = true;
            break;
        case 5:
            cinco = true;
            break;
        case 6:
            seis = true;
            break;
        case 7:
            siete = true;
            break;
        case 8:
            ocho = true;
            break;
        case 9:
            nueve = true;
            break;
        case 10:
            diez = true;

    }
    
    }
    
    if (cero==true && uno==true && dos==true && tres==true && cuatro==true && cinco==true && seis==true && siete==true && ocho==true && nueve==true && diez==true)
            System.out.println("Estan todos los números del 0 al 10");
    
    
    
    if (cero==false) {
            System.out.println("Falta el 0");
}
    
      if (uno==false) {
            System.out.println("Falta el 1");
}
    
        if (dos==false) {
            System.out.println("Falta el 2");
}
    
          if (tres==false) {
            System.out.println("Falta el 3");
}
    
      if (cuatro==false) {
            System.out.println("Falta el 4");
}
    
      if (cinco==false) {
            System.out.println("Falta el 5");
}
    
        if (seis==false) {
            System.out.println("Falta el 6");
}
    
      if (siete==false) {
            System.out.println("Falta el 7");
}
    
          if (ocho==false) {
            System.out.println("Falta el 8");
}
    
      if (nueve==false) {
            System.out.println("Falta el 9");
}
          if (diez==false) {
            System.out.println("Falta el 10");
}
    
        
    }
    
    
    public Ejercicio1_8() {
    
        int[] lista = leerArray();
        proceso(lista);
    
    }
    
    
    public static void main (String[] args) {
    
    
    Ejercicio1_8 RandomName = new Ejercicio1_8();
    }
    
}

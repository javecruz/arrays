
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

/*5. Crea un array con los nombres de 20 alumnos, para finalizar antes de introducir los 20
nombres, pulsamos “F” o “f”.*/
public class Ejercicio2_5 {

    public String[] leerArray() {
        String[] listaNombres = new String[10]; // pide 20, pongo 10 para cabar antes
        Scanner tec = new Scanner(System.in);

        boolean sw = false;
        for (int i = 0; i < listaNombres.length && sw == false; i++) {
            System.out.println("Dame nomnbre, si quieres salir escribe f o F");
            listaNombres[i] = tec.nextLine();
            if (listaNombres[i].equals("f") || listaNombres[i].equals("F")) {
                listaNombres[i] = null;
                sw = true;
            }

        }

        return listaNombres;
    }
    
    
    public void proceso(String[] lista) {
    
    for(int i=0; i<lista.length;i++){
        System.out.println(lista[i]);
    
    }
    
    }
    
    public Ejercicio2_5(){
    
    String[] array = leerArray();
    proceso(array);
    }
    
    
    public static void main(String[] args) {
    
    Ejercicio2_5 RandomName = new Ejercicio2_5();
    
    }
    }



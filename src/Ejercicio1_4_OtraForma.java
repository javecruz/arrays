

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
//Codifica un programa Java que lea un array de 10 elementos e intercambie el elemento mayor con el último.
public class Ejercicio1_4_OtraForma {
 
    static Scanner tec = new Scanner(System.in);
 
    public void leerArray(int [] listaSinOrdenar, int [] listaOrdenada) {
 
 
        for (int i = 0; i < listaSinOrdenar.length; i++) {
            int aux;
            System.out.println("Dame el numero de la posicion " + (i + 1));
            aux = tec.nextInt();
            listaSinOrdenar[i] = aux;
            listaOrdenada[i] = aux;
        }
       
        /*System.out.println("LISTA ORIGINAL:");
       for(int i=0;i<listaNum.length;i++) {
           System.out.println(listaNum[i]);
       }*/
       
       
    }
   
    static int[] ordenarArray(int[] lista) {
   
        for (int i=0;i<(lista.length-1);i++) {
            for(int j=i+1;j<lista.length;j++) {
                if (lista[i]>lista[j]) {
                    int auxiliar = lista[i];
                    lista[i]=lista[j];
                    lista[j]=auxiliar;
                }
            }    
        }
 
        /*System.out.println("");
        System.out.println("LISTA ORDENADA");
       for(int i=0;i<lista.length;i++) {
           System.out.println(lista[i]);
       }*/
       
    return lista;
    }
   
   
    static void imprimir(int[] sinOrdenar, int[] ordenada) {        // no lo uso, lo dejo para verlo como ejemplo para mi.
   
        System.out.println("LISTA ORIGINAL:");
       for(int i=0;i<sinOrdenar.length;i++) {
           System.out.println(sinOrdenar[i]);
       }
        System.out.println("");
        System.out.println("LISTA ORDENADA");
       for(int i=0;i<ordenada.length;i++) {
           System.out.println(ordenada[i]);
       }
    }
   
   
    public Ejercicio1_4_OtraForma() {
   
    int[] listaSinOrdenar = new int [10];
    int[] listaOrdenada = new int [10];
    leerArray(listaSinOrdenar, listaOrdenada);
    ordenarArray(listaOrdenada);
    imprimir(listaSinOrdenar, listaOrdenada);
 
    }
   
    public static void main(String[] args){
   
    Ejercicio1_4 randomName = new Ejercicio1_4();
   
    }
 
}

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
public class Ejercicio1_4 {

    static Scanner tec = new Scanner(System.in);

    static int[] leerArray() {

        int[] listaNum = new int[10];

        for (int i = 0; i < listaNum.length; i++) {

            System.out.println("Dame el numero de la posicion " + (i + 1));
            listaNum[i] = tec.nextInt();
        }
        
        System.out.println("LISTA ORIGINAL:");
       for(int i=0;i<listaNum.length;i++) {
           System.out.println(listaNum[i]);
       }
        
        
        return listaNum;
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

        System.out.println(""); 
        System.out.println("LISTA ORDENADA");
       for(int i=0;i<lista.length;i++) {
           System.out.println(lista[i]);
       }
        
    return lista;
    }
    
    
    /*static void imprimir(int[] sinOrdenar, int[] ordenada) {        // no lo uso, lo dejo para verlo como ejemplo para mi.
    
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
    */
    
    public Ejercicio1_4() {
    
    int[] listaSinOrdenar = leerArray();
    //int[] listaOrdenada = listaSinOrdenar;
    //ordenarArray(listaOrdenada);
    ordenarArray(listaSinOrdenar);
    //imprimir(listaSinOrdenar, listaOrdenada);
  
    }
    
    public static void main(String[] args){
    
    Ejercicio1_4 randomName = new Ejercicio1_4();
    
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class Ejercicio1_3 {
/* 3. Codifica un programa Java que lea las temperaturas del mes de Enero y calcule y visualice:
- Temperatura media
- La temperatura más baja
- Cuantos días han tenido temperaturas superiores a la media */
    
    static Scanner tec = new Scanner(System.in);
    
    
    public static double[] leerArray() {
    
        double[] conjunto = new double[10];
        int i;
    
        for(i=0;i<conjunto.length;i++) {
        
            System.out.println("Dame la temperatura del dia " + (i+1) + " de Enero");
            conjunto[i] = tec.nextInt();
        }
    return conjunto;
    }
    
    public static double calcMedia(double conjunto[]) {
    
    
    
    double sum = 0;
    double media;
    for(int i=0;i<conjunto.length;i++) {
        sum += conjunto[i];   
        }
    media = sum/conjunto.length;
    
        System.out.println("La media del més de Enero es " + media);
        
       return media;
    }
    
    public static void minima(double conjunto[]) {
    
    
    double min = conjunto[0];
    for (int i = 0;i<conjunto.length;i++) {
        
            if(min>conjunto[i]) {
            min = conjunto[i];
            }
        }
    System.out.println("La temperatura mínima del més de Enero es " + min);
    
    }
        
    
    
    
    public static void superiorMedia (double media, double conjunto[]) {
    
       
        //media = calcMedia(conjunto);
        
        for (int i = 0;i<conjunto.length;i++) {
        
            if (conjunto[i]>media) {
            
                System.out.println("El día " + (i+1) + " tuvo una temperatura superior a la media=" + media + " dia="+(conjunto[i]));
            }
        
        }
    }
    
    
    
    public Ejercicio1_3() {
    
        double a[] = leerArray();
        double media = calcMedia(a);
        minima(a);
        superiorMedia(media, a);
     
    }
    
    
    
    
    
 
    
    
    public static void main(String[] args) {
        Ejercicio1_3 RANDOMNAME = new Ejercicio1_3();
    }
    
    
}

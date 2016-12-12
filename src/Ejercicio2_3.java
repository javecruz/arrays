
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

/*3. Codifica un programa que lea el número de habitantes y extensión de 15 comarcas de la
Comunidad Valenciana y calcule:
a) Densidad de población de las 15 comarcas .Hb / Km2
b) Número de la comarca de menor extensión
c) ¿Hay alguna comarca con menos de 10.000 habitantes?
d) Cuantas comarcas tienen una densidad de población superior a la media aritmética.*/
public class Ejercicio2_3 {

    static String[] comarcas = {"Els Ports", "El Baix Maestrat", "Los Serranos", "El Camp del Turia", "La Xafor", "El Comptat", "L'Alcoia", "L'Alacant", "Valencia", "Baix Vinalopo", "Alt Millars", "La Vall de Albaida", "La Canal de Navarrés", "La Plana Alta", "La Costera"};      // aqui pongo este array estatico porque me va a servir de guia, además los inicializo, podria crear un método para meter las comarcas de 1 en 1 pero bueno.. no lo pide explicitamente.

    public int[][] leerMatriz() {       // aqui va a leer el número de habitantes y extensión, lo haré con numeros random para agilizar las pruebas.

        int[][] m = new int[15][2];   // 15 filas, 2 columnas, Primera Columna = numero habitantes y Segunda Columna = extension
        Random rnd = new Random();

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                if (j == 0) {   // esto hace que en la columna 0 meta los habitantes
                    m[i][j] = (int) (rnd.nextDouble() * 100000 + 1000);        // me va a generar un numero de habitantes aleatorio de minimo 1000 hasta 1000+100000

                } else {  // esto hace que en la columna 1 meta los km/2
                    m[i][j] = (int) (rnd.nextDouble() * 1000 + 100);        // me generara unos km/2 aleatorios desde 100 hasta 1100.
                }
            }
        }

        System.out.println("HABITANTES\t\t\t\tKILOMETROS m2:");         // imprimo para ver si todo está bien.. me servirá para luego comprobar los metodos posteriores
        for (int i = 0; i < m.length; i++) {
            System.out.print(comarcas[i] + ": ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t\t\t\t");
            }
            System.out.println("");
        }

        return m;
    }

    public int[] calcDensidad(int[][] matriz) {
        System.out.println("\nDENSIDADES");

        int[] densidad = new int[comarcas.length];

        for (int i = 0; i < densidad.length; i++) {        // empiezo a meter densidades en un array, la densidad de i=0 corresponde con la comarca i=0.
            densidad[i] = (matriz[i][0] / matriz[i][1]);
        }

        for (int i = 0; i < comarcas.length; i++) {
            System.out.println("La comarca: " + comarcas[i] + " posee una densidad de " + densidad[i]);     // 0 = habitantes y 1 = kilometros m2

        }
        //System.out.println("\n");
        return densidad;
    }

    public void menorExtension(int[][] matriz) {

        int menor = 0;
        String menorAux = "";

        for (int i = 0; i < comarcas.length; i++) {
            if (i == 0) {
                menor = matriz[i][1];   // la segunda dimension siempre es 1 porque 1 = extension y 0 = habitantes.
                menorAux = comarcas[i];     // el ejercicio me pide la comarca no la extension, asi que tengo que ir guardando qué comarca es la que tiene menor extension..
            } else if (menor > matriz[i][1]) {
                menor = matriz[i][1];
                menorAux = comarcas[i];
            }
        }

        System.out.println("\nLa comarca " + menorAux + " es la comarca con la menor extensión de todas con " + menor + "km2.\n");

    }

    public void menosHabitantes(int[][] matriz) {

        boolean sw = false;

        
      
            for (int i = 0; i < comarcas.length && sw==false; i++) {

                if (matriz[i][0] < 10000) {
                    
                    sw = true;        
                    
                }
            }
            
            if (sw==true){
            
            System.out.println("SI se ha encontrado alguna comarca con menos de 10000 habitantes.\n");
            }else{
            System.out.println("NO se ha encontrado ninguna comarca con menos de 10000 habitantes.\n");
            }
            
    }
    
    /*public void valorar(boolean valoracion) {
    if(valoracion==true){
    System.out.println("SI hay comarcas con menos de 10000 habitantes.\n");
    }else{
    System.out.println("NO se ha encontrado ninguna comarca con menos de 10000 habitantes.\n");
    }
    
    }*/

    public void superiorMedia(int[] densidad) {

        int sum = 0; // sumatorio para calcular media
        int cont = 0; // contador para saber cuantas comarcas superan la media

        for (int i = 0; i < comarcas.length; i++) { // calculo media de densidad
            sum += densidad[i];
        }
        System.out.println("La media de densidad de las " + comarcas.length + " comarcas es de " + (sum / comarcas.length));

        for (int i = 0; i < comarcas.length; i++) {
            if (densidad[i] > (sum / comarcas.length)) {
                System.out.println("La comarca " + comarcas[i] + " supera la media con " + densidad[i]);
                cont++;
            }

        }
        System.out.println("Hay un total de " + cont + " comarcas que superan la media de densidad.");

    }

    public Ejercicio2_3() {

        int[][] matriz = leerMatriz(); // aqui esta los habitantes y las densidades
        int[] densidad = calcDensidad(matriz);
        menorExtension(matriz);
        menosHabitantes(matriz);
        //valorar(sw);
        superiorMedia(densidad);
    }

    public static void main(String[] args) {

        Ejercicio2_3 RandomName = new Ejercicio2_3();

    }

}

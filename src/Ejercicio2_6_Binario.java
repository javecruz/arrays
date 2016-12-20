
//import java.util.Random;
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
/*Desarrolla un algoritmo que cargue en memoria los nombre y nº de teléfono de 15
personas y nos permita consultar (secuencial y binaria) un nº de teléfono introduciendo el
nombre de una persona determinada. Para finalizar la consulta introduciremos una ‘N’ o ‘n’*/
public class Ejercicio2_6_Binario {

    public Scanner tec = new Scanner(System.in);

    public String[] leerNombres() {
        String[] nombres = new String[10]; // pide mas, pongo menos para acabar antes de comprobarlo
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dame nombre");
            nombres[i] = tec.nextLine();

        }

        System.out.println("LISTA ORIGINAL");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        
        
        return nombres;
    }
    
    public String[] ordenarArrayOriginal(String[] arrayOriginal) {

        String[] arrayOrdenado = new String[arrayOriginal.length];

        
        for (int i = 0; i < arrayOriginal.length; i++) {           // quiero mantener el array original, asi que creo otro igual que será el que modificaré
            arrayOrdenado[i] = arrayOriginal[i];
        }

        for (int i = 0; i < (arrayOrdenado.length-1); i++) {
            for (int j = (i+1); j < arrayOrdenado.length; j++) {
                if (arrayOrdenado[i].compareToIgnoreCase(arrayOrdenado[j])>0) {
                    String aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = aux;
                }

            }

        }
        System.out.println("\nLISTA ORDENADA");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }

        return arrayOrdenado;
    }
    
    
    
    

    public String[] leerTelefonos(String[] listaNombresOrdenados) {
        //Random rnd = new Random();
        String[] telefonos = new String[listaNombresOrdenados.length];
        System.out.println("LISTA TELEFONOS");
        for (int i = 0; i < telefonos.length; i++) {
            //telefonos[i] = tec.nextLine();

            System.out.println("Dame el telefono de " + listaNombresOrdenados[i]);
            telefonos[i] = tec.nextLine();
            if (telefonos[i].length() != 9) {       // se puede validar añadiendole más cosas pero vamos.. es echarle tiempo.. ej; que empieze por 6 o por 7 etc etc
                do {
                    System.out.println("Error, número erróneo, escribalo otra vez");      // no va a saltar porque los genero aleatoriamente para agilizar el proceso..
                    telefonos[i] = tec.nextLine();
                } while (telefonos[i].length() != 9);
            }
        }

        return telefonos;
    }

    public String pedirNombre(String[] listaNombresOrdenados) {
        String buscar = "";

        System.out.println("LISTA DE NOMBRES");
        for (int i = 0; i < listaNombresOrdenados.length; i++) {
            System.out.println(listaNombresOrdenados[i]);
        }

        System.out.println("\nDe quién quieres el número de telefono?");
        buscar = tec.nextLine();

        boolean sw = false;

        do {         // validación del nombre a buscar
            for (int i = 0; i < listaNombresOrdenados.length; i++) {
                if (listaNombresOrdenados[i].equalsIgnoreCase(buscar)) {
                    
                    sw = true;
                }

            }
            if (sw == false) {
                System.out.println("El nombre intrudocido es ERRÓNEO comprueba la lista más arriba y vuelve a introducir el nombre a continuación");
                buscar = tec.nextLine();
            }

        } while (sw == false);

        return buscar;
    }

    // BUSQUEDA BINARIA         podria poner las 2 busquedas aqui, pero voy a separarlo en 2 clases y cada una tendra un tipo de busqueda..
    public void buscarNumero(String[] listaOrdenada, String[] telefonos, String buscaNombre) {
        
        int low = 0;
        int high = listaOrdenada.length - 1;
        boolean encontrado = false;
        
       
        while (encontrado==false) {     // el nombre esta validado, es decir, ha puesto uno que existe en el array por lo tanto la unica condicion del while es que sea falso.
            int middle = (low + high) / 2;
            if (listaOrdenada[middle].equalsIgnoreCase(buscaNombre)) {
                System.out.println("El número de teléfono de " + listaOrdenada[middle] + " es " + telefonos[middle] );
            encontrado = true;
            }
            else if (listaOrdenada[middle].compareToIgnoreCase(buscaNombre)<0) {
                low = middle + 1;

            } else {
                
                    high = middle -1;
            }
        }
        
        
    

    }

    public Ejercicio2_6_Binario() {
       
        String[] nombresSinOrdenar = leerNombres();
        String[] nombresOrdenados = ordenarArrayOriginal(nombresSinOrdenar);
        String[] listaTelefonos = leerTelefonos(nombresOrdenados);
        String nombreParaBuscar = pedirNombre(nombresOrdenados);
        buscarNumero(nombresOrdenados, listaTelefonos, nombreParaBuscar);

    }

    public static void main(String[] args) {

        Ejercicio2_6_Binario RandomName = new Ejercicio2_6_Binario();
    }

}

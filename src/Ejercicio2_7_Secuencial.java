
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
/*Igual que el anterior pero comprobando en cada entrada que el nombre introducido no
está repetido.*/
public class Ejercicio2_7_Secuencial {

    public Scanner tec = new Scanner(System.in);

    public String[] leerNombres() {
        String[] nombres = new String[10]; // pide mas, pongo menos para acabar antes de comprobarlo
        Scanner tec = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dame nombre de " + i);
            nombres[i] = tec.nextLine();

            if (i > 0) {    // no entrará en el primer pues no hay con quien comparar

                for (int j = 0; j < i; j++) { // sólo comprobará hasta el último indice indicado
                    if (nombres[i].equalsIgnoreCase(nombres[j])) {
                        System.out.println("ERROR, Nombre ya introducido por favor vuelva a escribir otro distinto");
                        nombres[i] = tec.nextLine();
                    }
                }

            }

        }

        return nombres;
    }

    public String[] leerTelefonos(String[] listaNombres) {
        //Random rnd = new Random();
        String[] telefonos = new String[listaNombres.length];
        System.out.println("LISTA TELEFONOS");
        for (int i = 0; i < telefonos.length; i++) {
            //telefonos[i] = tec.nextLine();

            System.out.println("Dame el telefono de " + listaNombres[i]);
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

    public String pedirNombre(String[] listaNombres) {
        String buscar = "";

        System.out.println("LISTA DE NOMBRES");
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println(listaNombres[i]);
        }

        System.out.println("\nDame el nombre a buscar");
        buscar = tec.nextLine();

        boolean sw = false;

        do {         // validación del nombre a buscar
            for (int i = 0; i < listaNombres.length; i++) {
                if (listaNombres[i].equalsIgnoreCase(buscar)) {
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

    // BUSQUEDA SECUENCIAL         podria poner las 2 busquedas aqui, pero voy a separarlo en 2 clases y cada una tendra un tipo de busqueda..
    public void proceso(String[] nombres, String[] telefonos, String buscar) {

        for (int i = 0; i < nombres.length; i++) {
            if (buscar.equalsIgnoreCase(nombres[i])) {
                System.out.println("El número de telefono de " + nombres[i] + " es " + telefonos[i]);
            }
        }

    }

    public Ejercicio2_7_Secuencial() {
        String[] listaNombres = leerNombres();
        String[] listaTelefonos = leerTelefonos(listaNombres);
        String buscar = pedirNombre(listaNombres);
        proceso(listaNombres, listaTelefonos, buscar);

    }

    public static void main(String[] args) {

        Ejercicio2_7_Secuencial RandomName = new Ejercicio2_7_Secuencial();
    }

}

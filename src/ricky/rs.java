package ricky;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class rs {
    public static void println(){
        System.out.println();
    }
    public static void println(Object linea){
        System.out.println(linea);
    }
    public static void print(Object linea){
        System.out.print(linea);
    }
    public static String leer() {
        return System.console().readLine();
    }
    public static String leer(Object linea) {
        print(linea);
        return System.console().readLine();
    }
    public static int entero(String texto){
        return Integer.parseInt(texto);
    }
    public static float flotante(String texto){
        return Float.parseFloat(texto);
    }
    public static long enteroGrande(String texto){
        return Long.parseLong(texto);
    }
    public static double flotanteGrande(String texto){
           return Double.parseDouble(texto);
    }
    public static String sinCorchetes(ArrayList<?> lista) {
        return lista.toString().substring(1, lista.toString().length()-1);
    }
    public static String sinCorchetes(LinkedList<?> lista) {
        return lista.toString().substring(1, lista.toString().length()-1);
    }
    public static BufferedReader archivoLectura;
    public static BufferedWriter archivoEscritura;
    public static void asignarArchivoLectura(String ruta) throws FileNotFoundException{
        archivoLectura = new BufferedReader(new FileReader(ruta));
    }
    public static void asignarArchivoLectura(File ruta) throws FileNotFoundException{
        archivoLectura = new BufferedReader(new FileReader(ruta));
    }
    public static void asignarArchivoEscritura(String ruta) throws IOException{
        archivoEscritura = new BufferedWriter(new FileWriter(ruta));
    }
    public static void asignarArchivoEscritura(File ruta) throws IOException{
        archivoEscritura = new BufferedWriter(new FileWriter(ruta));
    }
}

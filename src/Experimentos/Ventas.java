package Experimentos;
import java.util.Random;

import ricky.rs;

// registrar un cierto numero de ventas y mostrar las ventas mayores de 2k
public class Ventas {
    public static void main(String[] args) {
        mayoresDe2000(llenarArreglo(cantidadVentas(),menu()));
    }

    static void mayoresDe2000(float[] arr){
        int x = 0, n = 0;
        rs.println("\nVentas Mayores a 2000");
        for (float f : arr) {
            if(f > 2000){
                rs.println(String.format("Venta %d: %.2f", ++x, f));
                n++;
            }
            else
                x++;
        }
        rs.println(n == 0 ? "No hay":"");
    }

    static float[] llenarArreglo(int cantidad, int modo) {
        float[] arr = new float[cantidad];
        Random rand = new Random();
        if(modo == 1)
            rs.println("Ingrese las Ventas del mes");
        for (int i = 0; i < arr.length; i++) {
            if(modo == 1){
                rs.print(String.format("Venta %d: ", i+1));
                arr[i] = comprobarFlotante();
            }
            else
                arr[i] = rand.nextInt(10000);
        }
        if(modo == 2){
            rs.println("Ventas del mes:");
            imprimirArreglo(arr);
            rs.println();
        }
            
        return arr;

    }

    static void imprimirArreglo(float[] n){
        int x = 0;
        for (float f : n) {
            rs.println(String.format("Venta %d: %.2f", ++x, f));
        }
    }

    static int menu(){
        while(true) {
            rs.println("LISTA DE OPCIONES!!!");
            rs.println("1) MANUAL!!!");
            rs.println("2) AUTOMÁTICO!!!");
            int opcion = comprobarEntero();
            if(opcion == 1 || opcion == 2)
                return opcion;
        }
    }

    static int comprobarEntero(){
        int n;
        while (true) {
            try {
                n = rs.entero(rs.leer());
            } catch (Exception e) {
                rs.println("Error al Procesar el número. Vuelva a intentarlo");
                continue;
            }
            return n;
            
        }
        
    }
    static float comprobarFlotante(){
        float n;
        while (true) {
            try {
                n = rs.flotante(rs.leer());
            } catch (Exception e) {
                rs.println("Error al Procesar el número. Vuelva a intentarlo");
                continue;
            }
            return n;
            
        }
        
    }

    static int cantidadVentas(){
        while (true) {
            rs.print("Ingrese la cantidad de ventas: ");
            int cantidad = comprobarEntero();
            if(cantidad > 0)
                return cantidad;
            rs.println("Ingrese una cantidad más grande");
        }
        
    }
}

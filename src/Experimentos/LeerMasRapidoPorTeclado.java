package Experimentos;
public class LeerMasRapidoPorTeclado {
    public static void main(String[] args) {
        int cantidad = entero(leer()), suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += i + 1;
        }
        HacerMasCortoElPrint.println(suma);
    }
    static String leer() {
        return System.console().readLine();
    }
    static int entero(String texto){
        return Integer.parseInt(texto);
    }
}

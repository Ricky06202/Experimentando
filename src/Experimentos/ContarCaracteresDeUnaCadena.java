package Experimentos;
import ricky.rs;

/**
 * ContarCaracteresDeUnaCadena
 */
public class ContarCaracteresDeUnaCadena {

    public static void main(String[] args) {
        String oracion = "DA.M I.T'S h.ar.d";
        rs.println(oracion.chars().filter(c -> c == '.').count());
        char a = 'a';
        rs.println(oracion.contains(Character.toString(a))); 
    }
}
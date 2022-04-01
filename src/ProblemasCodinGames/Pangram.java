package ProblemasCodinGames;

import ricky.rs;

public class Pangram {
    public static void main(String[] args) {
        String oracion = rs.leer("Ingrese una oracion: ").toLowerCase();
        String abc = "qwertyuiopasdfghjklzxcvbnm";
        boolean esPangram = true;
        for (char s : abc.toCharArray()) {
            if(!oracion.contains(Character.toString(s)))
                esPangram = false; 
        }
        rs.println(esPangram);
    }
}

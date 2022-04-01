package ProblemasCodinGames;

import ricky.rs;

public class PiramideConCubos {
    public static void main(String[] args) {
        int N = rs.entero(rs.leer("Ingrese la Cantidad de Cubos disponibles: "));
        int H = 0, x = 1;
        while(true){
            if(N - x >= 0)
                N -= x;
            else
                break;
            H++;
            x++;
        }
        rs.println(String.format("%d %d", H, N));
    }
}

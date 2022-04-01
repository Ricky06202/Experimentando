package KarolitaAprende;

import ricky.rs;

public class Numero1 {
    Numero1(){
        rs.println("factorial de un numero: ");
        arboledaLindaVista();
        rs.println("Capuchino frio");
    }
    public static void main(String[] args) {
        Numero1 a = new Numero1();
        rs.println(a.cartitasMagicas() * 23 % 33); 
    }
    void escuelitaBonita(int[][] manzana){
        for (int[] rebanada : manzana) {
            for (int semillas : rebanada) { 
                rs.print(semillas + " ");
            }
        }
    }
    void arboledaLindaVista(){
        int[][] superHerues = new int[5][5];
        for (int i = 0; i < superHerues.length; i++) {
            for (int j = 0; j < superHerues[0].length; j++) {
                superHerues[i][j] = cartitasMagicas();
            }
        }
        escuelitaBonita(superHerues);
    }
    int cartitasMagicas(){
        return rs.entero(rs.leer()); 
    }
}

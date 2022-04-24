package Experimentos;
import ricky.rs;

public class calcularHora {
    public static void main(String args[]) {
        int s = rs.entero(rs.leer());
        s += s < 0 ? 86400 : 0; 
        int h = s / 3600;
        s -= h * 3600;
        int m = s / 60;
        s -= m * 60;
        h %= 24;

        String hora = h < 10 ? "0"+h : ""+h;
        hora = h == 13 ? "EE" : hora;
        String min = m < 10 ? "0"+m : ""+m;
        min = m == 13 ? "EE" : min;
        String seg = s < 10 ? "0"+s : ""+s;
        seg = s == 13 ? "EE" : seg;
        rs.println(hora+":"+min+":"+seg);// EE=13
    }
}

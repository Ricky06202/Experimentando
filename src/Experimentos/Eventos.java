package Experimentos;
import ricky.rs;

public abstract class Eventos {
    
}
class Encendido extends Eventos {

}
class Apagado extends Eventos{

}
class usar{
    public static void main(String[] args) {
        Eventos n = new Encendido();
        if(n.getClass() == new Apagado().getClass()) {
            rs.println("Encendiendo");
            // n = new Encendido();
        }

        if(n.getClass() == new Encendido().getClass()) {
            rs.println("Apagando...");
            // n = new Apagado();
        }
    }
}

package Experimentos;

public class Encapsulamiento {
    private int edad;
    // private int hora;
    // private String nombre;
    // private String cumpleaños;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
        Encapsulamiento a = new Encapsulamiento();
        Encapsulamiento.practica b = a.new practica();
        Encapsulamiento.practica.practiquita c = b.new practiquita();
        c.new practicasa();
    }
    
    class practica{
        practica(){
            var e = new Encapsulamiento();
            e.setEdad(22);
            int a = e.getEdad();
            System.out.println(a);
        }
        class practiquita{
            practiquita(){
                var e = new Encapsulamiento();
                e.setEdad(22);
                int a = e.getEdad();
                System.out.println(a);
            }
            class practicasa{
                practicasa(){
                    var e = new Encapsulamiento();
                    e.setEdad(22);
                    int a = e.getEdad();
                    System.out.println(a);
                }
            }
        }
    }
}

class hola{
    hola(){
        var e = new Encapsulamiento();
        e.setEdad(22);
        int a = e.getEdad();
        System.out.println(a);
    }
}

package Experimentos;
public class HacerMasCortoElPrint {
    public static void main(String[] args) {
        println(4 + 4);
        print("hola ");
        print("como ");
        print("estas \n");
        //printf("%d %d hola q tal %s",new Object[]{24,34,"Jaime"});
        System.out.printf("%d %d hola q tal %s",24,34,"Jaime");
    }
    static void println(Object linea) {
        System.out.println(linea);
    }
    static void print(Object linea) {
        System.out.print(linea);
    }
    /*static void printf(String format, Object[] linea) {
        System.out.printf(format, linea);
    }*/
}

package Experimentos;

/**
 * pasos para usar Usar lamdas
 * 1 - Necesitamos crear una interfaz
 * 2 - Necesitamos crear una funcion abstracta en la interfaz
 * 3 - crear una funcion dentro la clase que pida por parametro la interfaz
 * 4 - en el parametro donde se pidio la interfaz debemos aplicar el lamda
 * 5 - recordaar la estructura del lamda: (argumentos si los hay)->le damos la funcionalidad
 * si es largo (argumentos si los hay)->{
 * le damos la funcionalidad
 * en varias lineas}
 */
public class MasSobreLamdas {
    /**
     *  atributos de los metodos o de las variables o de las clases
     *  public, desde cualquier parte
     *  protected,  solo en su clase y subclases de otros paquetes y en el propio, y el mismo paquete
     *  default, en este archivo y el mismo paquete
     *  private, solo en su clase
     */
    public static void main(String[] args) {
        int c = new MasSobreLamdas().calcularOperacion(4, 4, (a,b)->(int)Math.pow(a,b));
        System.out.println(c);
        int d = new MasSobreLamdas().calcularOperacion(3, 6, (a,b)->{
            int mulplicar = 1;
            for (int i = 0; i < b; i++) {
                mulplicar *= a;
            }
            return mulplicar;
        });
        System.out.println(d);

    }
    int calcularOperacion(int num1, int num2, Accion suma){
        return suma.operacion(num1, num2);
    }
}

interface Accion{
    int operacion(int num1, int num2);
}
package Experimentos;
import javax.swing.JButton;

public class UsandoLamdas{
    public static void main(String[] args) {
        
        JButton b = new JButton("Cerrar");
        b.addActionListener((ActionEvent) -> System.exit(0));
    }
    
}
/**
 * InnerUsandoLamdas
 */
class InnerUsandoLamdas {
    public static void main(String[] args) {
        int[] a = {8,3,4,6,1,8,5,3,1,5,7,4,2,5,6};
        calcularNumeros(a,(n)->n*2);
    }
    static void calcularNumeros(int[] a,Funcionalidad accion){
        for (int i = 0; i < a.length; i++) {
            a[i] = accion.calculo(a[i]);
            System.out.print(a[i] + " ");
        }
    }
}

/**
 * InnerUsandoLamdas_1
 */
interface Funcionalidad {
    int calculo(int num);
    
}


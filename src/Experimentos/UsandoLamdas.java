package Experimentos;
import javax.swing.JButton;

public class UsandoLamdas{
    public static void main(String[] args) {
        
        JButton b = new JButton("Cerrar");
        b.addActionListener((ActionEvent) -> System.exit(0));
    }
    
}


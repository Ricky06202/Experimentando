
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import ricky.rs;

public class GeneradorDeContrasenas extends JFrame{
    GeneradorDeContrasenas(){
        setVisible(true);
        setTitle("Generador De Contraseñas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(500,500));
        setResizable(false);
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.CYAN);
        add(p);
        
        JTextField t = new JTextField(50);
        //t.setOpaque(true);
        //t.setBackground(Color.GREEN);
        //t.setBorder(new EmptyBorder(100,0,100,0));
        //t.setAlignmentX(CENTER_ALIGNMENT);
        t.setFont(new Font(Font.SERIF,Font.ITALIC,40));
        t.setEditable(false);
        //t.setPreferredSize(t.getPreferredSize());
        t.setBounds(100, 100, 300, 60);
        p.add(t);


        JButton b = new JButton("GENERAR");
        //b.setBorder(new EmptyBorder(0,0,0,0));
        b.setFocusable(false);
        //b.setAlignmentX(CENTER_ALIGNMENT);
        b.setFont(new Font(Font.SERIF,Font.BOLD,40));
        //b.setPreferredSize(b.getPreferredSize());
        b.setBounds(100, 300, 300, 60);
        p.add(b);
        
        JLabel tcantidad = new JLabel("Cantidad De Caracteres");
        tcantidad.setBounds(100,250,300,40);
        tcantidad.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        p.add(tcantidad);

        JTextField cantidad = new JTextField("10");
        cantidad.setBounds(320, 250, 40,40);
        cantidad.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        
        cantidad.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                char c = e.getKeyChar();
                if ((c < '0' || c > '9') && c != '\b' || cantidad.getText().length() >= 2){
                    e.consume();
                }
                
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                
            }

        });
        p.add(cantidad);
        
        b.addActionListener(new ActionListener() {
    
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                t.setText(GenerarContraseña(rs.entero(cantidad.getText())));
            }
    
        });

        p.updateUI();
    }
    public static void main(String[] args) {
        new GeneradorDeContrasenas();
        rs.println("listo");
    }
    String GenerarContraseña(int longitud){
        String minusculas = "qwertyuiopasdfghjklñzxcvbnm";
        String mayusculas = minusculas.toUpperCase();
        String numeros = "1234567890";
        String simbolos = "!@#$%^&*()~-_=+[]{}/?<>\\|";
        String combinacion = "".concat(minusculas).concat(mayusculas).concat(simbolos).concat(numeros);
        Random r = new Random();
        String contraseña = "";
        for (int i = 0; i < longitud; i++) {
            contraseña += combinacion.charAt(r.nextInt(combinacion.length()));
        }
        return contraseña;
    }
}

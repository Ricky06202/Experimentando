import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipularArchivos {
    public static void main(String[] args) {
        String[] nombres = {"Caroline", "Amadito"};
        try {
            BufferedWriter b = new BufferedWriter(new FileWriter("Hola.txt"));
            b.write("Hola wenas\n");
            b.write("Como Estan");
            b.newLine();
            for (String nombre : nombres) {
                b.write("\n"+nombre);
            }
            b.close();
            
        } catch (IOException e) {

        }

        try {
            BufferedReader r = new BufferedReader(new FileReader("hola.txt"));
            String linea;
            while((linea = r.readLine()) != null) { // regresa null si se acaba el archivin
                System.out.println(linea);
            }
            r.close();
            
        } catch (IOException e) {

        }

    }
}

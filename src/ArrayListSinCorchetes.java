import java.util.ArrayList;

/**
 * ArrayListSinCorchetes
 */
public class ArrayListSinCorchetes {

    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        for (String s : "hola bienvenido a este mundo magico de aventuras".split(" ")) {
            palabras.add(s);
        }
        System.out.println(palabras.toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}
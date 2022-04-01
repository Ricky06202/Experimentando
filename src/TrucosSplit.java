import java.util.ArrayList;
import java.util.Arrays;

import ricky.rs;

public class TrucosSplit {
    public static void main(String[] args) {
        String regex = "Base = |, Altura = ";
        String medidasTexto = "Base = Base = Base = 23, Altura = 54";
        String[] medidasArray = medidasTexto.split(regex);
        for (String s : medidasArray)
            if (!s.equals("")) // con esto evadimos los espacios sobrantes
                rs.print(String.format("%s ", s));
        rs.println();

        ArrayList<String> medidasList = new ArrayList<>(Arrays.asList(medidasTexto.split(regex)));
        medidasList.removeAll(Arrays.asList("")); // elimina los espacios sobrantes
        rs.println(medidasList);
        rs.println(Arrays.asList(medidasTexto.split(regex))); // deja muchos espacios
    }
}

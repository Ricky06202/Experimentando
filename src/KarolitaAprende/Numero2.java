package KarolitaAprende;

import ricky.rs;

enum TiposDeDonas {
    glaceadas,
    rellenas,
    cubiertas,
    azucaradas,
    ricas,
    duras
}

public class Numero2 {
    Numero2(){
        String felicidad = rs.leer("como se siente usted hoy? ");
        if(felicidad.length() > 0)
            rs.println("Me alegro Tenga un buen dia :D");
        yourName();
    }
    public static void main(String[] args) {
        new Numero2();
    }

    void yourName() {
        switch (misticalPlace()) {
            case glaceadas:
                for (int i = 0; i < 5; i++) {
                    System.out.println("WENISIMAS!!!");
                }
                break;
            case rellenas:
                int i = 0;
                int x = i + 2;
                int y = x + 5;
                while (y > 0) {
                    System.out.println("Amazing!!!!!");
                    y--;
                }
                break;
            case cubiertas:
                for (int j = 0; j < 4; j++) {
                    for (int j2 = 0; j2 < 4; j2++) {
                        System.out.print("*^");
                    }
                    rs.println();
                }
                break;
            case azucaradas:
                //rs.println(1 + 2 == 3 && false ^ true || 33 % 3 == 10);
                break;
            case ricas:
                //rs.println(21 + 33 > 50 ? "Java" : "C");
                break;
            case duras:
                int o = 1;
                while (o < 2) {
                    for (int j = 0; j < 10; j++) {
                        rs.println("meh...");
                    }
                    o++;
                }
                break;
        }
    }

    TiposDeDonas misticalPlace() {
        int saludo = Integer.parseInt(System.console().readLine());
        saludo %= 6;
        if (saludo == 5)
            return TiposDeDonas.glaceadas;
        if (saludo == 4)
            return TiposDeDonas.rellenas;
        if (saludo == 3)
            return TiposDeDonas.cubiertas;
        if (saludo == 2)
            return TiposDeDonas.azucaradas;
        if (saludo == 1)
            return TiposDeDonas.ricas;
        return TiposDeDonas.duras;
    }
}
